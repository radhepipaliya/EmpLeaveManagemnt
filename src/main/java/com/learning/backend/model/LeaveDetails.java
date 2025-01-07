package com.learning.backend.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="leave_details")
@Data
public class LeaveDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id")
    private Long employeeid;

    @JsonProperty("startDate")
    @Column(name="start_date")
    private String StartDate;
    @JsonProperty("endDate")
    @Column(name="end_date")
    private String EndDate;
    @Column(name="leave_type")
    private String LeaveType;
    @Column(name="reason")
    private String Reason;
    @Column(name="status")
    private String Status;

    public LeaveDetails() {
    }

    public LeaveDetails(Long id, Long employeeid, String startDate, String endDate, String leaveType, String reason, String status) {
        this.id = id;
        this.employeeid = employeeid;
        StartDate = startDate;
        EndDate = endDate;
        LeaveType = leaveType;
        Reason = reason;
        Status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Long employeeid) {
        this.employeeid = employeeid;
    }

    public String getStartDate(String startDate) {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        this.StartDate = startDate;
    }

    public String getEndDate(String endDate) {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        this.EndDate = endDate;
    }

    public String getLeaveType() {
        return LeaveType;
    }

    public void setLeaveType(String leaveType) {
        LeaveType = leaveType;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
