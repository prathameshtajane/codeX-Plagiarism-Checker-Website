package com.northeastern.msd.team102.plagiarismchecker.entity;

import javax.persistence.*;

/**
 * File entity.
 */
@Entity
public class File {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "filename")
    private String filename;
    @Column(name = "file")
    @Lob
    private byte[] file;
    @Column(name = "mimeType")
    private String mimeType;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "file_course_association"))
    private Course course;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "file_homework_association"))
    private Homework homework;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "file_user_association"))
    private User user;

    /**
     * Constructor for File class
     * @param filename File name
     * @param file file in bytes array
     * @param mimeType mimeType of the file.
     */
    public File(String filename, byte[] file, String mimeType) {
        this.file = file;
        this.filename = filename;
        this.mimeType = mimeType;
    }

    /**
     *  Default Constructor
     */
    public File() {

    }

    /**
     * Getter for Homework.
     * @return the homework object for the given file.
     */
    public Homework getHomework() {
        return homework;
    }

    /**
     * Setter for homework
     * @param homework Homework object for the given file.
     */
    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    /**
     * Getter for User.
     * @return returns the user for the particular file.
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
     * Getter for id.
     * @return returns the id for the file.
     */
    public long getId() {
        return id;
    }

    /**
     * Setter for id.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter for filename.
     * @return returns the name of the file.
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Setter for filename.
     * @param filename name of the file.
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Getter for file in byte array .
     * @return returns the file in byte array.
     */
    public byte[] getFile() {
        return file;
    }

    /**
     * Setter for file.
     * @param file byte array of the file.
     */
    public void setFile(byte[] file) {
        this.file = file;
    }

    /**
     * Getter for mimeType .
     * @return returns the mimeType of the file.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Setter for mimeType
     * @param mimeType mimeType of the file
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Getter for Course.
     * @return the Course object for the given file.
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
}
