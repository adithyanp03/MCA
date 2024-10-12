package com.TCR23_MCA_2024;

import java.util.*;
import java.io.*;
public class copyfile {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter File 1");
			String file1 = sc.next();
			System.out.println("Enter File 2");
			String file2 = sc.next();
			FileInputStream infile = new FileInputStream(file1);
			FileOutputStream outfile = new FileOutputStream(file2);
			int i;
			while ((i=infile.read())!=-1) {
				outfile.write(i);
			}
			infile.close();
			outfile.close();
			System.out.println("File Coppied succesfully");
		
			
		
			
			
		
			
			File f1 = new File(file2);
			Scanner file = new Scanner(f1);
			System.out.println("The content of file 2 are: ");
			while (file.hasNextLine()) {
				String data = file.nextLine();
				System.out.println(data);
			}
			//file.close();
	}
		
		
			catch (Exception e) {
				System.out.println("Error Occured");
				e.printStackTrace();
			}
	

}
}