package com.bilgeadam.main;

import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.entity.Address;
import com.bilgeadam.entity.PhoneNumber;
import com.bilgeadam.entity.Student;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.StudentService;
import com.bilgeadam.service.UserService;

public class Test {

	public static void main(String[] args) {
		UserService userService = new UserService();
		StudentService studentService = new StudentService();

		Address address1 = new Address("Ankara");
		Address address2 = new Address("Istanbul");

		PhoneNumber phoneNumber1 = new PhoneNumber("0555-555-55-55");
		PhoneNumber phoneNumber2 = new PhoneNumber("0444-444-44-44");

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		phoneNumbers.add(phoneNumber1);
		phoneNumbers.add(phoneNumber2);

		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);

		UserInformation userInformation = new UserInformation("burak", "ozer", "burak@gmail.com", phoneNumbers,
				addresses);

//		address1.setUserInformation(userInformation);
//		address2.setUserInformation(userInformation);
//
//		phoneNumber1.setUserInformation(userInformation);
//		phoneNumber2.setUserInformation(userInformation);

		// User user = new User("burakozer", "malatya1234", userInformation);
		Student student = new Student("burakozer", "malatya1234", userInformation);

		userInformation.setUser(student);

		studentService.save(student);

		studentService.findAll().forEach(System.out::println);

//		UserService userService = new UserService();
//
//		PhoneNumber phoneNumber = new PhoneNumber("0555-555-55-55");
//		PhoneNumber phoneNumber2 = new PhoneNumber("0555-555-55-56");
//		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
//		phoneNumbers.add(phoneNumber);
//		phoneNumbers.add(phoneNumber2);
//
//		Address address = new Address("Ankara");
//		Address address2 = new Address("Istanbul");
//		List<Address> addresses = new ArrayList<Address>();
//		addresses.add(address);
//		addresses.add(address2);
//
//		UserInformation userInformation = new UserInformation("burak", "ozer", "burak@gmail.com", phoneNumbers,
//				addresses);
//
//		UserInformation userInformation1 = new UserInformation("burak12", "ozer12", "burak@gmail.com", phoneNumbers,
//				addresses);
//
//		phoneNumber.setUserInformation(userInformation);
//		phoneNumber2.setUserInformation(userInformation);
//		address.setUserInformation(userInformation);
//		address2.setUserInformation(userInformation);
//
//		User user = new User("burakozer1", "malaata1234", userInformation);
//
//		userInformation.setUser(user);
//		userService.save(user);
//
//		User user2 = new User("burakozer12", "malaata1234678", userInformation1);
//
//		userInformation1.setUser(user2);
//
//		userService.save(user2);

	}

}
