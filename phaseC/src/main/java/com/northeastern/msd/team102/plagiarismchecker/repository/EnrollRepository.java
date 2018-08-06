package com.northeastern.msd.team102.plagiarismchecker.repository;

import com.northeastern.msd.team102.plagiarismchecker.entity.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollRepository extends JpaRepository<Enroll, Long> {

    /**
     * findAllByUserId method finds all enrollments by specified userId.
     * @param userId
     * @return List of enroll for the specified userId.
     */
    List<Enroll> findAllByUserId(long userId);


}
