package com.example.etask.controller;

import com.example.etask.model.Employee;
import com.example.etask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:8080") // 前端的 URL
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return EmployeeService.findAll();
    }

    @GetMapping("/{empId}")
    public Optional<Employee> getEmployeeById(@PathVariable String empId) {
        return EmployeeService.findById(empId);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return EmployeeService.save(employee);
    }

    @PutMapping("/{empId}")
    public Employee updateEmployee(@PathVariable String empId, @RequestBody Employee employee) {
        employee.setEmpId(empId);
        return EmployeeService.save(employee);
    }

    @DeleteMapping("/{empId}")
    public void deleteEmployee(@PathVariable String empId) {
        EmployeeService.deleteById(empId);
    }
}
