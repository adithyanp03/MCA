package com.TCR23_MCA_2024;

import java.util.Scanner;
public class _newarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter Array Elements");
		int [] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		//Array Search
		System.out.println("Enter Element to search : ");
		int ele = sc.nextInt();
		boolean flag=false;
		for (int i=0;i<n;i++) {

			if (ele == arr[i]) {
				System.out.println(ele + " found in array at position " + i);
				flag = true;
				break;
			}
			if (!flag) {
					System.out.println(ele + " not found in array");
					break;
					
			}

			}
		
		//Array Print
		System.out.print("The Array Elements are : ");
		System.out.print(" { ");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]);
			if (i < n-1) {
				System.out.print(", ");
			}

		}
		System.out.print(" } ");
		System.out.println();
		
		
		//Array Sum
		int sum = 0;
		for (int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The Sum of array Elemensrs : " + sum);
		
	}

}
