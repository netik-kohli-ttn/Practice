package com.kohli.restfulwebserviceexercise;

import com.kohli.restfulwebserviceexercise.service.EmployeeServiceAnswer2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Answer2 {

    @Autowired
    EmployeeServiceAnswer2 employeeService;

    @GetMapping("employee/get")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @PostMapping("employee/add")
    public List<Employee> addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employeeService.getEmployee();
    }
}
