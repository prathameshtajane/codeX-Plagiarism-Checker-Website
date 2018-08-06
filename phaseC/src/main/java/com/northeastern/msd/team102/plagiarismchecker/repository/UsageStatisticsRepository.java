package com.northeastern.msd.team102.plagiarismchecker.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.northeastern.msd.team102.plagiarismchecker.entity.UsageStatistics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for UsageStatistics entity.
 */
@Repository
public interface UsageStatisticsRepository extends JpaRepository<UsageStatistics, Long> {

    /**
     * get list of all usage statistics for given professor Id
     * @param userId: Professor Id
     * @return list of usage statistics
     */
    @Query("select s from UsageStatistics s where professor_id = ?1")
    List<UsageStatistics> findAllByProfessor_Id(long userId);

    /**
     * get list of all usage statistics for given professor Id
     * @return list of usage statistics
     */
    @Query("select s from UsageStatistics s")
    List<UsageStatistics> findAll();
}
