package com.hcl.hibernatepractise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.hibernatepractise.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
