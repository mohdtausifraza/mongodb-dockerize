package com.tausif.mongodbdockerize.controller;

import com.tausif.mongodbdockerize.model.Employee;
import com.tausif.mongodbdockerize.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee Added Successfully ::"+employee.getId();
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/findEmployee/{id}")
    public Optional<Employee> findEmployeesById(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return "Deleted Employee successfully ::"+id;
    }
}
