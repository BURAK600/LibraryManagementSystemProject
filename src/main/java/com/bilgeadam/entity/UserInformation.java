package com.bilgeadam.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbluserinformation")
public class UserInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private long id;

	private String firstName;
	private String surName;
	private String email;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "information_id")
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "information_id")
	private List<Address> address = new ArrayList<Address>();

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id", unique = true)
	private User user;

	public UserInformation(long id, String firstName, String surName, String email, List<PhoneNumber> phoneNumbers,
			List<Address> address, User user) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.address = address;
		this.user = user;
	}

	public UserInformation(String firstName, String surName, String email, List<PhoneNumber> phoneNumbers,
			List<Address> address) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.address = address;

	}

	public UserInformation(String firstName, String surName, String email) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
	}

	public UserInformation() {
		super();
	}

	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", firstName=" + firstName + ", surName=" + surName + ", email=" + email
				+ ", phoneNumbers=" + phoneNumbers + ", address=" + address + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
