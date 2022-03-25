package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployRepo;

@Service
public class EmployServiceImpl implements EmployService{

	@Autowired
	EmployRepo employRepo;

	@Override
	public Employee addEmploy(Employee employee) {

		employRepo.save(employee);

		return employee;
	}

	@Override
	public Employee editEmploye(Employee employee) {

		Employee emp=getEmpDetails(employee.getEmpId());

		emp.setEmpAccount(employee.getEmpAccount());
		emp.setEmpEmailId(employee.getEmpEmailId());
		emp.setEmpName(employee.getEmpName());
		emp.setEmpProject(employee.getEmpProject());
		emp.setEmpId(employee.getEmpId());

		employRepo.saveAndFlush(employee);

		return getEmpDetails(employee.getEmpId());
	}

	@Override
	public List<Employee> deletEmploy(long id) {

		employRepo.deleteById(id);

		return listAll();
	}

	@Override
	public List<Employee> listAll() {
		return  employRepo.findAll();
	}

	@Override
	public Employee getEmpDetails(long id) {
		Optional<Employee> emp= employRepo.findById(id);
		return emp.get();
	}

}
