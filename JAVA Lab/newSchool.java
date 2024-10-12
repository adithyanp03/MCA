package com.TCR23_MCA_2024;


import java.util.Scanner;
public class newSchool {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter No. of Teachers : ");
		int n  = scanner.nextInt();
		
		newTeacher[] teacher = new newTeacher[n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter Name :");
			String Name = scanner.nextLine();
			scanner.nextLine();
			
			System.out.print("Gender: ");
            String Gender = scanner.nextLine();

            System.out.print("Address: ");
            String Address = scanner.nextLine();

            System.out.print("Age: ");
            int Age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Empid: ");
            int Empid = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Company Name: ");
            String Company_Name = scanner.nextLine();
            
            System.out.print("Qualification: ");
            String Qualification = scanner.nextLine();

            System.out.print("Salary: ");
            double Salary = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Subject: ");
            String Subject = scanner.nextLine();

            System.out.print("Department: ");
            String Department = scanner.nextLine();

            System.out.print("Teacherid: ");
            String Teacherid = scanner.nextLine();
            
            
            teacher[i] = new newTeacher(Name, Gender, Address, Age, Empid, Company_Name, Qualification, Salary, Subject, Department, Teacherid);
		}
		
		for (newTeacher teachers : teacher) {
			teachers.display();
		}
		
	}	
}
