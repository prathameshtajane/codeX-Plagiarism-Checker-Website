package com.northeastern.msd.team102.plagiarismchecker.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for Course entity
 */
public class CourseTest {

    /**
     * This test case verifies functionality of retrieving Id of given Course
     * @throws Exception
     */
    @Test
    public void getId() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        assertEquals(0,testCourse.getId());
    }

    /**
     * This test case verifies functionality of assigning Id to given Course
     * @throws Exception
     */
    @Test
    public void setId() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        testCourse.setId(4);
        assertEquals(4,testCourse.getId());
    }

    /**
     * This test case verifies functionality of retrieving course name of given Course
     * @throws Exception
     */
    @Test
    public void getName() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        assertEquals("courseName",testCourse.getName());
    }

    /**
     * This test case verifies functionality of assigning course name to given Course
     * @throws Exception
     */
    @Test
    public void setName() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        testCourse.setName("dummyCourseName");
        assertEquals("dummyCourseName",testCourse.getName());
    }

    /**
     * This test case verifies functionality of retrieving course description of given Course
     * @throws Exception
     */
    @Test
    public void getDescription() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        assertEquals("courseDescrition",testCourse.getDescription());
    }

    /**
     * This test case verifies functionality of assigning course description to given Course
     * @throws Exception
     */
    @Test
    public void setDescription() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        testCourse.setDescription("DummyDescription");
        assertEquals("DummyDescription",testCourse.getDescription());
    }

    /**
     * This test case verifies functionality of retrieving User of given Course
     * @throws Exception
     */
    @Test
    public void getUser() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        assertEquals(testUser,testCourse.getUser());
    }

    /**
     * This test case verifies functionality of assigning User to given Course
     * @throws Exception
     */
    @Test
    public void setUser() throws Exception {
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        User testUser1 =new User(4,"testFirst1","testLast1","student","testUser","testpassword","test@test.com");
        Course testCourse = new Course("courseName","courseDescrition",testUser);
        testCourse.setUser(testUser1);
        assertEquals(testUser1,testCourse.getUser());
    }

    /**
     * This test case verifies functionality of default Course constructor
     * @throws Exception
     */
    @Test
    public void testDefaultConstructor() throws Exception {
        Course testCourse = new Course();
        testCourse.setName("dummyCourse");
        assertEquals("dummyCourse",testCourse.getName());
    }
}