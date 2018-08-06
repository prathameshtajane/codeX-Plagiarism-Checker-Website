package com.northeastern.msd.team102.plagiarismchecker.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

import com.northeastern.msd.team102.plagiarismchecker.entity.File;
import com.northeastern.msd.team102.plagiarismchecker.service.ReportService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.service.FileService;

/**
 * Controller class for File entity.
 */
@RestController
@RequestMapping("/rest/file")
public class FileController {

    @Autowired
    FileService fileService;

    @Autowired
    ReportService reportService;

    public static final Logger logger = Logger.getLogger(ReportController.class.getName());

    /**
     * getDistinctUsersForHw returns all the distinct users for that particular homework.
     * @param hwId Homework Id
     * @return a set of Users for that homework
     */
    @GetMapping("/getUser")
    public Set<User> getDistinctUsersForHw(@RequestParam("hwId") String hwId) {
        logger.log(Level.INFO, "Return distinct users for homework with id: " + hwId);
        Long hwID = Long.parseLong(hwId);
        Set<User> set = new HashSet<>();
        Map<Long, User> map = new HashMap<>();
        for (File file: fileService.findAllByHomeworkId(hwID)) {
            if(!map.containsKey(file.getUser().getId())) {
                map.put(file.getUser().getId(), file.getUser());
                set.add(file.getUser());
            }
        }
        return set;
    }

    /**
     * findAllFileForHomework returns all files for a given homework for a given course
     * @param userId  User Id for which the files are to be returned
     * @param courseId Course Id for which the files are to be returned
     * @param hwId Homework Id for which the files are to be returned
     * @return
     */
    @GetMapping("/findAllHomeworkForCourse")
    public List<File> findAllFileForHomework( @RequestParam("userId") String userId,
                                              @RequestParam("courseId") String courseId,
                                              @RequestParam("hwId") String hwId) {
        logger.log(Level.INFO, "File for userID: " + userId + "courseId: " + courseId + "and hwId: "
                + hwId);
        long userID = Long.parseLong(userId);
        long courseID = Long.parseLong(courseId);
        long hwID = Long.parseLong(hwId);
        return fileService.findAllFileForHomework(userID, courseID, hwID);
    }

    /**
     * uploadFile method uploads a multipart file to the database and generates a plagiarism report
     * of this file with all other files for that particular homework.
     * @param request MultipartHttpServletRequest
     * @param userId userId
     * @param hwId hwId
     * @param courseId courseId
     * @throws IOException
     */
    @PostMapping("/upload")
    public void uploadFile(MultipartHttpServletRequest request,  @RequestParam("userId") String userId,
                           @RequestParam("courseId") String courseId, @RequestParam("hwId") String hwId)
            throws IOException, URISyntaxException {
        logger.log(Level.INFO, "File uploaded for userID: " + userId + "courseId: " + courseId + "and hwId: "
                    + hwId);
        long userID = Long.parseLong(userId);
        long courseID = Long.parseLong(courseId);
        long hwID = Long.parseLong(hwId);
        Iterator<String> itr = request.getFileNames();
        while (itr.hasNext()) {
            String uploadedFile = itr.next();
            MultipartFile file = request.getFile(uploadedFile);
            String mimeType = file.getContentType();
            String filename = file.getOriginalFilename();
            byte[] bytes = file.getBytes();
            File newFile = new File(filename, bytes, mimeType);
            File fileUpload = fileService.uploadFile(newFile, userID, hwID, courseID);
            reportService.generateReport(userID, hwID, fileUpload);
        }
    }
}
