package com.TCR23_MCA_2024;

import java.util.*;
public class bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter Array Elements");
		int [] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		display(arr);
		
		bubble(arr);
		display(arr);
	}
	
	public static <T> void display(int[] arr) {
		int n=arr.length;
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
	}
	
	public static <T extends Comparable<T>> void bubble(int[] arr) {
		int n=arr.length;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-i-1;j++) {
				if (arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
	}
	


}
