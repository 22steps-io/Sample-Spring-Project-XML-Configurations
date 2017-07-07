package com.sidda.repository;

import java.util.List;

import com.sidda.model.Employee;

public interface EmployeeRepository {

	List<Employee> findAll();

}