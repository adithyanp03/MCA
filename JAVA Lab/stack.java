package com.TCR23_MCA_2024;


import java.util.*;

public class stack <T> {
	public int size;
	public int top;
	public T[] store;
	
	public stack(int size, int top,T[] store) {
		
		super();
		this.size=size;
		this.top=-1;
		this.store=(T[]) new Object[size];
	
	}
	public void push(T val) {
		top++;
		store[top]=val;
	}
	
	public T pop() {
		T data=store[top--];
		return data;
	}
	
	public void display() {
		System.out.println(Arrays.toString(store));
	}
	

	
	
	
	



	public static void main(String[] args) {
		

	

}
}