package com.TCR23_MCA_2024;


import java.util.*;
public class __overloading {
	public static double area(double r) {
		return Math.PI*r*r;
	}
	
	public static double area(double l, double b) {
		return l*b;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Exit");

			int choice=sc.nextInt();
			
			switch (choice) {
			
			case 1: 		
				System.out.println("Enter Radious");
				double r=sc.nextDouble();
				System.out.println(area(r));
				break;
				
			case 2: 		
				System.out.println("Enter Length");
				double l = sc.nextDouble();
				System.out.println("Enter Bredth");
				double b = sc.nextDouble();
				System.out.println(area(l, b));
				break;
				
			case 3:
				System.exit(0);
				break;
			}
		}
			
			
		

	}

}
