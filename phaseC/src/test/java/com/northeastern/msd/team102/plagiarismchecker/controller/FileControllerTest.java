package com.northeastern.msd.team102.plagiarismchecker.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.northeastern.msd.team102.plagiarismchecker.entity.File;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.service.FileService;
import com.northeastern.msd.team102.plagiarismchecker.service.ReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * This test suite verifies functionalities provided by File Controller
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = FileController.class, secure = false)
public class FileControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    FileService fileService;

    @MockBean
    ReportService reportService;

    /**
     * This method verifies functionality of finding all users for given HomeWork Id
     * @throws Exception
     */
    @Test
    public void getDistinctUsersForHw() throws Exception {
        String testHWId = "3";
        String ExpectedOutput="[]";
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Set<User> set = new HashSet<>();
        set.add(testUser);
        List<File> fileList = new ArrayList<>();
        Mockito.when(fileService.findAllByHomeworkId(3)).thenReturn(fileList);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/file/getUser").param("hwId",testHWId))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

    /**
     * This function upload homework file for given User id,HomeWork Id and Course Id
     * @throws Exception
     */
    @Test
    public void uploadFile() throws Exception {
        File testFile = new File();
        File testFile2 = new File();
        MockMultipartFile firstFile = new MockMultipartFile("data", "filename.txt", "text/plain", "some xml".getBytes());
        Mockito.when(fileService.uploadFile(testFile,3,3, 2)).thenReturn(testFile2);
        mockMvc.perform(MockMvcRequestBuilders.fileUpload("/rest/file/upload")
                .file(firstFile)
                .param("userId", "4")
                .param("hwId","5")
                .param("courseId","2"))
                .andExpect(status().is(200));
    }
}
