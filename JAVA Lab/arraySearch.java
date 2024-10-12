package com.TCR23_MCA_2024;

import java.util.Scanner;
public class arraySearch {
	public static void main(String args[]) {
		Scanner el = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int n = el.nextInt();
		el.nextLine();
		
		String[] newArray = new String[n];
		
		System.out.println("Enter Array Elements : ");
		
		for (int i=0;i<n;i++) {
			newArray[i] = el.nextLine();
		}
		
		System.out.println("Enter the element ot search : ");
		String ele = el.nextLine();
		
		
		for (int i=0;i<n;i++) {
			if (newArray[i].equals(ele)) {
				System.out.println("Element found in array");
			}
			
		}
		
		System.out.print("Array Elements : ");
		System.out.print(" { ");
		for (int i=0;i<n;i++) {
			System.out.print(newArray[i]);
			System.out.print(" ");
		}
		System.out.println("} ");
		
	}
}
