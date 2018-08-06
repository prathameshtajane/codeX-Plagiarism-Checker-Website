package com.northeastern.msd.team102.plagiarismchecker.service;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.Homework;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.repository.HomeworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Service class for Homework entity.
 */
@Component
public class HomeworkService {

    @Autowired
    private HomeworkRepository homeworkRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private CourseService courseService;

    public static final Logger logger = Logger.getLogger(HomeworkService.class.getName());

    /**
     * createHomework method creates a Homework for a given userId.
     * @param homework
     * @param userId
     * @return Homework
     */
    public Homework createHomework(Homework homework, long userId, long courseId)
    {
        logger.log(Level.INFO, "Creating homework for userId: " + userId + "and courseId: " + courseId);
        User user = userService.findUserByUserId(userId);
        Course course = courseService.findById(courseId);
        homework.setUser(user);
        homework.setCourse(course);
        return homeworkRepository.save(homework);
    }

    /**
     * findAllByCourseId method returns list of Homework for a given course.
     * @param courseId
     * @return List of Homework
     */
    public List<Homework> findAllByCourseId(long courseId) {

        logger.log(Level.INFO, "Returning all homeworks for courseId: " + courseId);
        return homeworkRepository.findAllByCourseId(courseId);
    }

    /**
     * findById method returns a homework for a given id.
     * @param id
     * @return Homework
     */
    public Homework findById(long id) {

        logger.log(Level.INFO, "Returning homework for hwId: " + id);
        return homeworkRepository.findById(id);
    }
}
