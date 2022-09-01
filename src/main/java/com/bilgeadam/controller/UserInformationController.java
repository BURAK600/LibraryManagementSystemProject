package com.bilgeadam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bilgeadam.entity.Address;
import com.bilgeadam.entity.PhoneNumber;
import com.bilgeadam.entity.User;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.UserInformationService;
import com.bilgeadam.service.UserService;

public class UserInformationController {
	UserInformationService userInformationService;

	PhoneNumberController phoneNumberController;
	AddressController addressController;

	UserService userService;

	Scanner scanner = new Scanner(System.in);

	public UserInformationController() {

		this.userInformationService = new UserInformationService();
		this.phoneNumberController = new PhoneNumberController();
		this.addressController = new AddressController();
		this.userService = new UserService();
	}

	public UserInformation createUserInformation(User user) {
		System.out.println("lutfen adınızı giriniz: ");
		String ad = scanner.nextLine();

		System.out.println("lutfen soyadınızı giriniz: ");
		String soyad = scanner.nextLine();

		System.out.println("lutfen mailinizi giriniz: ");
		String email = scanner.nextLine();

		List<PhoneNumber> phoneNumbers = new ArrayList<>();
		List<Address> addresses = new ArrayList<>();

		phoneNumbers.add(phoneNumberController.createPhoneNumber());
		addresses.add(addressController.createAddress());

		UserInformation userInformation = new UserInformation(ad, soyad, email, phoneNumbers, addresses);
		userInformation.setUser(userService.findById(user.getId()).get());

		return userInformationService.save(userInformation);
	}

	public UserInformation createUserInformation() {
		System.out.println("Lütfen  isminizi giriniz");
		String name = scanner.nextLine();
		System.out.println("Lütfen soyadýnýzý giriniz");
		String lastName = scanner.nextLine();
		System.out.println("Lütfen e-mailnizi giriniz");
		String email = scanner.nextLine();
		List<PhoneNumber> phoneNumbers = new ArrayList<>();
		List<Address> addresses = new ArrayList<>();
		phoneNumbers.add(phoneNumberController.createPhoneNumber());
		addresses.add(addressController.createAddress());
		UserInformation userInformation = new UserInformation(name, lastName, email, phoneNumbers, addresses);
		return userInformation;

	}

}
