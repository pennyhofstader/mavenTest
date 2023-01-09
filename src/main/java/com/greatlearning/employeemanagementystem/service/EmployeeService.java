package com.greatlearning.employeemanagementystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagementystem.entity.Employee;
import com.greatlearning.employeemanagementystem.repositary.EmployeeRepositary;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepositary empRepositary;
	
	public void addEmployee(Employee e) {
		
		empRepositary.save(e);
		
	}
	
	public java.util.List<Employee> getAllEmployees(){
		return empRepositary.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		
		Optional<Employee> emp = empRepositary.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		return null;
	}
	
	public void deleteEmployee(int id) {
		
		 empRepositary.deleteById(id);
	}

}
