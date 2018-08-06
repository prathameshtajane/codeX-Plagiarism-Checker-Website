package com.northeastern.msd.team102.plagiarismchecker.repository;

import com.northeastern.msd.team102.plagiarismchecker.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for Homework entity.
 */
@Repository
public interface HomeworkRepository extends JpaRepository<Homework, Long> {

    /**
     * findAllByCourseId method finds all homework by specified courseId
     * @param courseId
     * @return List of homework for the specified courseId.
     */
    List<Homework> findAllByCourseId(long courseId);


    /**
     * findById method returns homework for the given id.
     * @param id
     * @return homework for a given id.
     */
    Homework findById(long id);
}