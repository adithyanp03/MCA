package com.TCR23_MCA_2024;

public class newEmployee extends newPerson {
	int Empid;
	String Company_Name;
	String Qualification;
	Double Salary;
	
	public newEmployee(String Name, String Gender, String Address, int Age, int Empid, String Company_Name, String Qualification, Double Salary) {
		super(Name, Gender, Address, Age);
		this.Empid = Empid;
		this.Company_Name = Company_Name;
		this.Qualification = Qualification;
		this.Salary = Salary;
		
	}
	
}
