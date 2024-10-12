package com.TCR23_MCA_2024;

import java.util.Scanner;
public class _Prime {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int n = sc.nextInt();
	boolean flag = true;
	if (n < 2) {
		flag = false; 
	}
	for (int i=2;i*i<=n;i++) {
		if (n%i == 0) {
			flag = false;
		}
	}
	
	if (!flag) {
		System.out.println("Not Prime");
	} else {
		System.out.println("Prime");
	}
	}
}