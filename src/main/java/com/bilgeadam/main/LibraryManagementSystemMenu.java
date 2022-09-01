package com.bilgeadam.main;

import java.util.List;
import java.util.Scanner;

import com.bilgeadam.controller.UserController;
import com.bilgeadam.entity.User;
import com.bilgeadam.service.UserService;

public class LibraryManagementSystemMenu {

	Scanner scanner = new Scanner(System.in);
	UserService userService = new UserService();
	UserController userController = new UserController();

	public static void main(String[] args) {

		LibraryManagementSystemMenu libraryManagementSystemMenu = new LibraryManagementSystemMenu();

		libraryManagementSystemMenu.mainMenu();

	}

	public void mainMenu() {

		int input = 2;
		do {

			System.out.println("1-Giris");
			System.out.println("2-Cıkıs");

			System.out.println("Lutfen Islem Seciniz");

			input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				login();

				break;

			default:
				break;
			}

		} while (input != 2);

	}

	private void login() {

		System.out.println("Username giriniz: ");
		String userName = scanner.nextLine();
		System.out.println("Password giriniz: ");
		String password = scanner.nextLine();
		User user;
		List<User> users = userService.findByColumnAndValue("userName", userName);
		users.forEach(System.out::println);

		if (users.size() > 0) {
			user = users.get(0);
			if (user.getPassword().equals(password)) {
				System.out.println("Kullanıcı bulundu");
				System.out.println(user);

			} else {
				System.out.println("Kullanıcı bulunamadı");
			}

		} else {
			System.out.println("Kullanıcı bulunamadı");
		}

	}

}
