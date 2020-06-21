package com.springboot.emp.demo.service;

import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.emp.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Value("${api.url}")
	String urlStr;
	@Override
	public Employee getEmpDetails() {
		
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL apiUrl = new URL(urlStr);
			
			Employee emp = mapper.readValue(apiUrl, Employee.class);
			return emp;
			
		} 
		catch (Exception exc) {
			exc.printStackTrace();
		}
		return null;
		
	}

}
