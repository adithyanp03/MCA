package com.TCR23_MCA_2024;

import java.io.File;
public class create_file {

	public static void main(String[] args) {
		File obj = new File("file1.txt");
		
		//if (obj.createNewFile())) {
		      System.out.println("File created: " + obj.getName());
		  //  } else {
		      System.out.println("File already exists.");
		    }

	}


