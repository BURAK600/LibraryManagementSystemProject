package com.bilgeadam.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbluser")

/**
 * 
 * 
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) public class User {
 * @Id
 * @GeneratedValue(strategy = GenerationType.TABLE)
 * 
 * 
 * 
 * 
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE) public class User {
 * @Id
 * @GeneratedValue(strategy = GenerationType.SEQUENCE)
 * 
 *
 */
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private long id;
	private String userName;
	private String password;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	@JoinColumn(name = "user_information_id", referencedColumnName = "id", unique = true)
	UserInformation userInformation;

	@OneToMany
	List<Borrow> borrows;

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public User(long id, String userName, String password, UserInformation userInformation) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userInformation = userInformation;
	}

	public User(String userName, String password, UserInformation userInformation) {
		super();
		this.userName = userName;
		this.password = password;
		this.userInformation = userInformation;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userInformation="
				+ userInformation + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInformation getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

}
