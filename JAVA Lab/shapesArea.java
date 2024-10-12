package com.TCR23_MCA_2024;


import java.util.*;
public class shapesArea {
	public static double area(double len) {
		return len * len;
	}
	
	public static double area(double len, double bre){
		return len * bre;
	}
	
	public static double area(int rad,boolean isCircle) {
		return Math.PI*rad*rad;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		Double len = sc.nextDouble();
		System.out.println("Enter Bredth : ");
		Double bre = sc.nextDouble();
		System.out.println("Enter Radius : ");
		Double rad = sc.nextDouble();
		
		System.out.println("The Area of Square : " + area(len));
		System.out.println("The Area of Rectangle : " + area(len, bre));
		System.out.println("The area of Circle : " + area(rad));


	}
} 
