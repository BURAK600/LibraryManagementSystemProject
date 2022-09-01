package com.bilgeadam.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

@Entity
public class Student extends User {

	@Enumerated(EnumType.STRING)
	private UserType userType = UserType.STUDENT;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	List<Borrow> borrows;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String userName, String password, UserInformation userInformation) {
		super(id, userName, password, userInformation);
		// TODO Auto-generated constructor stub
	}

	public Student(String userName, String password, UserInformation userInformation) {
		super(userName, password, userInformation);
		// TODO Auto-generated constructor stub
	}

	public Student(String userName, String password) {
		super(userName, password);
		// TODO Auto-generated constructor stub
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Student [userType=" + userType + ", borrows=" + borrows + "]";
	}

}
