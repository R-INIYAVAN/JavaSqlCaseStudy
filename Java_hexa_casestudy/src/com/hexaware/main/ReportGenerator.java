package com.hexaware.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.dao.EmployeeService;
import com.hexaware.dao.FinancialRecordService;
import com.hexaware.dao.PayrollService;
import com.hexaware.dao.TaxService;



public class ReportGenerator {
public static void main(String[] args) throws SQLException{
		
		EmployeeService empser = new EmployeeService();
		FinancialRecordService finrecser = new FinancialRecordService();
		PayrollService payser = new PayrollService();
		TaxService taxser = new TaxService();
		
		String ch = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("What Service would you like to access");
			System.out.println("1. EmployeeService\n2. FinancialService\n3. PayrollService\n4."
					+ " TaxService");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.println("What kind of employee service would you like to access");
					System.out.println("1. AddEmployee\n2. GetAllEmployees\n3. GetEmployeeById\n4."
							+ " RemoveEmployee");
					int choice_employee = sc.nextInt();
					switch(choice_employee) {
						case 1:
							empser.AddEmployee();
							break;
						case 2:
							empser.GetAllEmployees();
							break;
						case 3:
							empser.GetEmployeeById();
							break;
						case 4:
							empser.RemoveEmployee();
							break;
					}
					break;
				}
				
				case 2:{
					System.out.println("What kind of financial service would you like to access");
					System.out.println("1. AddFinancialRecord\n2. GetFinancialRecordById\n3. GetFinancialRecordForDate\n4."
							+ " GetFinancialRecordForEmployee");
					int choice_fin = sc.nextInt();
					switch(choice_fin) {
						case 1:
							finrecser.AddFinancialRecord();;
							break;
						case 2:
							finrecser.GetFinancialRecordById();;
							break;
						case 3:
							finrecser.GetFinancialRecordsForDate();;
							break;
						case 4:
							finrecser.GetFinancialRecordsForEmployee();;
							break;
					}
					break;
				}
				
				case 3:{
					System.out.println("What kind of payroll service would you like to access");
					System.out.println("1. GeneratePayRoll\n2. GetPayRollById\n3. GetPayrollForEmployees\n4."
							+ " GetPayRollForPeriod");
					int choice_pay = sc.nextInt();
					switch(choice_pay) {
						case 1:
							payser.GeneratePayRoll();
							break;
						case 2:
							payser.GetPayRollById();
							break;
						case 3:
							payser.GetPayrollsForEmployee();
							break;
						case 4:
							payser.GetPayRollsForPeriod();
							break;
					}
					break;
				}
				
				case 4:{
					System.out.println("What kind of tax service would you like to access");
					System.out.println("1. CalculateTax\n2. GetTaxById\n3. GetTaxesForEmployee\n4."
							+ " GetTaxesForYear");
					int choice_tax = sc.nextInt();
					switch(choice_tax) {
						case 1:
							taxser.CalculateTax();
							break;
						case 2:
							taxser.GetTaxById();
							break;
						case 3:
							taxser.GetTaxesForEmployee();
							break;
						case 4:
							taxser.GetTaxesForYear();
							break;
					}
					break;
				}
			}
			System.out.println("Do you want to continue? Y or y");
			ch = sc.next();
		}while(ch.equals("Y") || ch.equals("y"));
		System.out.println("Thank you Visit Again!"+ "!!");
		System.exit(0);
	}
}
