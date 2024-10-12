package com.TCR23_MCA_2024;

public class _teacher extends _employee {
	String sub;
	String dept;
	
	public _teacher(int empid, String name, double salary, String address, String sub, String dept) {
		 super(empid, name, salary, address);
		 this.sub=sub;
		 this.dept=dept;
		 
		
	}
	
	public void Display() {
		System.out.println("Employee ID : " + empid);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Address : " + address);
		System.out.println("Employee Department : " + dept);
		System.out.println("Employee Subject : " + sub);
	}
}

