package com.TCR23_MCA_2024;


import java.util.*;
public class _inheritance {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number of teacher  : ");
	int n = sc.nextInt();
	
	_teacher [] teacher = new _teacher[n];
	
	for (int i=0;i<n;i++) {
		System.out.println("Enter Empid : ");
		int empid = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Ente Salary : ");
		Double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Address : ");
		String address = sc.nextLine();
		System.out.println("Enter Department : ");
		String dept = sc.nextLine();
		System.out.println("Enter Subject : ");
		String sub = sc.nextLine();
		
		teacher[i] = new _teacher(empid, name, salary, address, sub, dept);
		
	}
	for(_teacher teach:teacher) {
		teach.Display();
	}
	
	
}
}
