package com.northeastern.msd.team102.plagiarismchecker.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This test suite verifies functionality of User entity class
 */
public class UserTest {

    /**
     * This test case verifies functionality of getting User Id
     * @throws Exception
     */
    @Test
    public void getId() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        assertEquals(3, testUser.getId());
    }

    /**
     * This test case verifies functionality of setting User Id
     * @throws Exception
     */
    @Test
    public void setId() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        testUser.setId(4);
        assertEquals(4, testUser.getId());
    }

    /**
     * This test case verifies functionality of retrieving First name of user
     * @throws Exception
     */
    @Test
    public void getFirstName() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        assertEquals("testFirst", testUser.getFirstName());
    }

    /**
     * This test case verifies functionality of setting First name of user
     * @throws Exception
     */
    @Test
    public void setFirstName() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        testUser.setFirstName("testFirst2");
        assertEquals("testFirst2", testUser.getFirstName());
    }

    /**
     * This test case verifies functionality of retrieving Last name of user
     * @throws Exception
     */
    @Test
    public void getLastName() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        assertEquals("testLast", testUser.getLastName());
    }

    /**
     * This test case verifies functionality of setting First name of user
     * @throws Exception
     */
    @Test
    public void setLastName() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        testUser.setLastName("testFirst2");
        assertEquals("testFirst2", testUser.getLastName());
    }

    /**
     * This test case verifies functionality of retrieving User type of given User
     * @throws Exception
     */
    @Test
    public void getUserType() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        assertEquals("student", testUser.getUserType());
    }

    /**
     * This test case verifies functionality of setting User type of given User
     * @throws Exception
     */
    @Test
    public void setUserType() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        testUser.setUserType("Professor");
        assertEquals("Professor", testUser.getUserType());
    }

    /**
     * This test case verifies functionality of retrieving username of given User
     * @throws Exception
     */
    @Test
    public void getUsername() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        assertEquals("testUser", testUser.getUsername());
    }

    /**
     * This test case verifies functionality of setting username of given User
     * @throws Exception
     */
    @Test
    public void setUsername() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        testUser.setUsername("testUser2");
        assertEquals("testUser2", testUser.getUsername());
    }

    /**
     * This test case verifies functionality of retrieving password of given User
     * @throws Exception
     */
    @Test
    public void getPassword() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        assertEquals("testpassword", testUser.getPassword());
    }

    /**
     * This test case verifies functionality of setting password of given User
     * @throws Exception
     */
    @Test
    public void setPassword() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        testUser.setPassword("dummyPAssword");
        assertEquals("dummyPAssword", testUser.getPassword());
    }

    /**
     * This test case verifies functionality of retrieving email of given User
     * @throws Exception
     */
    @Test
    public void getEmail() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        assertEquals("test@test.com", testUser.getEmail());
    }

    /**
     * This test case verifies functionality of setting email of given User
     * @throws Exception
     */
    @Test
    public void setEmail() throws Exception {
        User testUser = new User(3, "testFirst", "testLast", "student", "testUser", "testpassword", "test@test.com");
        testUser.setEmail("test2@test.com");
        assertEquals("test2@test.com", testUser.getEmail());
    }

    /**
     * This test case verifies functionality of default user constructor
     * @throws Exception
     */
    @Test
    public void testDefaultConstructor() throws Exception {
        User testUser = new User();
        testUser.setEmail("test2@test.com");
        assertEquals("test2@test.com", testUser.getEmail());
    }

    /**
     * This test case verifies functionality retrieving and setting professor and admin's approval flag
     * @throws Exception
     */
    @Test
    public void getSetStatusFlag() throws Exception {
        User testUser = new User();
        testUser.setStatusFlag("true");
        assertEquals("true", testUser.getStatusFlag());
    }

}