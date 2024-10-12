package com.TCR23_MCA_2024;

import java.util.*;
import java.io.*;
 class prime extends Thread {
	private int n;
	
	public prime(int n) {
		this.n=n;
	}
		public void run() {
			
	try {

		for(int i=2;i<=n;i++) {
			int flag=1;
			for (int j=2;j<=Math.sqrt(i);j++) {
				if (i%j ==0) {
					flag=0;
				}
				
				
			}
			if(flag == 1) {
				System.out.println("Prime : " + i);
				Thread.sleep(500);
			}
			

		}
	} 
		
	catch (Exception e) {
	System.out.println("Error Occured.. !");
	e.printStackTrace();
}
 
	}
 
	
 }
 
 class mul extends Thread {
	 private int n;
	 
	 public mul(int n) {
	 this.n=n;
	 }
	 
	 public void run() {
		 
		 try {
		for (int i=1;i<=10;i++) {
			int multi=n*i;
			System.out.println(n + " * " + i + " = " + multi );
			Thread.sleep(1000);
		} 
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
 }


public class thread {
	public static void main(String args[]) {
		int n = 10;
		prime p = new prime(n);
		mul m = new mul(n);

		m.start();
		p.start();
	}
}
