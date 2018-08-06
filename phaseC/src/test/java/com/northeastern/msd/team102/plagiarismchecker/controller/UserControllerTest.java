package com.northeastern.msd.team102.plagiarismchecker.controller;

import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.service.UserService;
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
 * This test suite verifies functionalities provided by User Controller
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    /**
     * This test verifies the functionality of user login
     * @throws Exception
     */
    @Test
    public void login() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        Mockito.when(userService.findUserByCredentials(Mockito.any(User.class))).thenReturn(mockUser);
        String testJson = "{\"id\":\"1\",\"firstName\":\"Aditya\",\"lastName\":\"Kumar\",\"userType\":\"Student\",\"username\":\"adi\",\"password\":\"adi\",\"email\":\"adidkool1@gmail.com\"}";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/user/login").accept(MediaType.APPLICATION_JSON).content(testJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String expected = "{id:1,firstName:Aditya,lastName:Kumar,userType:Student,username:adi,password:adi,email:adidkool1@gmail.com}";
        JSONAssert.assertEquals(expected, result.getResponse()
                .getContentAsString(), false);
    }

    /**
     * This test verifies the functionality of finding user based on username
     * @throws Exception
     */
    @Test
    public void findUserByUsername() throws Exception{
        String username = "testUser";
        String ExpectedOutput="{\"id\":3,\"firstName\":\"testFirst\",\"lastName\":\"testLast\",\"userType\":\"student\",\"username\":\"testUser\",\"password\":\"testpassword\",\"email\":\"test@test.com\",\"statusFlag\":null}";
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Mockito.when(userService.findUserByUsername(username)).thenReturn(testUser);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/user/findUserByUsername").param("username",username))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

    /**
     * This test verifies the functionality of finding user based on User Id
     * @throws Exception
     */
    @Test
    public void findUserByUserId() throws Exception{
        long userId = 3;
        String suserId ="3";
        String ExpectedOutput="{\"id\":3,\"firstName\":\"testFirst\",\"lastName\":\"testLast\",\"userType\":\"student\",\"username\":\"testUser\",\"password\":\"testpassword\",\"email\":\"test@test.com\",\"statusFlag\":null}";
        User testUser =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Mockito.when(userService.findUserByUserId(userId)).thenReturn(testUser);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/user/findUserByUserId").param("userId",suserId))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

    /**
     * This test verifies the functionality of finding professor
     * @throws Exception
     */
    @Test
    public void findProfessor() throws Exception{
        String ExpectedOutput="{\"id\":3,\"firstName\":\"testFirst\",\"lastName\":\"testLast\",\"userType\":\"student\",\"username\":\"testUser\",\"password\":\"testpassword\",\"email\":\"test@test.com\",\"statusFlag\":null}";
        User testProfessor =new User(3,"testFirst","testLast","student","testUser","testpassword","test@test.com");
        Mockito.when(userService.findByUserType("Professor")).thenReturn(testProfessor);
        MvcResult result;
        result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/user/findProfessor"))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput, result.getResponse().getContentAsString());
    }

    /**
     * This test verifies the functionality of registering new user
     * @throws Exception
     */
    @Test
    public void registerUser() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        Mockito.when(
                userService.createUser(Mockito.any(User.class))).thenReturn(mockUser);
        String testJson = "{\"id\":\"1\",\"firstName\":\"Aditya\",\"lastName\":\"Kumar\",\"userType\":\"Student\",\"username\":\"adi\",\"password\":\"adi\",\"email\":\"adidkool1@gmail.com\"}";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/user/registerUser").accept(MediaType.APPLICATION_JSON).content(testJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String expected = "{id:1,firstName:Aditya,lastName:Kumar,userType:Student,username:adi,password:adi,email:adidkool1@gmail.com}";
        JSONAssert.assertEquals(expected, result.getResponse()
                .getContentAsString(), false);
    }

    /**
     * This test verifies the functionality of finding all unapproved professors and admins
     * @throws Exception
     */
    @Test
    public void findProfessors() throws Exception {
        User mockUser1 = new User(1, "Aditya","Kumar","Professor","adi", "adi","adidkool1@gmail.com","true");
        User mockUser2 = new User(2, "Aditya","Kumar","Admin","adi", "adi","adidkool1@gmail.com","true");
        List<User> professorAdminList = new ArrayList<>();
        professorAdminList.add(mockUser1);
        professorAdminList.add(mockUser2);
        String ExpectedOutput="[{\"id\":1,\"firstName\":\"Aditya\",\"lastName\":\"Kumar\",\"userType\":\"Professor\",\"username\":\"adi\",\"password\":\"adi\",\"email\":\"adidkool1@gmail.com\",\"statusFlag\":\"true\"},{\"id\":2,\"firstName\":\"Aditya\",\"lastName\":\"Kumar\",\"userType\":\"Admin\",\"username\":\"adi\",\"password\":\"adi\",\"email\":\"adidkool1@gmail.com\",\"statusFlag\":\"true\"}]";
        Mockito.when(userService.findProfessors()).thenReturn(professorAdminList);
        MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get("/rest/user/findProfessors"))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(ExpectedOutput.toString(), result.getResponse().getContentAsString());
    }

    /**
     * This test verifies the functionality of approving professor and admin users
     * @throws Exception
     */
    @Test
    public void setUserStatus() throws Exception {
        String stringTestC = "{\"id\":1,\"name\":null,\"description\":null}";
        long[] profList = {1,2};
        String profListString = "[1,2]";
        Mockito.doNothing().when(userService).setUserStatus(profList);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/user/setUserStatus").accept(MediaType.APPLICATION_JSON)
                .content(profListString)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals(200, result.getResponse().getStatus());
    }
}