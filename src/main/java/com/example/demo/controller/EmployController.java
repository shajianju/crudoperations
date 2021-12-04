package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployController {

	@Autowired
	EmployServiceImpl employServiceImpl;

	@PostMapping("/addEmp") 
	public Employee addEMploy(@RequestBody Employee employee) {

		employServiceImpl.addEmploy(employee);
		return employee;
	}


	@GetMapping("/login")
	public String getData() {
		return "Welcome page";
	}


	@GetMapping("/listAll")
	public List<Employee> getAllEmployee(){

		return employServiceImpl.listAll();

	}

	@PostMapping("/editEmp")
	public Employee editEmployee(@RequestBody Employee emp) {

		employServiceImpl.editEmploye(emp);
		return employServiceImpl.getEmpDetails(emp.getEmpId());
	}

	@DeleteMapping("/removeEmp/{id}")
	public List<Employee> deleteEmp(@PathVariable long id) {

		employServiceImpl.deletEmploy(id);
		return employServiceImpl.listAll();

	}

	@GetMapping("/empDetail/{id}")
	public Employee getEmp(@PathVariable long id) {

		return employServiceImpl.getEmpDetails(id);
	}


}
