package com.northeastern.msd.team102.plagiarismchecker.service;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.Enroll;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.repository.EnrollRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

/**
 * Create test cases for Enroll service
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = EnrollService.class, secure = false)
public class EnrollServiceTest {

    @MockBean
    private EnrollRepository enrollRepository;

    @MockBean
    private UserService userService;

    @Autowired
    private EnrollService enrollService;

    /**
     * This test verifies functionality of retrieving all courses enrolled for given User
     * @throws Exception
     */
    @Test
    public void findAllByUserId() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        List<Enroll> enrollList = new ArrayList<>();
        enrollList.add(testEnroll);
        when(enrollRepository.findAllByUserId(3)).thenReturn(enrollList);
        given(this.enrollRepository.findAllByUserId(3)).willReturn(enrollList);
        assertArrayEquals(enrollList.toArray(),this.enrollService.findAllByUserId(3).toArray());
    }

    /**
     * This test verifies functionality of enrollment of given user to specified course
     * @throws Exception
     */
    @Test
    public void createEnroll() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        when(enrollRepository.save(testEnroll)).thenReturn(testEnroll);
        given(this.enrollRepository.save(testEnroll)).willReturn(testEnroll);
        assertEquals(null,this.enrollService.createEnroll(testCourse,3));
    }

}