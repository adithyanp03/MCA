 package com.TCR23_MCA_2024;


import java.util.*;
public class mainInheritance {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Enter Number of Teachers : ");
	int n = sc.nextInt();
	
	inheritanceTeacher[] teacher = new inheritanceTeacher[n];
	for (int i=0;i<n;i++) {
		System.out.println("Enter Empid : ");
		int Empid = sc.nextInt();
		System.out.println("Enter Name : ");
		String Name = sc.nextLine();
		sc.nextLine();
		System.out.println("Ente Salary : ");
		Double Salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Address : ");
		String Address = sc.nextLine();
		System.out.println("Enter Department : ");
		String Department = sc.nextLine();
		System.out.println("Enter Subject : ");
		String Subject = sc.nextLine();
		
		teacher[i] =new inheritanceTeacher(Empid, Name, Salary, Address, Department, Subject);
		teacher[i].Display();
		
	}
	
    
	
}
}