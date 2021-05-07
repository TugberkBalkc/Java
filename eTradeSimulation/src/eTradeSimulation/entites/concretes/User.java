package eTradeSimulation.entites.concretes;

import eTradeSimulation.entites.abstracts.IEntity;

public class User implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private boolean accountCondition = false;
	private boolean validationCondition = false;

	
	public User
	(int id, String firstName, 
	 String lastName, String email, String password
	 ,String phoneNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public boolean getAccountCondition() {
		return this.accountCondition;
	}
	public void setAccountCondition(boolean accounCondition) {
		this.accountCondition = accounCondition;
	}
	public boolean getValidationCondition() {
		return this.validationCondition;
	}
	public void setValidationCondition(boolean validationCondition) {
		this.validationCondition = validationCondition;
	}
	
	
}
