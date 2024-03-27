package com.hexaware.model;

public class Payroll {
	private int PayRollID;
	private int EmployeeID;
	private String PayPeriodStartDate;
	private String PayPeriodEndDate;
	private double BasicSalary;
	private double OvertimePay;
	private double Deductions;
	private double NetSalary;
	
	public Payroll() {
		System.out.println("From Payroll Constraint...");
	}
	
	public Payroll(int PayRollID,int EmployeeID,String PayPeriodStartDate,String PayPeriodEndDate,double BasicSalary,double OvertimePay,double Deductions,double NetSalary) {
		this.PayRollID = PayRollID;
		this.EmployeeID = EmployeeID;
		this.PayPeriodStartDate = PayPeriodStartDate;
		this.PayPeriodEndDate = PayPeriodEndDate;
		this.BasicSalary = BasicSalary;
		this.OvertimePay = OvertimePay;
		this.Deductions = Deductions;
		this.NetSalary = NetSalary;
	}
	
	public void setPayrollID(int PayRollID) {
		this.PayRollID = PayRollID;
	}
	
	public int getPayRollID() {
		return PayRollID;
	}
	
	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	
	public void setPayPeriodStartDate(String PayPeriodStartDate) {
		this.PayPeriodStartDate = PayPeriodStartDate;
	}
	
	public String getPayPeriodStartDate() {
		return PayPeriodStartDate;
	}
	
	public void setPayPeriodEndDate(String PayPeriodEndDate) {
		this.PayPeriodEndDate = PayPeriodEndDate;
	}
	
	public String getPayPeriodEndDate() {
		return PayPeriodEndDate;
	}
	
	public void setBasicSalary(double BasicSalary) {
		this.BasicSalary = BasicSalary;
		this.OvertimePay = this.BasicSalary * 0.1;
		this.Deductions = this.BasicSalary * 0.05;
		this.NetSalary = this.BasicSalary + this.OvertimePay - this.Deductions;
	}
	
	public double getBasicSalary() {
		return BasicSalary;
	}
	
	public double getOvertimePay() {
		return OvertimePay;
	}
	
	public double getDeductions() {
		return Deductions;
	}
	
	public double getNetSalary() {
		return NetSalary;
	}
	
	
	
	
	
}


