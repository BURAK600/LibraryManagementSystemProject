package com.bilgeadam.controller;

import java.util.Scanner;

import com.bilgeadam.entity.User;
import com.bilgeadam.service.UserService;

public class UserController {

	UserService userService;

	Scanner scanner = new Scanner(System.in);

	public UserController() {

		this.userService = new UserService();

	}

	public User createUser() {

		System.out.println("Lutfen kullanıcı isminizi giriniz");

		String userName = scanner.nextLine();
		System.out.println("lutfen sifrenizi giriniz: ");
		String sifre = scanner.nextLine();

		return userService.save(new User(userName, sifre));

	}

	public User findByUserNameAndPassword(String userName, String password) {

		return (User) userService.findByColumnAndValue(userName, password);
	}

}
