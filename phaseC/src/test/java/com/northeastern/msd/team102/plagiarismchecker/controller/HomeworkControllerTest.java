package com.northeastern.msd.team102.plagiarismchecker.controller;

import com.northeastern.msd.team102.plagiarismchecker.entity.Homework;
import com.northeastern.msd.team102.plagiarismchecker.service.HomeworkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test case suite to test HomeWork controller
 */

@RunWith(SpringRunner.class)
@WebMvcTest(value = HomeworkController.class, secure = false)
public class HomeworkControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HomeworkService homeworkService;

    /**
     * This test case verifies functionality of creating new Homework for given userId
     *
     * @throws Exception
     */
    @Test
    public void createHomework() throws Exception {
        Homework testHomeWork = new Homework();
        testHomeWork.setName("HomeWork1");
        testHomeWork.setDescription("Home Work1 description");
        String testJson = "{\"id\":0,\"name\":\"HomeWork1\",\"description\":\"Home Work1 description\",\"user\":null}";
        String ExpectedOutput = "";
        Mockito.when(homeworkService.createHomework(testHomeWork, 3, 2)).thenReturn(testHomeWork);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/homework/create").accept(MediaType.APPLICATION_JSON).content(testJson)
                .contentType(MediaType.APPLICATION_JSON)
                .param("userId", "3")
                .param("courseId", "2");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals(ExpectedOutput, result.getResponse()
                .getContentAsString());
    }

    /**
     * This test case verifies functionality of finding all homeworks associated to given Course Id
     *
     * @throws Exception
     */
    @Test
    public void findAllHomeworkForCourse() throws Exception {
        Homework testHomeWork = new Homework();
        testHomeWork.setName("HomeWork1");
        testHomeWork.setDescription("Home Work1 description");
        List<Homework> testHomeWorkList = new ArrayList<>();
        testHomeWorkList.add(testHomeWork);
        String ExpectedOutput = "[{\"id\":0,\"name\":\"HomeWork1\",\"description\":\"Home Work1 description\",\"user\":null,\"course\":null}]";
        Mockito.when(homeworkService.findAllByCourseId(3)).thenReturn(testHomeWorkList);
        MvcResult result;
        result = mockMvc.perform(MockMvcRequestBuilders.get("/rest/homework/findAllHomeworkForCourse").param("courseId", "3"))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

}