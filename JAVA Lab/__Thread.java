package com.TCR23_MCA_2024;

import java.util.*;

class NewPrime extends Thread {
	int n;
	
	public NewPrime(int n) {
		this.n=n;
	}
	
	public void run() {
		try {
			

			for (int i=0;i<n;i++) {
				boolean flag=true;
				for (int j=0;i+i<j;j++) {
					if (i%j == 0) {
						flag=false;
					}
				}
				
				if (flag==true) {
					System.out.println("Prime : " + i);
					Thread.sleep(500);
					
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Newmul extends Thread {
	int n;
	
	public Newmul(int n) {
		this.n=n;
	}
	
	public void run() {
		try {
			
			for (int i=1;i<=10;i++) {
				int multi=n*i;
				System.out.println(n + " * " + i + " = " + multi );
				Thread.sleep(1000);
			} 
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}




public class __Thread {
	
	public static void main(String args []) {
	
	int n=5;
	NewPrime p = new NewPrime(n);
	Newmul m = new Newmul(n);
	
	p.start();
	m.start();
}
}
