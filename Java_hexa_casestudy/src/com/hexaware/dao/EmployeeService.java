package com.hexaware.dao;

import java.util.Scanner;
import com.hexaware.ServicePackage.IEmployeeService;
import com.hexaware.model.Employee;

public class EmployeeService implements IEmployeeService {
	Employee emp = new Employee();
	DaoClass dao = new DaoClass();
	Scanner sc = new Scanner(System.in);
	
	public void AddEmployee() {
		System.out.println("Enter employee Id:");
		int empid = sc.nextInt();
		emp.setEmployeeID(empid);
		
		System.out.println("Enter employee first name:");
		String empfname = sc.next();
		emp.setFirstName(empfname);
		
		System.out.println("Enter employee last name:");
		String emplname = sc.next();
		emp.setLastName(emplname);
		
		System.out.println("Enter employee address:");
		String empaddress = sc.next();
		emp.setAddress(empaddress);
		
		System.out.println("Enter employee date of birth:");
		String empdob = sc.next();
		emp.setDateOfBirth(empdob);
		
		System.out.println("Enter employee email:");
		String empemail = sc.next();
		emp.setEmail(empemail);
		
		System.out.println("Enter employee gender:");
		String empgender = sc.next();
		emp.setGender(empgender);
		
		System.out.println("Enter employee join date:");
		String empjoin = sc.next();
		emp.setJoiningDate(empjoin);
		
		System.out.println("If you want to add termination date press 1 if not press 2");
		int casenum = sc.nextInt();
		switch(casenum) {
			case 1:
				System.out.println("Enter employee termination date:");
				String emptermination = sc.next();
				emp.setTerminationDate(emptermination);
				break;
			case 2:
				break;
		}
		
		System.out.println("Enter employee phone number:");
		String empphone = sc.next();
		emp.setPhoneNumber(empphone);
		
		System.out.println("Enter employee position:");
		String empposition = sc.next();
		emp.setPosition(empposition);
		
		dao.AddEmployeeDao(emp);
	}

	public void GetEmployeeById() {
		System.out.println("Enter employee id:");
		int empid = sc.nextInt();
		dao.GetEmployeeByIdDao(empid);
	}

	public void GetAllEmployees() {
		dao.GetAllEmployeesDao();
	}

	public void RemoveEmployee() {
		System.out.println("Enter employee id to be removed:");
		int empid = sc.nextInt();
		dao.RemoveEmployeeDao(empid);
	}
}
