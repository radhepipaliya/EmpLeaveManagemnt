package com.learning.backend.service;


import com.learning.backend.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployee();
}
