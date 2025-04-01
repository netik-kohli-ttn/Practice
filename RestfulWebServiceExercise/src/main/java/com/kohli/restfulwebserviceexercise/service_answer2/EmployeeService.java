package com.kohli.restfulwebserviceexercise.service_answer2;

import com.kohli.restfulwebserviceexercise.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

    // Answer 2

    @Autowired
    Employee employee;

    List<Employee> employeesList;
    EmployeeService() {
        employeesList = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
         employeesList.add(employee);
    }

    public List<Employee> getEmployee() {
        return employeesList;
    }

    public String deleteEmployee(int id) {
        for(int i = 0 ; i < employeesList.size() ; i++) {
            if(employeesList.get(i).getId() == id) {
                employeesList.remove(i);
                return "Employee with ID: " + id + " deleted";
            }
        }
        return "Wrong ID";
    }

    public String updateEmployee(Employee employee) {
        for(int i = 0 ; i < employeesList.size() ; i++) {
            if(employeesList.get(i).getId() == employee.getId()) {
                employeesList.set(i, employee);
                return "Employee Updated" ;
            }
        }
        return "No Employee found";
    }
}
