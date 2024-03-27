package com.hexaware.dao;

import java.util.Scanner;

import com.hexaware.ServicePackage.IPayrollService;
import com.hexaware.model.Payroll;

public class PayrollService implements IPayrollService{
	
	Payroll payroll = new Payroll();
	DaoClass dao = new DaoClass();
	Scanner sc = new Scanner(System.in);
	
	public void GeneratePayRoll() {
		System.out.println("Enter employee id:");
		int empid = sc.nextInt();
		payroll.setEmployeeID(empid);
		
		System.out.println("Enter payroll id:");
		int payid = sc.nextInt();
		payroll.setPayrollID(payid);;
		
		System.out.println("Enter start date:");
		String start = sc.next();
		payroll.setPayPeriodStartDate(start);
		
		System.out.println("Enter end date:");
		String end = sc.next();
		payroll.setPayPeriodEndDate(end);
		
		System.out.println("Enter basic salary:");
		Double basicsal = sc.nextDouble();
		payroll.setBasicSalary(basicsal);
		
		dao.GeneratePayRollDao(payroll);
		
		
	}

	public void GetPayRollById() {
		System.out.println("Enter payroll id:");
		int payrollid = sc.nextInt();
		dao.GetPayRollByIdDao(payrollid);
	}

	public void GetPayrollsForEmployee() {
		System.out.println("Enter employee id:");
		int employeeid = sc.nextInt();
		dao.GetPayrollsForEmployeeDao(employeeid);
		
	}

	public void GetPayRollsForPeriod() {
		System.out.println("Enter start date:");
		String start = sc.next();
		System.out.println("Enter end date:");
		String end = sc.next();
		dao.GetPayRollsForPeriodDao(start,end);
	}

}
