package com.TCR23_MCA_2024;

import java.util.*;
public class __matrix {

	
	public static void display(int[][] matrix, int row, int col) {
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void transpose(int[][] matrix, int row, int col) {
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean isSymmetric(int[][] matrix,int row, int col) {
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
			
		}
		return true;
		
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numer of rows : ");
		int row = sc.nextInt();
		
		System.out.println("Enter numer of Cols : ");
		int col = sc.nextInt();
		
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		
		System.out.println("Enter Elements of Matrix 1 : ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Elements of Matrix 2 : ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		int[][] matrixadd = new int[row][col];
		System.out.println("Enter Elements of Matrix 2 : ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrixadd[i][j]=matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("The Sum of Matrix 1 and 2 : ");
		display(matrixadd, row, col);
		
		System.out.println("Transpose of Matrix 1 : ");
		transpose(matrixadd, row, col);
		
		if (isSymmetric(matrix1, row , col)) {
			System.out.println("MAtrix Symetric");
		}else {
			System.out.println("Not");
		}
		
		
	}

}
