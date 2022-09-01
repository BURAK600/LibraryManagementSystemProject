package com.bilgeadam.controller;

import java.util.Scanner;

import com.bilgeadam.entity.PhoneNumber;
import com.bilgeadam.service.PhoneNumberService;

public class PhoneNumberController {
	Scanner scanner = new Scanner(System.in);
	PhoneNumberService phoneNumberService;

	public PhoneNumberController() {
		this.phoneNumberService = new PhoneNumberService();
	}

	public PhoneNumber createPhoneNumber() {

		System.out.println("lutfen cep numaranızı giriniz: ");
		String phoneNumber = scanner.nextLine();

		return phoneNumberService.save(new PhoneNumber(phoneNumber));

	}

}
