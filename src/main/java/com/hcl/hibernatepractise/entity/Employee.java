package com.hcl.hibernatepractise.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String empName;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Employee_Address> employeeAddress;

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<Employee_Address> getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Set<Employee_Address> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", employeeAddress=" + employeeAddress + "]";
	}

}
