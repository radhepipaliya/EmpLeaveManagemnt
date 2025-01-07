package com.learning.backend.repository;

import com.learning.backend.model.LeaveDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;

@EnableJpaRepositories
public interface LeaveDetailsRepository extends JpaRepository<LeaveDetails,Long> {

    @Query("SELECT l FROM LeaveDetails l WHERE l.employeeid = ?1")
    List<LeaveDetails> findByEmployeeId(@Param("employee_id") Long employeeid);



}
