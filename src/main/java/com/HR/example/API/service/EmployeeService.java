package com.HR.example.API.service;


import lombok.Data;
import com.HR.example.API.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.HR.example.API.repository.EmployeeRepository;

import java.util.Optional;

@Data // Lombok annotation to generate getters, setters, equals, hashcode, and toString
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee( Employee employee) {

        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}
