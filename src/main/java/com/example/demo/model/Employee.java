package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "emp_id")
	private long empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "emp_account")
	private String empAccount;
	
	@Column(name = "emp_project")
	private String empProject;
	
	@Column(name = "emp_email")
	private String empEmailId;

	public long getEmpId() {
		return empId;
	}	

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAccount() {
		return empAccount;
	}

	public void setEmpAccount(String empAccount) {
		this.empAccount = empAccount;
	}

	public String getEmpProject() {
		return empProject;
	}

	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	
	
	
	

}
