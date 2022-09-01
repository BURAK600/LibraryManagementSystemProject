package com.bilgeadam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bilgeadam.entity.Student;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.StudentService;

public class StudentController {

	StudentService studentService;
	Scanner scanner = new Scanner(System.in);

	UserInformationController userInformationController;

	public StudentController() {
		this.studentService = new StudentService();
		this.userInformationController = new UserInformationController();

	}

	public Student createStudent() {

		System.out.println("Lutfen kullanıcı isminizi giriniz");
		String userName = scanner.nextLine();

		System.out.println("lutfen sifrenizi giriniz: ");
		String password = scanner.nextLine();

		Student user = new Student(userName, password);

		UserInformation userInformation = userInformationController.createUserInformation();

		userInformation.setUser(user);
		return studentService.save(user);
	}

	public Student updateStudent(Student student) {

		return null;

	}

	public List<Student> findAllStudent() {

		List<Student> students = new ArrayList<Student>();
		students = studentService.findAll();

		return students;
	}

	public Optional<Student> findByIdStudent(Long id) {

		Optional<Student> student = studentService.findById(id);
		return student;
	}

	public void deleteIdStudent(Long id) {
		studentService.deleteById(id);
	}

	public void deleteStudent(Student student) {
		studentService.delete(student);
	}

}
