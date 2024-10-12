package com.TCR23_MCA_2024;

import java.util.*;
import java.io.*;
public class arraylist {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of 1st Arraylist : ");
		int s1 = sc.nextInt();
		
		System.out.println("Size of 2st Arraylist : ");
		int s2 = sc.nextInt();
		
		ArrayList<Integer> list1 = new ArrayList<>(s1);
		ArrayList<Integer> list2 = new ArrayList<>(s2);
		
		System.out.println("Elements of 1st Arraylist : ");
		for (int i=0;i<s1;i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("Elements of 2nd Arraylist : ");
		for (int i=0;i<s2;i++) {
			list2.add(sc.nextInt());
		}
		
		display(list1);
		System.out.println();
		display(list2);
		System.out.println();
		
		ArrayList<Integer> diff = new ArrayList<>(list1);
		diff.removeAll(list2);
		display(diff);
		
		
		
		

	}
	
	public static void display(ArrayList<Integer> arraylist) {
		for (int i=0;i<arraylist.size();i++) {
			System.out.print(arraylist.get(i) + " ");
		}
		
	}
	
	

}
