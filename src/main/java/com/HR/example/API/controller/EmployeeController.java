package com.HR.example.API.controller;


import com.HR.example.API.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.HR.example.API.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/employees") // HTTP GET request will be handled by this method
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }


//    /**
//     * Create - Add a new employee
//     * @param employee An object employee
//     * @return The employee object saved
//     */
//    @PostMapping("/employees") // HTTP POST request will be handled by this method
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeService.saveEmployee(employee);
//    }
//
//    /**
//     * Read - Get one employee
//     * @param id The id of the employee
//     * @return An Employee object full filled
//     */
//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable("id") final Long id) { // PathVariable annotation is used to bind the id value from the URL to the id parameter of the method
//        Optional<Employee> employee = employeeService.getEmployee(id); //  Optional<Employee> is used to avoid NullPointerException and Call the getEmployee method from the EmployeeService class and pass the id as a parameter .
//        if(employee.isPresent()) {
//            return employee.get();
//        }else {
//            return null;
//        }
//    }
//
//
//
//
//    /**
//     * Update - Update an existing employee
//     * @param id - The id of the employee to update
//     * @param employee - The employee object updated
//     * @return
//     */
//    @PutMapping("/employee/{id}")
//    public Employee updateEmployee(@PathVariable("id") final Long id, @RequestBody Employee employee) {
//        Optional<Employee> e = employeeService.getEmployee(id);
//        if(e.isPresent()) {
//            Employee currentEmployee = e.get();
//
//            String firstName = employee.getFirstName();
//            if(firstName != null) {
//                currentEmployee.setFirstName(firstName);
//            }
//            String lastName = employee.getLastName();
//            if(lastName != null) {
//                currentEmployee.setLastName(lastName);
//            }
//            String mail = employee.getMail();
//            if(mail != null) {
//                currentEmployee.setMail(mail);
//            }
//            String password = employee.getPassword();
//            if(password != null) {
//                currentEmployee.setPassword(password);
//            }
//            employeeService.saveEmployee(currentEmployee);
//            return currentEmployee;
//        } else {
//            return null;
//        }
//    }
//
//    /**
//     * Delete - Delete an employee
//     * @param id - The id of the employee to delete
//     */
//    @DeleteMapping("/employee/{id}")
//    public void deleteEmployee(@PathVariable("id") final Long id) {
//        employeeService.deleteEmployee(id);
//    }
}
