package com.hexaware.dao;

import java.util.Scanner;

import com.hexaware.ServicePackage.ITaxService;
import com.hexaware.model.Tax;

public class TaxService implements ITaxService{
	
	Tax tax = new Tax();
	DaoClass dao = new DaoClass();
	Scanner sc = new Scanner(System.in);
	
	public void CalculateTax() {
		
	}

	public void GetTaxById() {
		System.out.println("Enter tax id:");
		int taxid = sc.nextInt();
		dao.GetTaxByIdDao(taxid);
	}

	public void GetTaxesForEmployee() {
		System.out.println("Enter employee id:");
		int empid = sc.nextInt();
		dao.GetTaxesForEmployeeDao(empid);
	}

	public void GetTaxesForYear() {
		System.out.println("Enter year:");
		String year = sc.next();
		dao.GetTaxesForYearDao(year);
	}

}
