package com.northeastern.msd.team102.plagiarismchecker.controller;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.Enroll;
import com.northeastern.msd.team102.plagiarismchecker.service.EnrollService;
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
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * This test suite verifies functionalities provided by Enroll Controller
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = EnrollController.class, secure = false)
public class EnrollControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EnrollService enrollService;

    /**
     * This test case verifies the functionality of finding Enrollment for given user
     * @throws Exception
     */
    @Test
    public void findAllEnrollmentForUser() throws Exception {
        String suserId ="3";
        Enroll testEnroll1 = new Enroll();
        Enroll testEnroll2 = new Enroll();
        List<Enroll> enrollTest = new ArrayList<>();
        enrollTest.add(testEnroll1);
        enrollTest.add(testEnroll2);
        String ExpectedOutput="[{\"id\":0,\"user\":null,\"course\":null},{\"id\":0,\"user\":null,\"course\":null}]";
        Mockito.when(enrollService.findAllByUserId(3)).thenReturn(enrollTest);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/enroll/findAllEnrollmentForUser").param("userId",suserId))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

    /**
     * This test case verifies the functionality of creating new  enrollment for given user Id
     * @throws Exception
     */
    @Test
    public void createEnrollment() throws Exception {
        Enroll testEnroll1 = new Enroll();
        Course testCourse = new Course();
        String stringTestC = "{\"id\":1,\"name\":null,\"description\":null}";
        Mockito.when(enrollService.createEnroll(testCourse,3)).thenReturn(testEnroll1);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/enroll/create").accept(MediaType.APPLICATION_JSON)
                .content(stringTestC)
                .contentType(MediaType.APPLICATION_JSON)
                .param("userId","3");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals(200, result.getResponse().getStatus());
    }

}