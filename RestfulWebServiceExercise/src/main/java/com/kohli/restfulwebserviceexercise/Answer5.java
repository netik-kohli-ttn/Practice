package com.kohli.restfulwebserviceexercise;

import com.kohli.restfulwebserviceexercise.service.EmployeeServiceAnswer2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class Answer5 {
    @Autowired
    EmployeeServiceAnswer2 employeeService;

    @PostMapping("employee/add")
    public List<Employee> addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employeeService.getEmployee();
    }
}
