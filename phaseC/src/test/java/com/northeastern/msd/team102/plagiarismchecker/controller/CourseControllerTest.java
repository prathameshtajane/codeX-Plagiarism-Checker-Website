package com.northeastern.msd.team102.plagiarismchecker.controller;
import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
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
 * This test suite verifies functionalities provided by Course Controller
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = CourseController.class, secure = false)
public class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CourseService courseService;

    /**
     * This test verifies functionality of finding all courses available for given user
     * @throws Exception
     */
    @Test
    public void findAllCoursesForUser() throws Exception {
        Course testCourse1 = new Course();
        testCourse1.setId(1);
        Course testCourse2 = new Course();
        testCourse2.setId(2);
        List<Course> testCourseList = new ArrayList<>();
        testCourseList.add(testCourse1);
        testCourseList.add(testCourse2);
        String ExpectedOutput="[{\"id\":1,\"name\":null,\"description\":null,\"user\":null},{\"id\":2,\"name\":null,\"description\":null,\"user\":null}]";
        Mockito.when(courseService.findAllByUserId(1)).thenReturn(testCourseList);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/course/findAllCoursesForUser").param("userId","1"))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());


    }

    /**
     * This method verifies functionality of finding all users got particular course
     * @throws Exception
     */
    @Test
    public void findAllCoursesNotEnrolledByUser() throws Exception {
        Course testCourse1 = new Course();
        testCourse1.setId(1);
        Course testCourse2 = new Course();
        testCourse2.setId(2);
        List<Course> testCourseList = new ArrayList<>();
        testCourseList.add(testCourse1);
        testCourseList.add(testCourse2);
        String ExpectedOutput="[{\"id\":1,\"name\":null,\"description\":null,\"user\":null},{\"id\":2,\"name\":null,\"description\":null,\"user\":null}]";
        Mockito.when(
                courseService.findAllCoursesNotEnrolledByUser(Mockito.any(User.class))).thenReturn(testCourseList);
        String testJson = "{\"id\":\"1\",\"firstName\":\"Aditya\",\"lastName\":\"Kumar\",\"userType\":\"Student\",\"username\":\"adi\",\"password\":\"adi\",\"email\":\"adidkool1@gmail.com\"}";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/course/findAllCoursesNotEnrolledByUser").accept(MediaType.APPLICATION_JSON).content(testJson)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        JSONAssert.assertEquals(ExpectedOutput, result.getResponse()
                .getContentAsString(), false);

    }
}