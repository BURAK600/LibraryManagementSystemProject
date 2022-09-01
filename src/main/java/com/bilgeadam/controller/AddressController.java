package com.bilgeadam.controller;

import java.util.Scanner;

import com.bilgeadam.entity.Address;
import com.bilgeadam.service.AddressService;

public class AddressController {

	Scanner scanner = new Scanner(System.in);
	AddressService addressService;

	public AddressController() {
		this.addressService = new AddressService();

	}

	public Address createAddress() {

		System.out.println("lutfen adresinizi giriniz: ");
		String adres = scanner.nextLine();

		return addressService.save(new Address(adres));

	}

}
