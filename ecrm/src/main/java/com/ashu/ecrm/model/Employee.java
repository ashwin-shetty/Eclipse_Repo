package com.ashu.ecrm.model;

public class Employee {

	
	private String firstName;
	private String lastName;
	private String emailId;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String firstName, String lastName ,String emailId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Employee [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
