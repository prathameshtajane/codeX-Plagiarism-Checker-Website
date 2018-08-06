package com.northeastern.msd.team102.plagiarismchecker.entity;

import javax.persistence.*;

/**
 * Course entity.
 */
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "course_user_association"))
    private User user;

    /**
     * Constructor for Course class
     */
    public Course() {
        //Default Constructor
    }

    public Course(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.user = user;
    }

    /**
     * Getter for courseId
     */
    public long getId() {
        return id;
    }

    /**
     * Setter for courseId
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter for name of the course.
     * @return Name of the course
     */
    public String getName() {
        return name;
    }


    /**
     * Setter for name of the course.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for course description.
     * @return Description of the course
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for course description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for user who created the course
     * @return User object
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter for user who creates the course
     */
    public void setUser(User user) {
        this.user = user;
    }
}
