package com.TCR23_MCA_2024;


import java.util.Scanner;
public class inheritanceTeacher extends inheritanceEmployee {
	String Department;
	String Subject;


public inheritanceTeacher(int Empid, String Name, Double Salary, String Address, String Department, String Subject) {
	super(Empid, Name, Salary, Address);
	this.Department = Department;
	this.Subject = Subject;
	
}

public void Display() {
	System.out.println("Employee ID : " + Empid);
	System.out.println("Employee Name : " + Name);
	System.out.println("Employee Salary : " + Salary);
	System.out.println("Employee Address : " + Address);
	System.out.println("Employee Department : " + Department);
	System.out.println("Employee Subject : " + Subject);
}

}
