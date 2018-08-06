package com.northeastern.msd.team102.plagiarismchecker.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.Homework;
import com.northeastern.msd.team102.plagiarismchecker.entity.UsageStatistics;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.repository.UsageStatisticsRepository;

/**
 * Test Suite for Usage Statistics service
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = UsageStatisticsService.class, secure = false)
public class UsageStatisticsServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsageStatisticsRepository usageStatisticsRepository;

    @Autowired
    private UsageStatisticsService usageStatisticsService;

    @MockBean
    private UserService userService;

    /**
     * This test verifies functionality of finding Usage Statistics summary for given Professor Id
     * @throws Exception
     */
    @Test
    public void findAllUsageStatisticsByProfessorSummary() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(),
                new Course(), new Homework(), 0, "HashMap");
        List<UsageStatistics> testList = new ArrayList<>();
        testList.add(u);
        when(usageStatisticsRepository.findAllByProfessor_Id(2)).thenReturn(testList);
        given(this.usageStatisticsService.findAllUsageStatisticsByProfessor(2)).willReturn(testList);
        assertEquals(testList, this.usageStatisticsService.findAllUsageStatisticsByProfessor(2));
    }

    /**
     * This test verifies functionality of finding Usage Statistics summary for all professors
     * @throws Exception
     */
    @Test
    public void findAllUsageStatistics() throws Exception {
        UsageStatistics u = new UsageStatistics(null, new User(), new User(),
                new Course(), new Homework(), 0, "HashMap");
        List<UsageStatistics> testList = new ArrayList<>();
        testList.add(u);
        when(usageStatisticsRepository.findAll()).thenReturn(testList);
        given(this.usageStatisticsService.findAllUsageStatistics()).willReturn(testList);
        assertEquals(testList, this.usageStatisticsService.findAllUsageStatistics());
    }
}