package com.learning.backend.controller;

import com.learning.backend.model.Employee;
import com.learning.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemp")
    public String add(@RequestBody Employee employee){
      employeeService.saveEmployee(employee);
      return "NewStudent is added";
    }

    @GetMapping("/getall")
    public List<Employee> getALlEmployee(){
        System.out.println("->>"+employeeService.getAllEmployee());
        return employeeService.getAllEmployee();
    }

}
