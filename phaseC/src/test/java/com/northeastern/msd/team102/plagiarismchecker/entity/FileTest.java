package com.northeastern.msd.team102.plagiarismchecker.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test suite for File entity
 */
public class FileTest {

    /**
     * This test case verifies functionality of retrieving HomeWork from given File entity
     * @throws Exception
     */
    @Test
    public void getHomework() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        assertEquals(null, testFile.getHomework());
    }

    /**
     * This test case verifies functionality of assigning HomeWork of given File entity
     * @throws Exception
     */
    @Test
    public void setHomework() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        Homework testHomeWork = new Homework();
        testHomeWork.setName("homework1");
        testFile.setHomework(testHomeWork);
        assertEquals("homework1", testFile.getHomework().getName());
    }

    /**
     * This test case verifies functionality of assigning and retrieving User of given File entity
     * @throws Exception
     */
    @Test
    public void getSetUser() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        User testUser = new User();
        testUser.setUsername("testUserName");
        testFile.setUser(testUser);
        assertEquals("testUserName", testFile.getUser().getUsername());
    }

    /**
     * This test case verifies functionality of assigning Id to given File entity
     * @throws Exception
     */
    @Test
    public void getSetId() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        testFile.setId(123);
        assertEquals(123, testFile.getId());
    }

    /**
     * This test case verifies functionality of retrieving File name of given File entity
     * @throws Exception
     */
    @Test
    public void getFilename() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        assertEquals("testFileName", testFile.getFilename());
    }

    /**
     * This test case verifies functionality of assigning File name of given File entity
     * @throws Exception
     */
    @Test
    public void setFilename() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        testFile.setFilename("testFileName2");
        assertEquals("testFileName2", testFile.getFilename());
    }

    /**
     * This test case verifies functionality of retrieving File entity
     * @throws Exception
     */
    @Test
    public void getFile() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        testFile.setFilename("testFileName2");
        assertEquals(testBytes, testFile.getFile());
    }

    /**
     * This test case verifies functionality of creating new File entity
     * @throws Exception
     */
    @Test
    public void setFile() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        byte[] testBytes2=new byte[2];
        testFile.setFile(testBytes2);
        assertEquals(testBytes2, testFile.getFile());

    }

    /**
     * This test case verifies functionality of retrieving MIME type of given File entity
     * @throws Exception
     */
    @Test
    public void getMimeType() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        assertEquals("testMimeType", testFile.getMimeType());
    }

    /**
     * This test case verifies functionality of assigning MIME type of given File entity
     * @throws Exception
     */
    @Test
    public void setMimeType() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile = new File("testFileName",testBytes,"testMimeType");
        testFile.setMimeType("testMimeType2");
        assertEquals("testMimeType2", testFile.getMimeType());
    }

    /**
     * This test case verifies functionality default constructor of File entity/class
     * @throws Exception
     */
    @Test
    public void testDefaultConstructor() throws Exception {
        File testFile = new File();
        testFile.setMimeType("testMimeType2");
        assertEquals("testMimeType2", testFile.getMimeType());
    }

}