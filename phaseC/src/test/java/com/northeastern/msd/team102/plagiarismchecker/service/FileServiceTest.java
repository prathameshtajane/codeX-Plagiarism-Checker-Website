package com.northeastern.msd.team102.plagiarismchecker.service;

import com.northeastern.msd.team102.plagiarismchecker.entity.File;
import com.northeastern.msd.team102.plagiarismchecker.repository.FileRepository;
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
 * Test suite for File Upload Service Test
 */

@RunWith(SpringRunner.class)
@WebMvcTest(value = FileService.class, secure = false)
public class FileServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    FileService fileService;

    @MockBean
    private FileRepository fileRepository;

    @MockBean
    private HomeworkService homeworkService;

    @MockBean
    private UserService userService;

    @MockBean
    private CourseService courseService;

    /**
     * This test verifies functionality of retrieving File by File name
     *
     * @throws Exception
     */
    @Test
    public void findByFilename() throws Exception {
        File testFile = new File();
        testFile.setFilename("testHomework");
        when(fileService.findByFilename("testHomework")).thenReturn(testFile);
        given(this.fileService.findByFilename("testHomework")).willReturn(testFile);
        assertEquals(testFile, this.fileService.findByFilename("testHomework"));
    }

    /**
     * This test verifies functionality of uploading File into system
     *
     * @throws Exception
     */
    @Test
    public void uploadFile() throws Exception {
        File testFile = new File();
        testFile.setFilename("testHomework");
        testFile.setId(3);
        when(fileService.uploadFile(testFile, 3, 1, 2)).thenReturn(testFile);
        given(this.fileService.uploadFile(testFile, 3, 1, 1)).willReturn(testFile);
        assertEquals(testFile, this.fileService.uploadFile(testFile, 3, 1, 2));
    }

    /**
     * This test verifies functionality of retrieving all files submitted as a part of same home work
     * by specifying Home Work Id
     *
     * @throws Exception
     */
    @Test
    public void findAllByHomeworkId() throws Exception {
        File testFile = new File();
        List<File> testHomeWorkList = new ArrayList<>();
        testHomeWorkList.add(testFile);
        when(fileService.findAllByHomeworkId(3)).thenReturn(testHomeWorkList);
        given(this.fileService.findAllByHomeworkId(3)).willReturn(testHomeWorkList);
        assertEquals(testHomeWorkList, this.fileService.findAllByHomeworkId(3));
    }

    /**
     * This test verifies functionality of retrieving all files submitted by User except the user specified
     * by User Id and Course Id
     *
     * @throws Exception
     */
    @Test
    public void findAllFileForOtherUser() throws Exception {
        File testFile = new File();
        List<File> testHomeWorkList = new ArrayList<>();
        testHomeWorkList.add(testFile);
        when(fileService.findAllFileForOtherUser(3, 1)).thenReturn(testHomeWorkList);
        given(this.fileService.findAllFileForOtherUser(3, 1)).willReturn(testHomeWorkList);
        assertEquals(testHomeWorkList, this.fileService.findAllFileForOtherUser(3, 1));
    }

}