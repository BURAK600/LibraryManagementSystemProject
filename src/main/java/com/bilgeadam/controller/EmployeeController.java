package com.bilgeadam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bilgeadam.entity.Employee;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.EmployeeService;

public class EmployeeController {
	
	EmployeeService employeeService;
	Scanner scanner = new Scanner(System.in);

	UserInformationController userInformationController;

	public EmployeeController() {
		this.employeeService = new EmployeeService();
		this.userInformationController = new UserInformationController();

	}

	public Employee createEmployee() {

		System.out.println("Lutfen kullanıcı isminizi giriniz");
		String userName = scanner.nextLine();

		System.out.println("lutfen sifrenizi giriniz: ");
		String password = scanner.nextLine();

		Employee user = new Employee(userName, password);

		UserInformation userInformation = userInformationController.createUserInformation();

		userInformation.setUser(user);
		return employeeService.save(user);
	}
	
	public Employee updateEmployee() {
		return null;
		
	}
	
	public List<Employee> findAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		employees = employeeService.findAll();
		
		return employees;
	}
	
	public Optional<Employee> findByIdEmployee(Long id) {
		
		Optional<Employee> employee = employeeService.findById(id);
		return employee;
	}
	
	public void deleteIdEmployee(Long id) {
		employeeService.deleteById(id);
	}
	
	
	
	public void deleteEmployee(Employee employee) {
		employeeService.delete(employee);
	}

}
