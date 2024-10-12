package com.TCR23_MCA_2024;

import java.util.*;
	class Employee {
	int eNo;
	String eName;
	Double eSalary;
	
	public Employee(int eNo, String eName, Double eSalary) {
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public void Display() {
		System.out.println("Employee ID : " + eNo);
		System.out.println("Employee Name : " + eName);
		System.out.println("Employee Salary : " + eSalary);
	}
}
	
	public class EmployeeSearch {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of employees : ");
			int n = sc.nextInt();
			
			Employee[] employee = new Employee[n];
			
			for (int i=0;i<n;i++) {
				System.out.println("Enter Employee ID : ");
				int No = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name : ");
				String Name = sc.nextLine();
				System.out.println("Enter Employee Salary : ");
				Double Salary = sc.nextDouble();
				sc.nextLine();
				employee[i] = new Employee(No, Name, Salary);
				
			}
			
			System.out.println("Enter the Employee Number to search : ");
			int emp = sc.nextInt();
			
			for (int i=0;i<n;i++) {
				if (employee[i].eNo == emp) {
					System.out.println("Empoyee Found");
					employee[i].Display();
				} else if (employee[i].eNo != emp){
					System.out.println("Empoyee Not Found");
				}
			}
			
			
		}
	}
	
	

