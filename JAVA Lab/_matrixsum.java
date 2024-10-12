package com.TCR23_MCA_2024;

import java.util.Scanner;
public class _matrixsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of Rows of Matrix : ");
		int row = sc.nextInt();
		System.out.println("Enter No. of Columns of Matrix : ");
		int col = sc.nextInt();
		
		int [][] matrix1 = new int[row][col];
		int [][] matrix2 = new int[row][col];
		
		System.out.println("Enter elements of matrix 1 : ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of matrix 2 : ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		int [][] matrixsum = new int[row][col];
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrixsum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		printmatrix(matrixsum);
	}
		
		public static void printmatrix(int[][] matrix) {
		int row=matrix.length;
		int col=matrix[0].length;
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(matrix[i][j]  + " ");
			}
			System.out.println();
		}
		

	}

}


