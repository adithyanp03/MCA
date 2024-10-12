package com.TCR23_MCA_2024;

import java.util.*;
public class arraysum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter Size of Array : ");
		int n = num.nextInt();
		
		int [] new_array = new int[n];
		
		System.out.println("Enter elements of array : ");
		for (int i=0;i<n;i++) {
			new_array[i] = num.nextInt();
		
		}
		
		System.out.print("Array Elements : ");
		System.out.print("{");
		for (int i=0;i<n;i++) {

			System.out.print(new_array[i]);
			if (i < n-1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
		System.out.println();
		
		int sum=0;

		for (int i=0;i<n;i++) {
			sum=sum+new_array[i];
			
		}
		System.out.println("Sum of Array Elements : " + sum);
		

	}

}
