package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployService {

	public Employee addEmploy(Employee employee);
	public Employee editEmploye(Employee employee);
	public List<Employee> deletEmploy(long id);
	public List<Employee> listAll();
	public Employee getEmpDetails(long id);

}
