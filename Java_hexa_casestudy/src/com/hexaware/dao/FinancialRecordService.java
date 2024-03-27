package com.hexaware.dao;

import java.util.Scanner;

import com.hexaware.ServicePackage.IFinancialRecordService;
import com.hexaware.model.FinancialRecord;

public class FinancialRecordService implements IFinancialRecordService{
	FinancialRecord financialrecord = new FinancialRecord();
	DaoClass dao = new DaoClass();
	Scanner sc = new Scanner(System.in);
	
	public void AddFinancialRecord() {
		System.out.print("Enter record Id:");
		int recid = sc.nextInt();
		financialrecord.setRecordID(recid);
		
		System.out.print("Enter employee Id:");
		int empid = sc.nextInt();
		financialrecord.setEmployeeID(empid);
		
		System.out.print("Enter the amount:");
		double amount = sc.nextDouble();
		financialrecord.setAmount(amount);
		
		System.out.print("Enter the description:");
		String desc = sc.next();
		financialrecord.setDescription(desc);
		
		System.out.print("Enter the record date:");
		String recdate = sc.next();
		financialrecord.setRecordDate(recdate);
		
		System.out.print("Enter the record type:");
		String rectype = sc.next();
		financialrecord.setRecordType(rectype);
		
		dao.AddFinancialRecordDao(financialrecord);
	}

	public void GetFinancialRecordById() {
		System.out.print("Enter record Id:");
		int recid = sc.nextInt();
		dao.GetFinancialRecordByIdDao(recid);
		
	}

	public void GetFinancialRecordsForEmployee() {
		dao.GetFinancialRecordsForEmployeeDao();
	}

	public void GetFinancialRecordsForDate() {
		System.out.print("Enter the record date:");
		String recdate = sc.next();
		dao.GetFinancialRecordsForDateDao(recdate);
	}
	
	
}
