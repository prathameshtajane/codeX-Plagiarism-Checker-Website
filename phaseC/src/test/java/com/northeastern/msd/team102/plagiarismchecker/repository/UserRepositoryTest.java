package com.northeastern.msd.team102.plagiarismchecker.repository;

import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

/**
 * Test cases for User Repository
 */

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserRepository.class, secure = false)
public class UserRepositoryTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;


    @Test
    public void findByUsernameAndPassword() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findByUsernameAndPassword("adi","adi")).thenReturn(mockUser);
        given(this.userRepository.findByUsernameAndPassword("adi","adi")).willReturn(mockUser);
        assertEquals(mockUser,this.userRepository.findByUsernameAndPassword("adi","adi"));
    }

    @Test
    public void findByUsername() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findByUsername("adi")).thenReturn(mockUser);
        given(this.userRepository.findByUsername("adi")).willReturn(mockUser);
        assertEquals(mockUser,this.userRepository.findByUsername("adi"));
    }

    @Test
    public void findById() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findById(1)).thenReturn(mockUser);
        given(this.userRepository.findById(1)).willReturn(mockUser);
        assertEquals(mockUser,this.userRepository.findById(1));
    }

    @Test
    public void findByUserType() throws Exception {
        User mockUser = new User(1, "Aditya","Kumar","Student","adi", "adi","adidkool1@gmail.com");
        when(userRepository.findByUserType("Student")).thenReturn(mockUser);
        given(this.userRepository.findByUserType("Student")).willReturn(mockUser);
        assertEquals(mockUser,this.userRepository.findByUserType("Student"));
    }

}