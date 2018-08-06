package com.northeastern.msd.team102.plagiarismchecker.entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTest {
    @Test
    public void getId() throws Exception {
        Homework testHomeWork = new Homework();
        assertEquals(0,testHomeWork.getId());
    }

    @Test
    public void getUser() throws Exception {
        Homework testHomeWork = new Homework();
        assertEquals(null,testHomeWork.getUser());
    }

    @Test
    public void setUser() throws Exception {
        Homework testHomeWork = new Homework();
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        testHomeWork.setUser(testUser);
        assertEquals(3,testHomeWork.getUser().getId());
    }

    @Test
    public void getName() throws Exception {
        Homework testHomeWork = new Homework();
        testHomeWork.setName("hw1");
        assertEquals("hw1",testHomeWork.getName());
    }

    @Test
    public void setName() throws Exception {
        Homework testHomeWork = new Homework();
        testHomeWork.setName("hw1");
        assertEquals("hw1",testHomeWork.getName());
    }

    @Test
    public void getDescription() throws Exception {
        Homework testHomeWork = new Homework();
        assertEquals(null,testHomeWork.getDescription());
    }

    @Test
    public void setDescription() throws Exception {
        Homework testHomeWork = new Homework();
        testHomeWork.setDescription("home work number 1");
        assertEquals("home work number 1",testHomeWork.getDescription());
    }

}