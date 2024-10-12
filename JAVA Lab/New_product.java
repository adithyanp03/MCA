package com.TCR23_MCA_2024;

public class New_product {
	int pcode;
	String pname;
	double price;
	
	public New_product(int pcode, String pname, double price) {
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	
	public void display() {
		System.out.println("Product code : " + pcode);
		System.out.println("Product name : " + pname);
		System.out.println("Product Price : " + price);
		
	}
	
	public static void main(String args[]) {
		
		New_product product1 = new New_product(1, "Lux", 35);
		New_product product2 = new New_product(2, "Dove", 75);
		New_product product3 = new New_product(3, "Vival", 30);
		
		if (product1.price>product2.price & product1.price>product3.price)
			product1.display();
		else if (product2.price>product1.price & product2.price>product3.price)
			product2.display();
		else
			product3.display();
			
	}

}
