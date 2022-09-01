package com.bilgeadam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblphonenumber")

public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private String phoneNumber;

//	@ManyToOne
//	private UserInformation userInformation;

	@Override
	public String toString() {
		return "PhoneNumber [id=" + id + ", phoneNumber=" + phoneNumber + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber() {
		super();
	}

}
