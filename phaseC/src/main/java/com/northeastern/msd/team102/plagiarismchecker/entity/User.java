package com.northeastern.msd.team102.plagiarismchecker.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User entity.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "userType")
    private String userType;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "statusFlag")
    private String statusFlag;

    /**
     * Constructor for User class
     * @param id id of the user
     * @param firstName firstName of the user
     * @param lastName lastName of the user
     * @param userType userType of the user
     * @param username username of the user
     * @param password password of the user
     * @param lastName lastName of the user
     * @param email email of the user
     * @param statusFlag indicates status of user
     */

    public User(long id, String firstName, String lastName, String userType, String username, String password, String email,String statusFlag) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.email = email;
        this.statusFlag=statusFlag;
    }

    /**
     * Constructor for User class
     * @param id id of the user
     * @param firstName firstName of the user
     * @param lastName lastName of the user
     * @param lastName lastName of the user
     * @param lastName lastName of the user
     * @param lastName lastName of the user
     * @param email email of the user
     */
    public User(long id, String firstName, String lastName, String userType, String username, String password, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.email = email;
    }


    /**
     * Default constructor
     */
    public User() {

    }

    /**
     * Getter for userId.
     * @return id of the user.
     */
    public long getId() {
        return id;
    }

    /**
     * Setter for userId.
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter for first name.
     * @return first name of the user.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for first name.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for last name
     * @return last name of the user.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for user type.
     * @return type of the user.
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Setter for user type.
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * Getter for username.
     * @return username for the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for username.
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for user password.
     * @return password for the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for password.
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for user email.
     * @return email for the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for email.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for User Status Flag
     * @return current status of User
     */
    public String getStatusFlag() {
        return statusFlag;
    }

    /**
     * Setter for User Status Flag
     */
    public void setStatusFlag(String statusFlag) {
        this.statusFlag = statusFlag;
    }

}
