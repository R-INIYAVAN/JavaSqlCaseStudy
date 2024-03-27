create database hexaware_casestudy;
use hexaware_casestudy;

drop table financial_record;
drop table payroll;
drop table tax;
drop table employee;

drop table Employee;
create table Employee(
	Employee_ID int,
    First_name varchar(20),
    Last_name varchar(20),
    Date_of_birth varchar(20),
    Gender varchar(6),
    Phone bigint UNIQUE,
    Address varchar(50),
    Job_title varchar(20),
    Join_date varchar(20),
    Termination_date varchar(20),
    constraint pk_employee PRIMARY KEY(Employee_ID)    
);


create table Payroll(
	Payroll_ID bigint,
    Employee_ID int,
    PayPeriod_start_date varchar(20),
    Payperiod_end_date varchar(20),
    Basic_salary int,
    Overtime_pay int,
    Deductions int,
    Net_Salary int,
    constraint pk_payroll PRIMARY KEY(Payroll_ID),
    constraint fk_employee_payroll FOREIGN KEY(Employee_ID) references Employee(Employee_ID)
    on delete cascade
    on update cascade
);



create table Tax(
	TaxID bigint,
    Employee_ID int,
    Tax_year int CHECK(Tax_year>=1900 and Tax_year<=2150),
    Taxable_income int,
    Tax_amount int,
    constraint pk_tax PRIMARY KEY(TaxID),
    constraint fk_employee_tax FOREIGN KEY(Employee_ID) references Employee(Employee_ID)
    on delete cascade
    on update cascade
);




create table Financial_record(
	Record_ID bigint,
    Employee_ID int,
    Record_date varchar(20),
    Record_description varchar(50),
    Amount bigint,
    Record_type varchar(30),
    constraint pk_financial_record PRIMARY KEY(Record_ID),
    constraint fk_employee_financial_record FOREIGN KEY(Employee_ID) references Employee(Employee_ID)
    on delete cascade
    on update cascade
);

select * from payroll;
select * from tax;
select * from employee;
select * from financial_record;

select * from financial_record where record_id=21;

