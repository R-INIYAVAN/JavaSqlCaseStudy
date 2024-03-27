package com.hexaware.model;

public class Employee {
	private int EmployeeID;
	private String FirstName;
	private String LastName;
	private String DateOfBirth;
	private String Gender;
	private String Email;
	private String PhoneNumber;
	private String Address;
	private String Position;
	private String JoiningDate;
	private String TerminationDate = null;
	
	public Employee() {
		System.out.println("From Employee Constraint...");
	}
	
	public Employee(int EmployeeID,String FirstName,String LastName,String DateOfBirth,String Gender,String Email,String PhoneNumber,String Address,String Position,String JoiningDate,String TerminationDate) {
		this.EmployeeID = EmployeeID;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.DateOfBirth = DateOfBirth;
		this.Gender = Gender;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
		this.Position = Position;
		this.JoiningDate = JoiningDate;
		this.TerminationDate = TerminationDate;
	}
	
	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setDateOfBirth(String DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
	
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setPosition(String Position) {
		this.Position = Position;
	}
	
	public String getPosition() {
		return Position;
	}
	
	public void setJoiningDate(String JoiningDate) {
		this.JoiningDate = JoiningDate;
	}
	
	public String getJoiningDate() {
		return JoiningDate;
	}
	
	public void setTerminationDate(String TerminationDate) {
		this.TerminationDate = TerminationDate;
	}
	
	public String getTerminationDate() {
		return TerminationDate;
	}
	
	
}
