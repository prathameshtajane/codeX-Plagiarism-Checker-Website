package com.northeastern.msd.team102.plagiarismchecker.repository;

import com.northeastern.msd.team102.plagiarismchecker.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Repository for File entity.
 */
public interface FileRepository extends JpaRepository<File, Long> {

    /**
     * findByFilename to fetch file by File name.
     * @param filename name of the file
     * @return File object for the particular filename.
     */
    File findByFilename(String filename);

    /**
     * findById method to return file by fileId.
     * @param fileId
     * @return File object for the given fileId
     */
    File findById(long fileId);

    /**
     * findAllByHomeworkId to fetch all the files for a particular homework.
     * @param hwId homework Id for the files to be fetched.
     * @return List of Fileuploads for the particular homework
     */
    List<File> findAllByHomeworkId(long hwId);

    /**
     * findAllFileForOtherUser to fetch all the files for other users.
     * @param hwId homework Id for the files to be fetched.
     * @param userId userId Id for the user whose file is not to be fetched..
     * @return List of Fileuploads for the particular homework and for users other than the
     * given userId.
     */
    @Query("Select f from File f where homework_id = ?1 and user_id <> ?2")
    List<File> findAllFileForOtherUser(long hwId, long userId);

    /**
     * findAllByUserIdAndAndCourseIdAndHomeworkId method return files for a particular userId, courseId and hwTd
     * @param userId
     * @param courseId
     * @param hwId
     * @return List of file.
     */
    List<File> findAllByUserIdAndAndCourseIdAndHomeworkId(long userId, long courseId, long hwId);
}
