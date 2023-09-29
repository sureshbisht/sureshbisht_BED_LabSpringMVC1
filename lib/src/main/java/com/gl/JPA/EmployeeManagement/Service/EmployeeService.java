package com.gl.JPA.EmployeeManagement.Service;

import java.util.List;

import com.gl.JPA.EmployeeManagement.Entity.Employee;


public interface EmployeeService {
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);
}
