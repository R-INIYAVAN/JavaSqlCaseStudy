package com.hexaware.model;

public class FinancialRecord {
	private int RecordID;
	private int EmployeeID;
	private String RecordDate;
	private String Description;
	private double Amount;
	private String RecordType;
	
	public FinancialRecord() {
		System.out.println("From FinancialRecord Constraint...");
	}
	
	public FinancialRecord(int RecordID,int EmployeeID,String RecordDate,String Description,double Amount,String RecordType) {
		this.RecordID = RecordID;
		this.EmployeeID = EmployeeID;
		this.RecordDate = RecordDate;
		this.Description = Description;
		this.Amount = Amount;
		this.RecordType = RecordType;
	}
	
	public void setRecordID(int RecordID) {
		this.RecordID = RecordID;
	}
	
	public int getRecordID() {
		return RecordID;
	}
	
	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	
	public void setRecordDate(String RecordDate) {
		this.RecordDate = RecordDate;
	}
	
	public String getRecordDate() {
		return RecordDate;
	}
	
	public void setDescription(String Description) {
		this.Description = Description;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	
	public double getAmount() {
		return Amount;
	}
	
	public void setRecordType(String RecordType) {
		this.RecordType = RecordType;
	}
	
	public String getRecordType() {
		return RecordType;
	}
}
