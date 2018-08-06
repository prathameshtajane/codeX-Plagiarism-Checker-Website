package com.northeastern.msd.team102.plagiarismchecker.controller;

import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.service.UserService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Controller class for User entity.
 */
@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    private UserService userService;

    public static final Logger logger = Logger.getLogger(UserController.class.getName());

    /**
     * Login method which receives the request for login.
     * @param user  User object
     * @return returns the user object whose login is requested.
     */
    @PostMapping("/login")
    public User login(@RequestBody User user, HttpSession session) {
        logger.log(Level.INFO, "User with username: " + user.getUsername() + "logged in");
        User loginUser = userService.findUserByCredentials(user);
        if(loginUser !=  null)
            session.setAttribute("User", user);
        return loginUser;
    }

    /**
     * loggedIn method to check if the user is logged in.
     * @return returns the user object which is logged in.
     */
    @GetMapping("/loggedIn")
    public User loggedIn(HttpSession session) {
        logger.log(Level.INFO, "LoggedIn function to check for session");
        return (User)session.getAttribute("User");
    }

    /**
     * logout method to invalidate a session.
     */
    @GetMapping("/logout")
    public void logout(HttpSession session) {
        logger.log(Level.INFO, "Logout function to invalidate a session");
        session.invalidate();
    }

    /**
     * findUserByUsername method which receives the request for getting the user by username.
     * @param username
     * @return returns the user object for a given username.
     */
    @GetMapping("/findUserByUsername")
    public User findUserByUsername(@RequestParam("username") String username) {
        logger.log(Level.INFO, "Returning user object with username: " + username);
        return userService.findUserByUsername(username);
    }

    /**
     * findUserByUserId method which receives the request for getting the user by userID.
     * @param userId
     * @return returns the user object for a given username.
     */
    @GetMapping("/findUserByUserId")
    public User findUserByUserId(@RequestParam("userId") String userId){
        logger.log(Level.INFO, "Returning user with id: " + userId);
        long userID = Long.parseLong(userId);
        return userService.findUserByUserId(userID);
    }

    /**
     * findProfessor method which receives the request for fetching the professor.
     * @return returns the user object who is a professor.
     */
    @GetMapping("/findProfessor")
    public User findProfessor() {
        logger.log(Level.INFO, "Returning professor object");
        return userService.findByUserType("Professor");
    }


    /**
     * findProfessors method which receives a request for fetching professors and
     * admin with Status flag false
     * @return A List of Professors and Admin users
     */
    @GetMapping("/findProfessors")
    public List<User> findProfessors() {
        return userService.findProfessors();
    }
    
    /**
     * setUserStatus method receives a post for setting user status of
     * professors and admin users
     * @param approvedProfessorList a list of userIds of professors and admins users
     *                              to be approved
     */
    @PostMapping("/setUserStatus")
    public void setUserStatus(@RequestBody long[] approvedProfessorList) {
        userService.setUserStatus(approvedProfessorList);
    }

    /**
     * registerUser method for registering a user.
     * @param user
     * @return returns the user object that is registered.
     */
    @PostMapping("/registerUser")
    public User registerUser(@RequestBody User user, HttpSession session) {
        logger.log(Level.INFO, "Registering User with username: " + user.getUsername());
        User u = userService.createUser(user);
        if(u != null)
            session.setAttribute("User", user);
        return u;
    }

    /**
     * updateUser method updates the user fields.
     * @param user
     * @return returns the user object that is updated.
     */
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        logger.log(Level.INFO, "Updating User with username: " + user.getUsername());
        return userService.updateUser(user);
    }
}
