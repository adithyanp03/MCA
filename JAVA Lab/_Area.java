package com.TCR23_MCA_2024;

import java.util.Scanner;
public class _Area {
	public static double area(double r) {
		return Math.PI*r*r;
	}
	
	public static double area(double l, double b) {
		return l*b;
	}
	
	public static double area(double l, double b, double h) {
		double s = l+b+h/2;
		return Math.sqrt((s-l)*(s-b)*(s-h));
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Menue");
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Triangle");
			System.out.println("Choose an Option");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Radius : ");
				double r = sc.nextDouble();
				System.out.println("Area of Circle is  : " + area(r));
				break;
			case 2:
                System.out.print("Enter Length: ");
                double len = sc.nextDouble();
                System.out.print("Enter Breadth: ");
                double bre = sc.nextDouble();
                System.out.println("Area of Rectangle is: " + area(len, bre));
                break;
			case 3:
                System.out.print("Enter Length: ");
                double l = sc.nextDouble();
                System.out.print("Enter Breadth: ");
                double b = sc.nextDouble();
                System.out.print("Enter Height: ");
                double hig = sc.nextDouble();
                System.out.println("Area of Triangle is: " + area(l, b, hig));
                break;
			}
			
		}
	}
}
