package com.Hafta3ve4Odevi.Soru6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		
		String dosyaYolu = "...eclipse-workspace\\Hafta3-4Odevi\\src\\com\\Hafta3ve4Odevi\\Soru6\\StudentInfo";
		
		try {
			File myObj = new File(dosyaYolu);
		    	if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        } else {
		        System.out.println("File already exists.");
		        }
		    	} catch (IOException e) {
		    	System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

		
		
		try {
		    FileWriter myWriter = new FileWriter(dosyaYolu);
		    myWriter.write("----Student Info---- \n");

			Scanner scan=new Scanner(System.in);
		
			System.out.println(" Please enter your student ID.");
			String studentID= scan.nextLine();
			myWriter.write(" Student ID: " + studentID + "\n");
			System.out.println(" ");

			System.out.println(" Please enter your name.");
			String studentName = scan.nextLine();
			myWriter.write(" Student name: " + studentName+ "\n");
			System.out.println(" ");

			System.out.println(" Please enter your lastname.");
			String studentLastname = scan.nextLine();
			myWriter.write(" Student lastname: " + studentLastname + "\n");
			System.out.println(" ");
		
			System.out.println(" Please enter your age.");
			int age = scan.nextInt();  
			String agee = Integer.toString(age);
			myWriter.write(" Student age: " + agee+ "\n");
			System.out.println(" ");

			System.out.println(" Please enter your department.");
			String department = scan.next(); 	
			myWriter.write(" Student department: " + department + "\n");
			System.out.println(" ");

		    myWriter.close();
		    System.out.println("Successfully wrote to the file.\n");
		    
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
		
			FileReader fr = new FileReader(dosyaYolu);
			fr.toString();
			
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ( (str = br.readLine()) != null) {
				System.out.println(str + "\n");
			}
		
			br.close(); 

	}
	
}