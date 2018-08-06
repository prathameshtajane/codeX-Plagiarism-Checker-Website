package com.northeastern.msd.team102.plagiarismchecker.entity;

import javax.persistence.*;

/**
 * Homework entity.
 */
@Entity
public class Homework {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "homework_user_association"))
    private User user;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "homework_course_association"))
    private Course course;

    /**
     * Constructor for Homework class
     */
    public Homework() {
        //Default Constructor
    }

    public Homework(String name, String description, User user, Course course) {
        this.name = name;
        this.description = description;
        this.user = user;
        this.course = course;
    }

    /**
     * Getter for HoemworkId
     * @return the hwId.
     */
    public long getId() {
        return id;
    }

    /**
     * Getter for User who created the homework.
     * @return User object
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter for User.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Getter for Course for which homework is created.
     * @return Course Object
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Setter for Course.
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * Getter for fetching the name of the homework
     * @return name of the homework
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for setting the name of the homework
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for homework description
     * @return returns the homework description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for homework description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

