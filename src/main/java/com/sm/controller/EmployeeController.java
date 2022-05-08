package com.sm.controller;

import com.sm.model.Employee;
import com.sm.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department) {
        return employeeRepository.findAll()
                .stream()
                .filter(employee -> department.equals(employee.getDepartment()))
                .collect(Collectors.toList());
    }


    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }


    @PostMapping
    public ResponseEntity addEmployee() {
        String name = ("kazim"+ new Random().nextInt(100));
        employeeRepository.save(new Employee(name,"IT",35));
        return new ResponseEntity(HttpStatus.OK);
    }
}
