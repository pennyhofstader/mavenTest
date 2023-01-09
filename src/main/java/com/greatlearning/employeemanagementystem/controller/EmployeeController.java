package com.greatlearning.employeemanagementystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.employeemanagementystem.entity.Employee;
import com.greatlearning.employeemanagementystem.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/employees")
	public String indexPage(Model theModel) {
		List<Employee> employee = empService.getAllEmployees();
		theModel.addAttribute("employee",employee);
		return "index";
	}

	@GetMapping("/addEmployee")
	public String addEmployeePage() {

		
		return "addEmployee";
	}

	@PostMapping("/create")
	public String createEmployee(@ModelAttribute Employee e) {

		empService.addEmployee(e);
		return "redirect:/employees";
	}
	
	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable int id, Model theModel) {
		
		Employee e = empService.getEmployeeById(id);
		theModel.addAttribute("e",e);
		return "editEmployee";
		
	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee e) {
		
		empService.addEmployee(e);
		return "redirect:/employees";
		
	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id, Model theModel) {
		
		empService.deleteEmployee(id);
		return "redirect:/employees";
		
	}
	
}
