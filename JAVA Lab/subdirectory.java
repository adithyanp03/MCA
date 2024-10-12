package com.TCR23_MCA_2024;


import java.util.*;
import java.io.File;
public class subdirectory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name of Directory : ");
		String dir = sc.next();
		File mydir = new File(dir);
		
		System.out.println("Enter File Name");
		String file = sc.next();
		String [] lists = mydir.list();
		
		if (mydir.exists()) {
			for (String i: lists) {
				System.out.println(i);
			}
		}
		
		int flag=0;
		for (String i: lists) {
			if (i.equals(file)) {
				System.out.println( "File Present");
				flag=1;
				break;
				
			 
			}
		}
			if (flag == 0) {
				System.out.println("File Absent !");
			}
			
		
		

	}

}
