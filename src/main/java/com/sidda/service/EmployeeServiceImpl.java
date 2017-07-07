package com.sidda.service;

import java.util.List;

import com.sidda.model.Employee;
import com.sidda.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	// This is where Spring is going to help us by resolving hardcoded declarations
	private EmployeeRepository employeeRepository ;
	
	
	/* (non-Javadoc)
	 * @see com.sidda.service.EmployeeService#findAll()
	 */
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}


	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
}
