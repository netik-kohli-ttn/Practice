package com.kohli.SpringBootExercise;

import com.kohli.SpringBootExercise.answer3.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}