package com.gl.JPA.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.JPA.EmployeeManagement.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
