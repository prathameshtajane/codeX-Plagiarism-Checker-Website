package com.northeastern.msd.team102.plagiarismchecker.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.northeastern.msd.team102.plagiarismchecker.entity.Report;
import com.northeastern.msd.team102.plagiarismchecker.service.ReportService;

/**
 * Controller class for Report entity.
 */
@RestController
@RequestMapping("/rest/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    public static final Logger logger = Logger.getLogger(ReportController.class.getName());

    /**
     * findAllReportSummary method which receives the request for fetching the plagiarism reports foa given user
     * and homework.
     * @param userId User Id
     * @param hwId Homework Id
     * @return returns all the reports for for this user and homework
     */
    @GetMapping("/findAllReportSummary")
    public List<Report> findAllReportSummary(@RequestParam("userId") String userId, @RequestParam("hwId") String hwId) {
        logger.log(Level.INFO, "Report summary for user with userId: "+ userId + "and homeworkId: " + hwId);
        long userID = Long.parseLong(userId);
        long hwID = Long.parseLong(hwId);
        return reportService.findAllReportSummary(userID, hwID);
    }

    /**
     * getDetailedReport method to get the plagiarised code snippet of the two files.
     * @param file1Id File id for the first file.
     * @param file2Id File id for the Second file.
     * @return Array of Strings containing the plagiarised code and the line numbers for the given files.
     */
    @GetMapping("/getDetailedReport")
    public String[] getDetailedReport (@RequestParam("file1Id") String file1Id, @RequestParam("file2Id")
            String file2Id) throws IOException {
        logger.log(Level.INFO, "Snippet for file1: "+ file1Id + "and file2: " + file2Id);
        long file1ID = Long.parseLong(file1Id);
        long file2ID = Long.parseLong(file2Id);
        return reportService.getDetailedReport(file1ID, file2ID);
    }
}
