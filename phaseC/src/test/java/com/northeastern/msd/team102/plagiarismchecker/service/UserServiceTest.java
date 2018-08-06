package com.northeastern.msd.team102.plagiarismchecker.service;

import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.repository.UserRepository;
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
 * Test Suite for User Services
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = UserService.class, secure = false)
public class UserServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    /**
     * This test verifies functionality of finding User by user credentials which is combination of Username and
     * password
     * @throws Exception
     */
    @Test
    public void findUserByCredentials() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findByUsernameAndPassword("adi","adi")).thenReturn(mockUser);
        given(this.userService.findUserByCredentials(mockUser)).willReturn(mockUser);
        assertEquals(mockUser,this.userService.findUserByCredentials(mockUser));
    }

    /**
     * This test verifies functionality of finding User by user name
     * @throws Exception
     */
    @Test
    public void findUserByUsername() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findByUsername("adi")).thenReturn(mockUser);
        given(this.userService.findUserByUsername("adi")).willReturn(mockUser);
        assertEquals(mockUser,this.userService.findUserByUsername("adi"));

    }

    /**
     * This test verifies functionality of retrieving  User by user Id
     * @throws Exception
     */
    @Test
    public void findUserByUserId() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findById(1)).thenReturn(mockUser);
        given(this.userService.findUserByUserId(1)).willReturn(mockUser);
        assertEquals(mockUser,this.userService.findUserByUserId(1));
    }

    /**
     * This test verifies functionality of new User creation
     * @throws Exception
     */
    @Test
    public void createUser() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.save(mockUser)).thenReturn(mockUser);
        given(this.userService.createUser(mockUser)).willReturn(mockUser);
        assertEquals(mockUser,this.userService.createUser(mockUser));
    }

    /**
     * This test verifies functionality of retrieving of Users of specific User type (Legal User Types : Student,
     * Admin,Professor)
     * @throws Exception
     */
    @Test
    public void findByUserType() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findByUserType("Student")).thenReturn(mockUser);
        given(this.userService.findByUserType("Student")).willReturn(mockUser);
        assertEquals(mockUser,this.userService.findByUserType("Student"));
    }

    /**
     * This test verifies functionality of retrieving of unapproved Professors and Admin users
     * @throws Exception
     */
    @Test
    public void findProfessors() throws Exception {
        User mockUser1 = new User(1, "Aditya","Kumar","Professor","adi", "adi","adidkool1@gmail.com","false");
        User mockUser2 = new User(2, "Aditya","Kumar","Admin","adi", "adi","adidkool1@gmail.com","false");
        List<User> professorAdminList = new ArrayList<>();
        professorAdminList.add(mockUser1);
        professorAdminList.add(mockUser2);
        when(userRepository.findProfessors()).thenReturn(professorAdminList);
        given(this.userService.findProfessors()).willReturn(professorAdminList);
        assertEquals(professorAdminList.get(0).getId(), this.userService.findProfessors().get(0).getId());
    }

    /**
     * This test verifies functionality of approving Professors and Admin user approval requests
     * @throws Exception
     */
    @Test
    public void updateUser() throws Exception {
        User mockUser1 = new User(1, "Aditya","Kumar","Professor","adi", "adi","adidkool1@gmail.com","false");
        when(userRepository.save(mockUser1)).thenReturn(mockUser1);
        given(this.userService.updateUser(mockUser1)).willReturn(mockUser1);
        assertEquals(mockUser1.getId(),this.userService.updateUser(mockUser1).getId());
    }

}