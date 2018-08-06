package com.northeastern.msd.team102.plagiarismchecker.repository;

import com.northeastern.msd.team102.plagiarismchecker.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for Report entity.
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

    /**
     * findAllByHomeworkIdAndUser1Id method returns all reports for specified homework id and user id.
     * @param hwId homework Id
     * @param userId user Id
     * @return List of reports.
     */
    @Query("select r from Report r join File f on file1_id = f.id where homework_id = ?1 and user_id = ?2")
    List<Report> findAllByHomeworkIdAndUserId(long hwId, long userId);
}
