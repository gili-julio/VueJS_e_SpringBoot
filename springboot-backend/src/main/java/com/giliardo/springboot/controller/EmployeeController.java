package com.giliardo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giliardo.springboot.entity.Employee;
import com.giliardo.springboot.repository.EmployeeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> fetchEmployees(){
		return employeeRepository.findAll();
	}
}
