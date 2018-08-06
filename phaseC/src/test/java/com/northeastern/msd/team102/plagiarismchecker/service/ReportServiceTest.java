package com.northeastern.msd.team102.plagiarismchecker.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.northeastern.msd.team102.plagiarismchecker.antlr.ast.Snippet;
import com.northeastern.msd.team102.plagiarismchecker.entity.File;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.northeastern.msd.team102.plagiarismchecker.entity.Report;
import com.northeastern.msd.team102.plagiarismchecker.repository.ReportRepository;

/**
 * Test Suite for Report Services
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = ReportService.class, secure = false)
public class ReportServiceTest {

    @MockBean
    private ReportRepository reportRepository;

    @Autowired
    private ReportService reportService;

    @MockBean
    private UserService userService;

    @MockBean
    private Snippet snippet;

//    @MockBean
//    private ReportService reportService;

    @MockBean
    private FileService fileService;

    @MockBean
    private HomeworkService homeworkService;

//    @Test
//    public void createReport() throws Exception {
//        Report testReport = new Report();
//        ReportService reportService = mock(ReportService.class);
////        when(reportRepository.save(testReport)).thenReturn(testReport);
//        doNothing().when(reportService).createReport(testReport);
//        verify(reportService,times(1)).createReport(testReport);
////        given(this.reportService.createReport(testReport));
////        assertEquals(testReport,this.reportService.createReport(testReport));
//    }

//    @Test
//    public void generateReport() throws Exception {
//
//    }

    @Test
    public void findAllReportSummary() throws Exception {
        Report testReport = new Report();
        List<Report> testReportList=new ArrayList<>();
        when(reportRepository.findAllByHomeworkIdAndUserId(3,1)).thenReturn(testReportList);
        given(this.reportService.findAllReportSummary(3,1)).willReturn(testReportList);
        assertEquals(testReportList,this.reportService.findAllReportSummary(3,1));
    }

//    @Test
//    public void getDetailedReport() throws Exception {
//        String[] testString = {"testFile","testPythonFile"};
//        byte[] testFile1Byte = new byte[3];
//        byte[] testFile2Byte = new byte[3];
//        File test1File = new File();
//        File test2File = new File();
//        when(this.fileService.findByFileId(1)).thenReturn(test1File);
//        when(this.fileService.findByFileId(2)).thenReturn(test2File);
//        when(this.snippet.generateSnippets(testFile1Byte,testFile2Byte)).thenReturn(testString);
//        assertEquals(testString,this.reportService.getDetailedReport(1,2).toString());
//    }

}