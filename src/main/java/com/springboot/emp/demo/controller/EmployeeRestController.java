package com.springboot.emp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.emp.demo.entity.Employee;
import com.springboot.emp.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	
	@Autowired
	public EmployeeService empService;
	
	@GetMapping("/details")
	public String getEmployee()
	{
		Employee empDetail = empService.getEmpDetails();
		
		return empDetail.getFirstName()+" "+empDetail.getLastName();
	}

}
