package com.northeastern.msd.team102.plagiarismchecker.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test suite for Report entity
 */
public class ReportTest {

    /**
     * This test case verifies functionality of retrieving Id of given Report
     * @throws Exception
     */
    @Test
    public void getSetId() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        testReport.setId(1);
        assertEquals(1,testReport.getId());
    }

    /**
     * This test case verifies functionality of retrieving and setting Report generated after using HashMap plagiarism
     * detection strategy
     * @throws Exception
     */
    @Test
    public void getSetHashMapPercentage() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        testReport.setPercentageCompareHashMap(12);
        assertEquals(12,testReport.getPercentageCompareHashMap(),2);
    }

    /**
     * This test case verifies functionality of retrieving and setting Report generated after using Tree plagiarism
     * detection strategy
     * @throws Exception
     */
    @Test
    public void getSetTreesPercentage() throws Exception { ;
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        testReport.setpercentageCompareTrees(12);
        assertEquals(12,testReport.getpercentageCompareTrees(),2);
    }

    /**
     * This test case verifies functionality of retrieving and setting Report generated after using Levenshtein Distance
     * plagiarism detection strategy
     * @throws Exception
     */
    @Test
    public void getSetLDPercentage() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        testReport.setpercentageCompareLevenshteinDistancep(12);
        assertEquals(12,testReport.getpercentageCompareLevenshteinDistance(),2);
    }

    /**
     * This test case verifies functionality of retrieving first file from the Report
     * @throws Exception
     */
    @Test
    public void getFileUpload1() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        assertEquals(testFile1,testReport.getFile1());
    }

    /**
     * This test case verifies functionality of setting first file from the Report
     * @throws Exception
     */
    @Test
    public void setFileUpload1() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        testReport.setFile1(testFile2);
        assertEquals(testFile2,testReport.getFile1());
    }

    /**
     * This test case verifies functionality of retrieving second file from the Report
     * @throws Exception
     */
    @Test
    public void getSetFileUpload2() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        testReport.setFile2(testFile1);
        assertEquals(testFile1,testReport.getFile2());
    }

    /**
     * This test case verifies functionality of retrieving and setting Report generated after using Levenshtein Distance,
     * HashMap and Trees plagiarism detection strategy
     * @throws Exception
     */
    @Test
    public void getSetCompareAllPercentage() throws Exception {
        byte[] testBytes=new byte[2];
        File testFile1 = new File("testFileName",testBytes,"testMimeType");
        File testFile2 = new File("testFileNam2",testBytes,"testMimeType");
        Report testReport = new Report(testFile1, testFile2,12,12,12,12);
        testReport.setPercentageCompareAll(12);
        assertEquals(12,testReport.getPercentageCompareAll(),2);
    }
}