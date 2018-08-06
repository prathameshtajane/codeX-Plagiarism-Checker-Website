package com.northeastern.msd.team102.plagiarismchecker.service;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.repository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

/**
 * This is a test suite for Course Service
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = CourseService.class, secure = false)
public class CourseServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CourseService courseService;

    @MockBean
    private HomeworkService homeworkService;

    @MockBean
    private CourseRepository courseRepository;

    @MockBean
    private UserService userService;

    /**
     * This test verifies functionality of retrieving all enrolled courses by given User
     * @throws Exception
     */
    @Test
    public void findAllByUserId() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse1 = new Course("courseName","courseDescrition",testUser);
        Course testCours2 = new Course("courseName2","courseDescrition2",testUser);
        List<Course> listOfCourses = new ArrayList<>();
        listOfCourses.add(testCourse1);
        listOfCourses.add(testCours2);
        when(courseRepository.findAllByUserId(3)).thenReturn(listOfCourses);
        given(this.courseRepository.findAllByUserId(3)).willReturn(listOfCourses);
        assertArrayEquals(listOfCourses.toArray(),this.courseService.findAllByUserId(3).toArray());

    }

    /**
     * This test verifies functionality of retrieving all courses not enrolled by given User
     * @throws Exception
     */
    @Test
    public void findAllCoursesNotEnrolledByUser() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse1 = new Course("courseName","courseDescrition",testUser);
        Course testCours2 = new Course("courseName2","courseDescrition2",testUser);
        List<Course> listOfCourses = new ArrayList<>();
        listOfCourses.add(testCourse1);
        listOfCourses.add(testCours2);
        when(courseRepository.findAllCoursesNotEnrolledByUser(testUser)).thenReturn(listOfCourses);
        given(this.courseRepository.findAllCoursesNotEnrolledByUser(testUser)).willReturn(listOfCourses);
        assertArrayEquals(listOfCourses.toArray(),this.courseService.findAllCoursesNotEnrolledByUser(testUser).toArray());
    }

    /**
     * This test verifies functionality of retrieving Course by Course Id
     * @throws Exception
     */
    @Test
    public void findById() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse1 = new Course("courseName","courseDescrition",testUser);
        when(courseRepository.findById(3)).thenReturn(testCourse1);
        given(this.courseRepository.findById(3)).willReturn(testCourse1);
        assertEquals(testCourse1,this.courseService.findById(3));
    }

    /**
     * This test verifies functionality of adding new Course
     * @throws Exception
     */
    @Test
    public void createCourse() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse1 = new Course("courseName","courseDescrition",testUser);
        when(courseRepository.save(testCourse1)).thenReturn(testCourse1);
        given(this.courseRepository.save(testCourse1)).willReturn(testCourse1);
        assertEquals(testCourse1,this.courseService.createCourse(testCourse1,1));
    }

}