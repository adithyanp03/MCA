package com.TCR23_MCA_2024;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source file path:");
        String sourceFile = scanner.nextLine();

        System.out.println("Enter the destination file path:");
        String destinationFile = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(sourceFile);
        FileOutputStream outputStream = new FileOutputStream(destinationFile);

        byte[] buffer = new byte[1024];
        int bytesRead;
        System.out.println();
        System.out.println("File copied successfully!");
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
            System.out.print(new String(buffer, 0, bytesRead));
        }

        inputStream.close();
        outputStream.close();
        
        
        


        

    }
}
