package com.TCR23_MCA_2024;

import java.util.Scanner;

public class _matrixtranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of Rows of Matrix : ");
		int row = sc.nextInt();
		System.out.println("Enter No. of Columns of Matrix : ");
		int col = sc.nextInt();
		
		int [][] matrix1 = new int[row][col];

		
		System.out.println("Enter elements of matrix  : ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		printmatrix(matrix1);
		System.out.println();
		transpose(matrix1);
		
		if(isSymmetric(matrix1)) {
			System.out.println("Matrix is Symmetric");
		} else {
			System.out.println("MAtrix is not Symmetric");
		}
	}
		public static void printmatrix(int [][] matrix) {
			int row = matrix.length;
			int col = matrix[0].length;
			for (int i=0;i<row;i++) {
				for (int j=0;j<col;j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		
		public static boolean isSymmetric(int[][] matrix) {
			int row = matrix.length;
			int col = matrix[0].length;
			
			if (row != col) {
				return false;
			}
			
			for (int i=0;i<row;i++) {
				for (int j=0;j<col;j++) {
					if(matrix[i][j] != matrix[j][i])
					return false;
				}
			}
			return true;
			
		}
		
		public static void transpose(int [][] matrix) {
			int row = matrix.length;
			int col = matrix[0].length;
			for (int i=0;i<row;i++) {
				for (int j=0;j<col;j++) {
					System.out.print(matrix[j][i] + " ");
				}
				System.out.println();
			}
		}
	}



