package com.capgemini.bean;

public class UseDetails {

	public String firstName;
	public String lastName;
	public String gender;
	public String emailId;
	public String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getemailId() {
		return emailId;
	}

	public void setemailId(String emailId) {
		this.emailId = emailId;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Cart [ Name=" + firstName + " " + lastName + ", gender=" + gender + ", emailId=" + emailId + "]";

	}

}
