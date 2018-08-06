package com.northeastern.msd.team102.plagiarismchecker.controller;

import com.northeastern.msd.team102.plagiarismchecker.entity.*;
import com.northeastern.msd.team102.plagiarismchecker.service.UsageStatisticsService;
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
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * This test suite verifies functionalities provided by Usage Statistics Controller
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = UsageStatisticsController.class, secure = false)
public class UsageStatisticsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsageStatisticsService usageStatisticsService;

    /**
     * This test verifies the functionality of finding all usage Statistics by Professor Id
     * @throws Exception
     */
    @Test
    public void findAllUsageStatisticsByProfessor() throws Exception{
        Date d = null;
        UsageStatistics u = new UsageStatistics(null, new User(), new User(), new Course(), new Homework(), 0, "HashMap");
        List<UsageStatistics> testUsageList = new ArrayList<>();
        testUsageList.add(u);
        String ExpectedOutput="[{\"id\":0,\"timestamp\":"+d+",\"professor\":" +
                "{\"id\":0,\"firstName\":null,\"lastName\":null,\"userType\":null,\"username\":null,\"password\":null," +
                "\"email\":null,\"statusFlag\":null},\"student\":{\"id\":0,\"firstName\":null,\"lastName\":null,\"userType\":null," +
                "\"username\":null,\"password\":null,\"email\":null,\"statusFlag\":null},\"course\":{\"id\":0,\"name\":null," +
                "\"description\":null,\"user\":null},\"homework\":{\"id\":0,\"name\":null,\"description\":null," +
                "\"user\":null,\"course\":null},\"compareCount\":0.0,\"algoType\":\"HashMap\"}]";
        Mockito.when(usageStatisticsService.findAllUsageStatisticsByProfessor(2)).thenReturn(testUsageList);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/usagestatistics/findAllUsageStatisticsSummary")
                .param("userId","2"))
                .andExpect(status().isOk()).andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

    /**
     * This test verifies the functionality of finding all usage statistics summary by Professor Id
     * @throws Exception
     */
    @Test
    public void findAllUsageStatisticsSummary() throws Exception {
        UsageStatistics testUserStats1 = new UsageStatistics();
        testUserStats1.setId(1);
        UsageStatistics testUserStats2 = new UsageStatistics();
        testUserStats2.setId(2);
        List<UsageStatistics> statsList = new ArrayList<>();
        String ExpectedOutput="[]";
        Mockito.when(usageStatisticsService.findAllUsageStatisticsByProfessor(2)).thenReturn(statsList);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/usagestatistics/findAllUsageStatisticsSummary")
                .param("userId","2"))
                .andExpect(status().isOk()).andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());


    }

    /**
     * This test verifies the functionality of finding all usage statistics summary
     * @throws Exception
     */
    @Test
    public void findAllSummary() throws Exception {
        UsageStatistics testUserStats1 = new UsageStatistics();
        testUserStats1.setId(1);
        UsageStatistics testUserStats2 = new UsageStatistics();
        testUserStats2.setId(2);
        List<UsageStatistics> statsList = new ArrayList<>();
        String ExpectedOutput="[]";
        Mockito.when(usageStatisticsService.findAllUsageStatistics()).thenReturn(statsList);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/usagestatistics/findAllSummary")).andExpect(status().isOk()).andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

    /**
     * This test verifies the functionality of finding all register statistics summary
     * @throws Exception
     */
    @Test
    public void registerStats() throws Exception {
        Date timestamp = new Date();
        Date d = null;
        String ExpectedOutput="{\"id\":0,\"timestamp\":"+d+",\"professor\":" +
                "{\"id\":0,\"firstName\":null,\"lastName\":null,\"userType\":null,\"username\":null,\"password\":null," +
                "\"email\":null,\"statusFlag\":null},\"student\":{\"id\":0,\"firstName\":null,\"lastName\":null,\"userType\":null," +
                "\"username\":null,\"password\":null,\"email\":null,\"statusFlag\":null},\"course\":{\"id\":0,\"name\":null," +
                "\"description\":null,\"user\":null},\"homework\":{\"id\":0,\"name\":null,\"description\":null," +
                "\"user\":null,\"course\":null},\"compareCount\":0.0,\"algoType\":\"HashMap\"}";
        Mockito.doNothing().when(usageStatisticsService).generateStatistics(timestamp,null,null,null,null,3,null);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/usagestatistics/registerStats").accept(MediaType.APPLICATION_JSON)
                .content(ExpectedOutput)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals(200, result.getResponse().getStatus());
    }

}
