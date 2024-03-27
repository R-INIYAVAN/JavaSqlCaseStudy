package com.hexaware.dao;

import java.sql.*;

import com.hexaware.model.Employee;
import com.hexaware.model.FinancialRecord;
import com.hexaware.model.Payroll;
import com.hexaware.util.DBUtil;

public class DaoClass {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	// Employee methods
	public void AddEmployeeDao(Employee emp)  {
		try {
			con = DBUtil.getDBConn();
			ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, emp.getEmployeeID());
			ps.setString(2, emp.getFirstName());
			ps.setString(3, emp.getLastName());
			ps.setString(4, emp.getDateOfBirth());
			ps.setString(5, emp.getGender());
			ps.setString(6, emp.getPhoneNumber());
			ps.setString(7, emp.getAddress());
			ps.setString(8, emp.getPosition());
			ps.setString(9, emp.getJoiningDate());
			ps.setString(10, emp.getTerminationDate());
			
			int no = ps.executeUpdate();
			System.out.println(no + " Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void GetEmployeeByIdDao(int empid) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee where employee_id="+empid);
			
			while (rs.next()) {
				System.out.println("EmployeeId: " + rs.getInt(1));
				System.out.println("Employee First Name: " + rs.getString(2));
				System.out.println("Employee Last Name: " + rs.getString(3));
				System.out.println("Employee date of birth: " + rs.getString(4));
				System.out.println("Employee Gender: " + rs.getString(5));
				System.out.println("Employee phone number: " + rs.getString(6));
				System.out.println("Employee address: " + rs.getString(7));
				System.out.println("Employee job title: " + rs.getString(8));
				System.out.println("Employee join date: " + rs.getString(9));
				System.out.println("Employee exit date: " + rs.getString(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void GetAllEmployeesDao() {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println("EmployeeId: " + rs.getInt(1));
				System.out.println("Employee First Name: " + rs.getString(2));
				System.out.println("Employee Last Name: " + rs.getString(3));
				System.out.println("Employee date of birth: " + rs.getString(4));
				System.out.println("Employee Gender: " + rs.getString(5));
				System.out.println("Employee phone number: " + rs.getString(6));
				System.out.println("Employee address: " + rs.getString(7));
				System.out.println("Employee job title: " + rs.getString(8));
				System.out.println("Employee join date: " + rs.getString(9));
				System.out.println("Employee exit date: " + rs.getString(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void RemoveEmployeeDao(int empid) {
		try {
			con = DBUtil.getDBConn();
			ps = con.prepareStatement("delete from employee where Employee_Id=?");
			ps.setInt(1, empid);
			int no = ps.executeUpdate();
			System.out.println(no + " Deleted Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	// Financial records methods
	public void AddFinancialRecordDao(FinancialRecord financialrecord) {
		try {
			con = DBUtil.getDBConn();
			ps = con.prepareStatement("insert into financial_record values(?,?,?,?,?,?)");
			ps.setInt(1, financialrecord.getRecordID());
			ps.setInt(2, financialrecord.getEmployeeID());
			ps.setString(3, financialrecord.getRecordDate());
			ps.setString(4, financialrecord.getDescription());
			ps.setDouble(5, financialrecord.getAmount());
			
			int no = ps.executeUpdate();
			System.out.println(no + " Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetFinancialRecordByIdDao(int recid) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from financial_record where record_id="+recid);
			
			while (rs.next()) {
				System.out.println("RecordId: " + rs.getInt(1));
				System.out.println("Employee Id: " + rs.getInt(2));
				System.out.println("Record date: " + rs.getString(3));
				System.out.println("Record description: " + rs.getString(4));
				System.out.println("Record amount: " + rs.getInt(5));
				System.out.println("Record type: " + rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void GetFinancialRecordsForEmployeeDao() {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from financial_record");
			while (rs.next()) {
				System.out.println("RecordId: " + rs.getInt(1));
				System.out.println("Employee Id: " + rs.getInt(2));
				System.out.println("Record date: " + rs.getString(3));
				System.out.println("Record description: " + rs.getString(4));
				System.out.println("Record amount: " + rs.getInt(5));
				System.out.println("Record type: " + rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetFinancialRecordsForDateDao(String recdate) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from financial_record where record_date="+recdate);
			
			while (rs.next()) {
				System.out.println("RecordId: " + rs.getInt(1));
				System.out.println("Employee Id: " + rs.getInt(2));
				System.out.println("Record date: " + rs.getString(3));
				System.out.println("Record description: " + rs.getString(4));
				System.out.println("Record amount: " + rs.getInt(5));
				System.out.println("Record type: " + rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//  Payroll methods
	public void GeneratePayRollDao(Payroll payroll) {
		try {
			con = DBUtil.getDBConn();
			ps = con.prepareStatement("insert into payroll values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, payroll.getPayRollID());
			ps.setInt(2, payroll.getEmployeeID());
			ps.setString(3, payroll.getPayPeriodStartDate());
			ps.setString(4, payroll.getPayPeriodEndDate());
			ps.setDouble(5, payroll.getBasicSalary());
			ps.setDouble(6, payroll.getOvertimePay());
			ps.setDouble(7, payroll.getDeductions());
			ps.setDouble(8, payroll.getNetSalary());
			int no = ps.executeUpdate();
			System.out.println(no + " payroll inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void GetPayRollByIdDao(int payrollid) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from payroll where payroll_id="+payrollid);
			while (rs.next()) {
				System.out.println("Payroll id: " + rs.getInt(1));
				System.out.println("Employee id: " + rs.getInt(2));
				System.out.println("Payroll start date: " + rs.getString(3));
				System.out.println("Payroll end date: " + rs.getString(4));
				System.out.println("Basic salary: " + rs.getDouble(5));
				System.out.println("Overtime pay: " + rs.getDouble(6));
				System.out.println("Salary deductions: " + rs.getDouble(7));
				System.out.println("Net salary: " + rs.getDouble(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetPayrollsForEmployeeDao(int employeeid) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from payroll");
			while (rs.next()) {
				System.out.println("Payroll id: " + rs.getInt(1));
				System.out.println("Employee id: " + rs.getInt(2));
				System.out.println("Payroll start date: " + rs.getString(3));
				System.out.println("Payroll end date: " + rs.getString(4));
				System.out.println("Basic salary: " + rs.getDouble(5));
				System.out.println("Overtime pay: " + rs.getDouble(6));
				System.out.println("Salary deductions: " + rs.getDouble(7));
				System.out.println("Net salary: " + rs.getDouble(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetPayRollsForPeriodDao(String start, String end) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from payroll where payperiod_start_date>="+start+"payperiod_end_date<="+end);
			while (rs.next()) {
				System.out.println("Payroll id: " + rs.getInt(1));
				System.out.println("Employee id: " + rs.getInt(2));
				System.out.println("Payroll start date: " + rs.getString(3));
				System.out.println("Payroll end date: " + rs.getString(4));
				System.out.println("Basic salary: " + rs.getDouble(5));
				System.out.println("Overtime pay: " + rs.getDouble(6));
				System.out.println("Salary deductions: " + rs.getDouble(7));
				System.out.println("Net salary: " + rs.getDouble(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Tax methods
	public void GetTaxByIdDao(int taxid) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from tax where tax_id="+taxid);
			while (rs.next()) {
				System.out.println("Tax id: " + rs.getInt(1));
				System.out.println("Employee id: " + rs.getInt(2));
				System.out.println("Tax year: " + rs.getString(3));
				System.out.println("Taxable income: " + rs.getDouble(4));
				System.out.println("Tax amount: " + rs.getDouble(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetTaxesForEmployeeDao(int empid) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from tax");
			while (rs.next()) {
				System.out.println("Tax id: " + rs.getInt(1));
				System.out.println("Employee id: " + rs.getInt(2));
				System.out.println("Tax year: " + rs.getString(3));
				System.out.println("Taxable income: " + rs.getDouble(4));
				System.out.println("Tax amount: " + rs.getDouble(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetTaxesForYearDao(String year) {
		try {
			con = DBUtil.getDBConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from tax where tax_year="+year);
			while (rs.next()) {
				System.out.println("Tax id: " + rs.getInt(1));
				System.out.println("Employee id: " + rs.getInt(2));
				System.out.println("Tax year: " + rs.getString(3));
				System.out.println("Taxable income: " + rs.getDouble(4));
				System.out.println("Tax amount: " + rs.getDouble(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	

	
	
}
