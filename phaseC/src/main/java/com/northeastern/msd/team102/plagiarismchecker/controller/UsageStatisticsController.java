package com.northeastern.msd.team102.plagiarismchecker.controller;
import com.northeastern.msd.team102.plagiarismchecker.entity.UsageStatistics;
import com.northeastern.msd.team102.plagiarismchecker.service.UsageStatisticsService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

/**
 * Controller class for UsageStatistics entity.
 */
@RestController
@RequestMapping("/rest/usagestatistics")
public class UsageStatisticsController {
    @Autowired
    private UsageStatisticsService usageStatisticsService;

    public static final Logger logger = Logger.getLogger(UsageStatisticsController.class.getName());

    /**
     * get all statistics of comparisons done by Professor with given userId
     * @param userId: ID of professor
     * @return list of usage statistics of professor
     */
    @GetMapping("/findAllUsageStatisticsSummary")
    public List<UsageStatistics> findAllUsageStatisticsSummary(@RequestParam("userId") String userId) {
        logger.log(Level.INFO, "Usage Statistics summary for professor with userId: "+ userId);
        long userID = Long.parseLong(userId);
        return usageStatisticsService.findAllUsageStatisticsByProfessor(userID);
    }

    /**
     * get all statistics of comparisons done by Professor with given userID
     * @return list of usage statistics of professor
     */
    @GetMapping("/findAllSummary")
    public List<UsageStatistics> findAllSummary() {
        logger.log(Level.INFO, "Usage Statistics summary for Admin");
        return usageStatisticsService.findAllUsageStatistics();
    }

    /**
     * save all usage statistics data
     * @param data
     */
    @PostMapping("/registerStats")
    public void registerStats(@RequestBody UsageStatistics data) {
        logger.log(Level.INFO, "Registering usage statistics summary for professor: "+ data.getProfessor().getFirstName());
        Date timestamp = new Date();
        usageStatisticsService.generateStatistics(timestamp, data.getProfessor(), data.getStudent(),
                data.getCourse(), data.getHomework(), data.getCompareCount(), data.getAlgoType());
    }
}
