package com.dailycodebuffer.employee.services;


import com.dailycodebuffer.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public boolean deleteEmployee(Long id);

    public Employee getEmployeeById(Long id);

    public Employee updateEmployee(Long id, Employee employee);
}
