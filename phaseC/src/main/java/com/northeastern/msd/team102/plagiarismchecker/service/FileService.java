package com.northeastern.msd.team102.plagiarismchecker.service;

import com.northeastern.msd.team102.plagiarismchecker.entity.Course;
import com.northeastern.msd.team102.plagiarismchecker.entity.File;
import com.northeastern.msd.team102.plagiarismchecker.entity.Homework;
import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import com.northeastern.msd.team102.plagiarismchecker.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Service class for File entity.
 */
@Component
public class FileService {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private HomeworkService homeworkService;

    @Autowired
    private CourseService courseService;

    public static final Logger logger = Logger.getLogger(FileService.class.getName());

    /**
     * findByFilename method returns the file by a file name.
     * @param filename
     * @return Fileupload for the given file.
     */
    public File findByFilename(String filename) {
        logger.log(Level.INFO, "Returning file by filename: " + filename );
        return fileRepository.findByFilename(filename);
    }

    /**
     * findByFileId method returns the file by a file id.
     * @param fileId
     * @return Fileupload for the given file.
     */
    public File findByFileId(long fileId) {
        logger.log(Level.INFO, "Returning file by FileId: " + fileId );
        return fileRepository.findById(fileId);
    }

    /**
     * uploadFile method uploads the given file.
     * @param doc File to be uploaded
     * @param userId userId for the file.
     * @param hwId  hwId for the file.
     * @param courseId  courseId for the file.
     * @return Fileupload object.
     */
    public File uploadFile(File doc, long userId, long hwId, long courseId) {
        logger.log(Level.INFO, "Uploading file with filename: " + doc.getFilename() + "for userId: " + userId +
                "courseId: " + courseId + "and homeworkId" + hwId );
        User user = userService.findUserByUserId(userId);
        Course course = courseService.findById(courseId);
        Homework homework = homeworkService.findById(hwId);
        doc.setUser(user);
        doc.setHomework(homework);
        doc.setCourse(course);
        return fileRepository.saveAndFlush(doc);
    }

    /**
     * findAllByHomeworkId method returns all the files for specified homework
     * @param hwId homework Id
     * @return List of File object
     */
    public List<File> findAllByHomeworkId(long hwId) {

        logger.log(Level.INFO, "Returning all the files for hwId: " + hwId);
        return fileRepository.findAllByHomeworkId(hwId);
    }

    /**
     * findAllFileForOtherUser method returns all the files for other users and a given homework
     * @param hwId homework Id
     * @param userId user Id
     * @return List of File object.
     */
    public List<File> findAllFileForOtherUser(long hwId, long userId) {
        logger.log(Level.INFO, "Returning file for all users except " + userId  + "for homework: " + hwId);
        return fileRepository.findAllFileForOtherUser(hwId, userId);
    }

    public List<File> findAllFileForHomework(long userId, long courseId, long hwId ) {
        logger.log(Level.INFO, "Fetching files for userId: " + userId  + "courseId: " + courseId +
                 "and homeworkId" + hwId );
        return fileRepository.findAllByUserIdAndAndCourseIdAndHomeworkId(userId, courseId, hwId);
    }
}
