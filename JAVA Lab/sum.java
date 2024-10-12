package com.TCR23_MCA_2024;


import java.util.*;
public class sum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter first Number : ");
		int num1 = num.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		int num2 = num.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum of "+num1+" and "+num2+" is "+sum);

	}

}
