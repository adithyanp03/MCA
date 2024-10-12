package com.TCR23_MCA_2024;

public class newTeacher extends newEmployee {
	String Subject;
	String Department;
	String Teacherid;
	
	public newTeacher(String Name, String Gender, String Address, int Age, int Empid, String Company_Name, String Qualification, Double Salary, String Subject, String Department, String Teacherid) {
		super(Name, Gender, Address, Age, Empid, Company_Name, Qualification, Salary);
		this.Subject = Subject;
		this.Department = Department;
		this.Teacherid = Teacherid; 
		
	}
	
	 public void display() {
	        System.out.println("Name: " + Name);
	        System.out.println("Gender: " + Gender);
	        System.out.println("Address: " + Address);
	        System.out.println("Age: " + Age);
	        System.out.println("Empid: " + Empid);
	        System.out.println("Company Name: " + Company_Name);
	        System.out.println("Qualification: " + Qualification);
	        System.out.println("Salary: " + Salary);
	        System.out.println("Subject: " + Subject);
	        System.out.println("Department: " + Department);
	        System.out.println("Teacherid: " + Teacherid);
	        System.out.println();
	    }
}
