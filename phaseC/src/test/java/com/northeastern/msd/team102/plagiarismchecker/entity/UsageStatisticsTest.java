package com.northeastern.msd.team102.plagiarismchecker.entity;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

/**
 * Test suite for verifying functionalities of UserStatistics entity
 */
public class UsageStatisticsTest {

    /**
     * This test case verifies functionality of setting HomeWork
     * @throws Exception
     */
    @Test
    public void setHomework() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(), 
        		new Course(), new Homework(), 0, "HashMap");
        Homework testHomeWork = new Homework();
        testHomeWork.setName("homework1");
        u.setHomework(testHomeWork);
        assertEquals("homework1", u.getHomework().getName());
    }

    /**
     * This test case verifies functionality of setting Timestamp for given HomeWork
     * @throws Exception
     */
    @Test
    public void setTimetamp() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(), 
        		new Course(), new Homework(), 0, "HashMap");
        Date d = new Date();
        u.setTimestamp(d);
        assertEquals(d, u.getTimestamp());
    }

    /**
     * This test case verifies functionality of setting Professor for given HomeWork
     * @throws Exception
     */
    @Test
    public void setProfessor() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(), 
        		new Course(), new Homework(), 0, "HashMap");
        User p = new User();
        p.setFirstName("Rob");
        u.setProfessor(p);
        assertEquals("Rob", u.getProfessor().getFirstName());
    }

    /**
     * This test case verifies functionality of setting Student for given HomeWork
     * @throws Exception
     */
    @Test
    public void setStudent() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(), 
        		new Course(), new Homework(), 0, "HashMap");
        User s = new User();
        s.setFirstName("Bob");
        u.setStudent(s);
        assertEquals("Bob", u.getStudent().getFirstName());
    }

    /**
     * This test case verifies functionality of setting Course for given HomeWork
     * @throws Exception
     */
    @Test
    public void setCourse() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(), 
        		new Course(), new Homework(), 0, "HashMap");
        Course c = new Course();
        c.setName("MSD");
        u.setCourse(c);
        assertEquals("MSD", u.getCourse().getName());
    }

    /**
     * This test case verifies functionality of setting Comparision Count for given HomeWork
     * @throws Exception
     */
    @Test
    public void setCompareCount() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(), 
        		new Course(), new Homework(), 0, "HashMap");
        u.setCompareCount(0);
        assertEquals(0, u.getCompareCount(), 0.0);
    }

    /**
     * This test case verifies functionality of default HomeWork Constructor
     * @throws Exception
     */
    @Test
    public void testDefaultConstructor() throws Exception {
    	UsageStatistics u = new UsageStatistics();
        u.setAlgoType("");
        assertEquals("", u.getAlgoType());
    }

}