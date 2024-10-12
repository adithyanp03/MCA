package com.TCR23_MCA_2024;


import java.util.Scanner;
interface Shape {
	Double area();
	Double perimeter();
}

 class circle implements Shape {
	private Double radius;
	
	public circle(Double radius)  {
		this.radius=radius;
	}

	@Override
	public Double area() {
		return Math.PI*radius*radius;
	}

	@Override
	public Double perimeter() {
		return 2*Math.PI*radius;

	}
}
 
 class Rectangle implements Shape {
	 private Double length;
	 private Double bredth;
	 
	 public Rectangle(Double length, Double bredth) {
		 this.length=length;
		 this.bredth=bredth;
	 }

	@Override
	public Double area() {
		return length*bredth;
	}

	@Override
	public Double perimeter() {
		return 2*(length+bredth);
	}
 }

public class Maininterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		
		while(true) {
			System.out.println("Menu");
			System.out.println("1.Circle");
			System.out.println("2.Rectagle");
			System.out.println("Choose an option");
			int choice = sc.nextInt();
	    
			switch (choice) {
				case 1:
					System.out.println("Enter Circle Radius");
					double radius = sc.nextDouble();
					shape = new circle(radius); 
					break;
				case 2:
					System.out.println("Enter Rectangel Length");
					double length = sc.nextDouble();
					System.out.println("Enter Rectangle Bredth");
					double bredth  = sc.nextDouble();
					shape=new Rectangle(length, bredth);
					break;
				default:
					System.out.println("Invalid choice");
					continue;
					
				}
			
			System.out.println("Area : " + shape.area());
			System.out.println("Area : " + shape.perimeter());
			
			
			
		}
		

	}

}

