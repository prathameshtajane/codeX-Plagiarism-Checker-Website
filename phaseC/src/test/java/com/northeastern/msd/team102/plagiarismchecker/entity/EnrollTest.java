package com.northeastern.msd.team102.plagiarismchecker.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for enroll entity
 */
public class EnrollTest {

    /**
     * This test case verifies functionality of retrieving Id of given Enroll entity
     * @throws Exception
     */
    @Test
    public void getId() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        assertEquals(0,testEnroll.getId());
    }

    /**
     * This test case verifies functionality of assigning Id to given Enroll entity
     * @throws Exception
     */
    @Test
    public void setId() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        testEnroll.setId(3);
        assertEquals(3,testEnroll.getId());
    }

    /**
     * This test case verifies functionality of retrieving Id of given Enroll entity
     * @throws Exception
     */
    @Test
    public void getUser() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        assertEquals(testUser,testEnroll.getUser());
    }

    /**
     * This test case verifies functionality of enrolling User to particular Course
     * @throws Exception
     */
    @Test
    public void setUser() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        User testUser1 =new User(4,"testFirst1","testLast1","student","testUser1","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        testEnroll.setUser(testUser1);
        assertEquals(testUser1,testEnroll.getUser());
    }

    /**
     * This test case verifies functionality of retrieving User enrolled in particular Course
     * @throws Exception
     */
    @Test
    public void getCourse() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        assertEquals(testCourse,testEnroll.getCourse());
    }

    /**
     * This test case verifies functionality of assigning User to particular Course
     * @throws Exception
     */
    @Test
    public void setCourse() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        Course testCourse2 = new Course("courseName2","courseDescrition2",testUser);
        Enroll testEnroll = new Enroll(testUser,testCourse);
        testEnroll.setCourse(testCourse2);
        assertEquals(testCourse2,testEnroll.getCourse());
    }

    /**
     * This test case verifies functionality default Enroll constructor
     * @throws Exception
     */
    @Test
    public void testDefaultConstructor() throws Exception {
        Enroll testEnroll = new Enroll();
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        testEnroll.setCourse(testCourse);
        assertEquals(testCourse,testEnroll.getCourse());
    }

}