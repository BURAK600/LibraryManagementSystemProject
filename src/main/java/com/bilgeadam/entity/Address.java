package com.bilgeadam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbladdress")

public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private String address;

//	@ManyToOne
//	private UserInformation userInformation;

	public Address() {
		super();
	}

	public Address(long id, String address) {
		super();
		this.id = id;
		this.address = address;

	}

	public Address(String address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}