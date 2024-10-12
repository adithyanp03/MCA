package com.TCR23_MCA_2024;

import java.util.*;
public class sumofn {
	public static void main (String args[]) {
		Scanner num = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter nth No. : ");
		int n = num.nextInt();
		
		for (int i=0;i<=n;i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		
	}
}
