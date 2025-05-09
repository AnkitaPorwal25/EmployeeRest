package com.example.demo.service;

import com.example.demo.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(int id, Employee updatedEmployee);
    void deleteEmployee(int id);
    Employee partialUpdateEmployee(int id, Map<String, Object> updates);
}
