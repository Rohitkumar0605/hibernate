package com.hcl.hibernatepractise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hibernatepractise.entity.Book;
import com.hcl.hibernatepractise.entity.BookCategory;
import com.hcl.hibernatepractise.entity.Employee;
import com.hcl.hibernatepractise.entity.Employee_Address;
import com.hcl.hibernatepractise.repository.BookCategoryRepository;
import com.hcl.hibernatepractise.repository.BookRepository;
import com.hcl.hibernatepractise.repository.EmployeeRepository;
import com.hcl.hibernatepractise.repository.Employee_AddressRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private Employee_AddressRepository employee_AddressRepository;

	@PostMapping("/createBook")
	public void createBook(@RequestBody Book book) {
		bookRepository.save(book);
	}

	@PostMapping("/createBookCategory")
	public void createBookCategory(@RequestBody BookCategory bookCategory) {
		bookCategoryRepository.save(bookCategory);
	}

	@PostMapping("/createEmployee")
	public void createEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}

	@PostMapping("/createEmployee_Address")
	public void createEmployee_Address(@RequestBody Employee_Address employee_Address) {
		employee_AddressRepository.save(employee_Address);
	}

}
