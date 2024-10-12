package com.TCR23_MCA_2024;

public class _Product {
	int pcode;
	String pname;
	double price;
	
	public _Product(int pcode, String pname, double price) {
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	
	void display() {
		System.out.println("Product Code : " + pcode);
		System.out.println("Product Name : " + pname);
		System.out.println("Product Price : " + price);
	}
	
	public static void main(String args[]) {
		_Product product1 = new _Product(1, "Colagate", 45);
		_Product product2 = new _Product(2, "Dove", 75);
		_Product product3 = new _Product(3, "Lux", 30);
		
//		product1.display();
//		System.out.println();
//		product2.display();
//		System.out.println();
//		product3.display();
		

		System.out.println("The Prodcut with Smallest Price is");
		System.out.println();
		if (product1.price < product2.price && product1.price < product3.price) {
			product1.display();
		} else if (product2.price < product1.price && product2.price < product3.price) {
			product2.display();
		} else {
			product3.display();
		}
		
	}
}
