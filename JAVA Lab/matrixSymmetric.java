package com.TCR23_MCA_2024;

import java.util.Scanner;
public class matrixSymmetric {
	public static void main (String args[]) {
		Scanner no = new Scanner(System.in);
		System.out.println("Enter the No. of Rows of Matrix : ");
		int row = no.nextInt();
		System.out.println("Enter the No. of Columns of Matrix : ");
		int column = no.nextInt();
		
		int[][] matrix = new int[row][column];  
		System.out.println("Enter the elements of Matrix : ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				matrix[i][j]=no.nextInt();
			}
		}
		
		System.out.println("Matrix : ");
		printMatrix(matrix);
		
		if (isSymmetric(matrix)) {
			System.out.println("Symmetric");
		}
		else {
			System.out.println("Not Symmetric");
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean isSymmetric(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		
		if (row != column) {
			return false;
		}
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	
	 
}
