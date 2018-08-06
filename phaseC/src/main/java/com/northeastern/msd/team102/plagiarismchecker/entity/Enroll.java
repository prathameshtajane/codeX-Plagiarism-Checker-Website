package com.northeastern.msd.team102.plagiarismchecker.entity;

import javax.persistence.*;

/**
 * Enroll entity.
 */
@Entity
public class Enroll {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "enroll_user_association"))
    private User user;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "enroll_course_association"))
    private Course course;

    /**
     * Constructor for Enroll entity
      * @param user user enrolled
     * @param course course for which the user is enrolled.
     */
    public Enroll(User user, Course course) {
        this.user = user;
        this.course = course;
    }

    /**
     * Default constructor
     */
    public Enroll() {
        //Default Constructor
    }

    /**
     * Getter for enrollId
     */
    public long getId() {
        return id;
    }

    /**
     * Setter for enrollId
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter for user for the given enrollment
     * @return User object
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter for user object for the given enrollment
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Getter for course object for the given enrollment
     * @return User object
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Setter for course object for the given enrollment
     */
    public void setCourse(Course course) {
        this.course = course;
    }
}
