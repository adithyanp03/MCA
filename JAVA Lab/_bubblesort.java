package com.TCR23_MCA_2024;

import java.util.*;
public class _bubblesort {

	public static void main(String[] args) {
		int [] arr = {2,5,1,8,4,3,10};
		
		printarray(arr);
		System.out.println();
		bubblesort(arr);
		System.out.println();
		printarray(arr);		

	}
	
	public static void bubblesort(int[] array) {
		int n = array.length;
		int temp = 0;
		
		for (int i=0;i<n;i++) {
			for (int j=1;j<(n-i);j++) {
				if (array[j-1] > array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	
	public static void printarray(int[] array) {
		int n=array.length;
		System.out.print(" { ");
		for (int i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("} ");
	}

}
