package com.northeastern.msd.team102.plagiarismchecker.repository;


import com.northeastern.msd.team102.plagiarismchecker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Repository for User entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * findByUsernameAndPassword method returns a user for specified username and password
     * @param username
     * @param password
     * @return user
     */
    User findByUsernameAndPassword(String username, String password);

    /**
     * findByUsername method returns a user for specified username
     * @param username
     * @return user
     */
    User findByUsername(String username);

    /**
     * findById method returns a user for specified user id.
     * @param userId
     * @return user
     */
    User findById(long userId);

    /**
     * findByUserType method returns a user for specified user type.
     * @param userType
     * @return user
     */
    User findByUserType(String userType);

    /**
     * findProfessors method returns a list of Professors and Admin users with status flag as false
     * @return a list of Preofessor and Admin users
     */
    @Query(nativeQuery=true, value="SELECT * FROM user u where u.user_type = 'Professor'  AND  u.status_flag = 'false' OR u.user_type = 'Admin'  AND  u.status_flag = 'false'")
    List<User> findProfessors();

    /**
     * setUserStatus method sets the status_flag of given userId
     * @param userId user id
     * @return 1 if updatation is succesfull else 0
     */
    @Modifying
    @Transactional
    @Query(nativeQuery=true, value="UPDATE user u SET u.status_flag ='true' WHERE u.id = ?1")
    int setUserStatus(long userId);
}

