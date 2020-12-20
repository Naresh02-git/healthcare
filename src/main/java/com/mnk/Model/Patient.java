package com.mnk.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Patient")
public class Patient {
	@javax.persistence.Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Column(name = "PhoneNumber")
	private String PhoneNUmber;

	@Column(name = "Age")
	private Integer Age;

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		Age = age;
	}

	@Column(name = "Password")
	private String Password;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getPhoneNUmber() {
		return PhoneNUmber;
	}

	public void setPhoneNUmber(String phoneNUmber) {
		PhoneNUmber = phoneNUmber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void save(Patient patient) {
		// TODO Auto-generated method stub

	}

	public String getEmailId() {
		// TODO Auto-generated method stub
		return null;
	}

}
