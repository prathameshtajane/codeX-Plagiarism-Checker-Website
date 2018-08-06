package com.northeastern.msd.team102.plagiarismchecker.repository;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    /**
     * findAllByUserId method finds all courses by specified userId.
     * @param userId
     * @return List of course for the specified userId.
     */
    List<Course> findAllByUserId(long userId);

    /**
     * findById method to return course by courseId.
     * @param courseId
     * @return Course object for the given courseId
     */
    Course findById(long courseId);

    /**
     * findAllCoursesNotEnrolledByUser method returns all courses not enrolled by user.
     * @param user
     * @return List of course.
     */
    @Query("Select c from Course c where id not in (Select course from Enroll e where user = ?1)")
    List<Course> findAllCoursesNotEnrolledByUser(User user);

}
