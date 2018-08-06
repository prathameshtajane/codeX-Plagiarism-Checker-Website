package com.northeastern.msd.team102.plagiarismchecker.controller;

import com.northeastern.msd.team102.plagiarismchecker.entity.Homework;
import com.northeastern.msd.team102.plagiarismchecker.service.HomeworkService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for Homework entity.
 */
@RestController
@RequestMapping("/rest/homework")
public class HomeworkController {

    @Autowired
    private HomeworkService homeworkService;

    public static final Logger logger = Logger.getLogger(ReportController.class.getName());

    /**
     * createHomework method creates a new homework for a particular professor.
     * @param homework homework object to be created
     * @param userId userId for which the homework is created.
     * @return Homework
     */
    @PostMapping("/create")
    public Homework createHomework(@RequestBody Homework homework, @RequestParam("userId") String userId, @RequestParam("courseId") String courseId) {
        long userID = Long.parseLong(userId);
        long courseID = Long.parseLong(courseId);
        return homeworkService.createHomework(homework, userID, courseID);
    }

    /**
     * findAllHomeworkForUser method returns all the homework for a particular userID.
     * @param courseId courseId
     * @return returns all the homework for the particular userId.
     */
    @GetMapping("/findAllHomeworkForCourse")
    public List<Homework> findAllHomeworkForCourse (@RequestParam("courseId") String courseId) {
        long courseID = Long.parseLong(courseId);
        return homeworkService.findAllByCourseId(courseID);
    }
}
