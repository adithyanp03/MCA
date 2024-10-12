package com.TCR23_MCA_2024;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class _arraylist {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of 1st List");
		int s1 = sc.nextInt();
		
		ArrayList<Integer> intlist = new ArrayList<>(s1);
		
		System.out.println("Enter Array List Elements : ");
		for (int i=0;i<s1;i++) {
			intlist.add(sc.nextInt());
		}
		display1(intlist);
		intlist.add(6);
		
		System.out.println();
		
		display2(intlist);
		
		
	}
	
	public static void display1(ArrayList<Integer> arraylist) {
		Iterator<Integer> iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()  + " ");
		}
	}
	
	public static void display2(ArrayList<Integer> arraylist) {
		for (int i=0;i<arraylist.size();i++) {
			System.out.print(arraylist.get(i) + " ");
		}
	}

}
