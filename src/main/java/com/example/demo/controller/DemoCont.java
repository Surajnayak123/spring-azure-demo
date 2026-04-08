package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;

@RestController
@RequestMapping("/api/demo")
public class DemoCont {
	
	
	@GetMapping("/")
	public ResponseEntity hello() {
		return ResponseEntity.ok(employees);
	}
	
		List<Employee> employees = List.of(
	            new Employee(101, "Rahul", 50000.0),
	            new Employee(102, "Priya", 60000.0),
	            new Employee(103, "Amit", 55000.0),
	            new Employee(104, "Neha", 70000.0),
	            new Employee(105, "Vikas", 65000.0),
	            new Employee(106, "Sneha", 72000.0),
	            new Employee(107, "Rohit", 48000.0),
	            new Employee(108, "Anjali", 58000.0),
	            new Employee(109, "Karan", 62000.0),
	            new Employee(110, "Pooja", 75000.0)
	        );
}
