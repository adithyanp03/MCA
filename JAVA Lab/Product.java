package com.TCR23_MCA_2024;

import java.util.*;
public class Product {
	
	int pcode;
	String pname;
	double price;
	
	public Product(int pcode, String pname, double price) {
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
		
	public void display() {
		System.out.println("Product Code : " + pcode);
		System.out.println("Product Name : " + pname);
		System.out.println("Product Price : " + price);
		
	}
	
	public static void main(String args[]) {
		Product product1 = new Product(1, "Colgate", 45);
		Product product2 = new Product(2, "Dove", 75);
		Product product3 = new Product(3, "Sneekers", 50);
	
	
	product1.display();
	System.out.println();
	product2.display();
	System.out.println();
	product3.display();
	
	System.out.println();
	System.out.println("The Smallest price product is");
	if (product1.price<product2.price & product1.price<product3.price)
		
		product1.display();
	
	else if (product2.price<product1.price & product2.price<product3.price)
	
		product2.display();
	
	else
	
		product3.display();
	
	
	}
}
	
