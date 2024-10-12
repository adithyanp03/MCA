package com.TCR23_MCA_2024;

import java.util.Scanner;
public class matrixSum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the No. of Rows of Matrix : ");
		int row = num.nextInt();
		System.out.println("Enter the No. of Columns of Matrix : ");
		int column = num.nextInt();
		
		int[][] matrix1 = new int[row][column];
		int[][] matrix2 = new int[row][column];
		
		System.out.println("Enter the elements of 1st Matrix");
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				matrix1[i][j] = num.nextInt();
			}
		}
		
		System.out.println("Enter the elements of 2nd Matrix");
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				matrix2[i][j] = num.nextInt();
			}
		}
		
		int[][] summatrix = new int[row][column];
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				summatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("Sum of the given 2 matrix : ");
		printmatrix(summatrix);
		
	}
	
	public static void printmatrix(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
