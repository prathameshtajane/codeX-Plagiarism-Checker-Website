package com.northeastern.msd.team102.plagiarismchecker.controller;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.service.CourseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for Course entity.
 */
@RestController
@RequestMapping("/rest/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    public static final Logger logger = Logger.getLogger(CourseController.class.getName());

    /**
     * findAllCoursesForUser method returns all the course for a particular userID.
     * @param userId userId
     * @return returns all the course for the particular userId.
     */
    @GetMapping("/findAllCoursesForUser")
    public List<Course> findAllCoursesForUser (@RequestParam("userId") String userId) {
        long userID = Long.parseLong(userId);
        return courseService.findAllByUserId(userID);
    }

    /**
     * @param user
     * @return returns list of all courses not enrolled by the user
     */
    @PostMapping("/findAllCoursesNotEnrolledByUser")
    public List<Course> findAllCoursesNotEnrolledByUser (@RequestBody User user) {
        return courseService.findAllCoursesNotEnrolledByUser(user);
    }

    /**
     * createCourse method creates a new course for a particular professor.
     * @param course course object to be created
     * @param userId userId for which the course is created.
     * @return Course
     */
    @PostMapping("/create")
    public Course createCourse (@RequestBody Course course, @RequestParam("userId") String userId) {
        long userID = Long.parseLong(userId);
        return courseService.createCourse(course, userID);
    }
}
