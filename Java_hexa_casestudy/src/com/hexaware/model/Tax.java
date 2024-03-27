package com.hexaware.model;

public class Tax {
	private int TaxID;
	private int EmployeeID;
	private String TaxYear;
	private double TaxableIncome;
	private double TaxAmount;
	
	public Tax() {
		System.out.println("From Tax Constraint...");
	}
	
	public Tax(int TaxID,int EmployeeID,String TaxYear,double TaxableIncome,double TaxAmount) {
		this.TaxID = TaxID;
	    this.EmployeeID = EmployeeID;
		this.TaxYear = TaxYear;
		this.TaxableIncome = TaxableIncome;
		this.TaxAmount = TaxAmount;
	}
	
	public void setTaxID(int TaxID) {
		this.TaxID = TaxID;
	}
	
	public int getTaxID() {
		return TaxID;
	}
	
	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	
	public void setTaxYear(String TaxYear) {
		this.TaxYear = TaxYear;
	}
	
	public String getTaxYear() {
		return TaxYear;
	}
	
	public void setTaxableIncome(double TaxableIncome) {
		this.TaxableIncome = TaxableIncome;
	}
	
	public double getTaxableIncome() {
		return TaxableIncome;
	}
	
	public void setTaxAmount(double TaxAmount) {
		this.TaxAmount = TaxAmount;
	}
	
	public double getTaxAmount() {
		return TaxAmount;
	}
	
	
}
