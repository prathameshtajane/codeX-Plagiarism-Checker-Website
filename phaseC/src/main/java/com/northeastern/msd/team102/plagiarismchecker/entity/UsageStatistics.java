package com.northeastern.msd.team102.plagiarismchecker.entity;
import javax.persistence.*;
import java.util.Date;

/**
 * UsageStatistics entity.
 */
@Entity
public class UsageStatistics {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "timestamp")
    @Temporal(TemporalType.DATE)
    private Date timestamp;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "usagestatistics1_user1_association"))
    private User professor;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "usagestatistics1_user2_association"))
    private User student;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "usagestatistics1_course1_association"))
    private Course course;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "usagestatistics1_homework1_association"))
    private Homework homework;

    @Column(name = "compareCount")
    private double compareCount;

    @Column(name = "algoType")
    private String algoType;

    /**
     * constructor for Usage Statictics
     * @param timestamp: current/local time of file comparison
     * @param professor: User performing the comparison
     * @param student: User against whom the comparison is taking place with all the student users
     * @param course: Course of the selected student user
     * @param homework: homework folder of the selected sudent user
     * @param compareCount: total number of comparisons made
     */
    public UsageStatistics(Date timestamp, User professor, User student, Course course,
                           Homework homework, double compareCount, String algoType) {
        this.timestamp = timestamp;
        this.professor = professor;
        this.student = student;
        this.course = course;
        this.homework = homework;
        this.compareCount = compareCount;
        this.algoType = algoType;
    }

    /**
     * Default constructor
     */
    public UsageStatistics() {}

    /**
     * getter for id
     * @return id for usage statistics
     */
    public long getId() {
        return id;
    }

    /**
     * setter for id
     * @param id for UsageStatictics table
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * getter for current timestamp
     * @return current timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * setter for current timestamp
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * getter for Professor
     * @return professor: USer
     */
    public User getProfessor() {
        return professor;
    }

    /**
     * setter for Professor
     * @param professor: User
     */
    public void setProfessor(User professor) {
        this.professor = professor;
    }

    /**
     * getter for Student
     * @return student: User
     */
    public User getStudent() {
        return student;
    }

    /**
     * setter for Student
     * @param student: User
     */
    public void setStudent(User student) {
        this.student = student;
    }

    /**
     * getter for Course
     * @return course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * setter for Course
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * getter for Homework
     * @return homework
     */
    public Homework getHomework() {
        return homework;
    }

    /**
     * setter for homework
     * @param homework
     */
    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    /**
     * getter for total no of comparisons done by given professor, of the current student for homework and course selected
     * @return compareCount
     */
    public double getCompareCount() {
        return compareCount;
    }

    /**
     * setter for total no of comparisons done by given professor, of the current student for homework and course selected
     * @param compareCount
     */
    public void setCompareCount(double compareCount) {
        this.compareCount = compareCount;
    }

    /**
     * getter for the comparator strategy used for comparison
     * @return algoType
     */
    public String getAlgoType() {
        return algoType;
    }

    /**
     * setter for the comparator strategy used for comparison
     * @param algoType
     */
    public void setAlgoType(String algoType) {
        this.algoType = algoType;
    }
}
