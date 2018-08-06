package com.northeastern.msd.team102.plagiarismchecker.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.repository.UserRepository;

/**
 * Service class for User entity.
 */
@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public static final Logger logger = Logger.getLogger(UserService.class.getName());

    /**
     * findUserByCredentials method returns user for a given username and password
     * @param user User
     * @return User
     */
    public User findUserByCredentials(User user) {
        logger.log(Level.INFO, "Returning user for username" + user.getUsername() + "and"
        + "password" + user.getPassword());
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    /**
     * findUserByUsername method returns a user for a given username
     * @param username Name of the user
     * @return User
     */
    public User findUserByUsername(String username) {

        logger.log(Level.INFO, "Returning user for username" + username);
        return userRepository.findByUsername(username);
    }

    /**
     * findUserByUserId method returns a user for a given user id.
     * @param userId
     * @return User
     */
    public User findUserByUserId(long userId) {

        logger.log(Level.INFO, "Returning user for userID" + userId);
        return userRepository.findById(userId);
    }

    /**
     * createUser method saves a user in the database
     * @param user
     * @return User
     */
    public User createUser(User user) {

        logger.log(Level.INFO, "Creating user with username " + user.getUsername());
        User u = findUserByUsername(user.getUsername());
        if( u == null) {
            if(user.getUserType().equals("Student")){
                user.setStatusFlag("true");
            }else{user.setStatusFlag("false");}
            return userRepository.save(user);
        }
        return null;
    }

    /**
     * findByUserType method returns a user by user type.
     * @param userType
     * @return User
     */
    public User findByUserType(String userType) {

        logger.log(Level.INFO, "Returning user with type " + userType);
        return userRepository.findByUserType(userType);
    }

    /**
     * updateUser method updates an existing user in the database
     * @param user
     * @return User
     */
    public User updateUser(User user) {
        logger.log(Level.INFO, "Updating user with username " + user.getUsername());
        return userRepository.save(user);
    }


     /**
     * findProfessors method finds a list of Professor and Admin users
     * having statusFlag as false
     * @return a list of Professor and Admin users
     */
    public List<User> findProfessors(){
        List<User> processedProcessors= new ArrayList<>();
        List<User> unprocessedProcessors = userRepository.findProfessors();
        for(User eachProfessor : unprocessedProcessors){
            User processedProfessor= new User();
            processedProfessor.setId(eachProfessor.getId());
            processedProfessor.setUsername(eachProfessor.getUsername());
            processedProfessor.setFirstName(eachProfessor.getFirstName());
            processedProfessor.setLastName(eachProfessor.getLastName());
            processedProfessor.setEmail(eachProfessor.getEmail());
            processedProfessor.setUserType(eachProfessor.getUserType());
            processedProcessors.add(processedProfessor);
        }
        return processedProcessors;
    }

    /**
     * setUserStatus methods sets the status_Flag of userId passed in
     * parameters
     * @param userIdList An array of long having userIds of Professor and Admin users
     *                   to be approved
     */
    public void setUserStatus(long[] userIdList){
        for(long eachUserId : userIdList) {
                userRepository.setUserStatus(eachUserId);
        }
    }
}
