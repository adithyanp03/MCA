package com.TCR23_MCA_2024;

import java.util.*;
public class __arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		ArrayList<Integer> diff = new ArrayList<>(list1);
		diff.removeAll(list2);
		System.out.println(diff.toString());
	}

}
