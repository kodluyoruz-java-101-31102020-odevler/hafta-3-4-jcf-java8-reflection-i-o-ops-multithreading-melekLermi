package com.Hafta3ve4Odevi.Soru3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Please enter your student ID.");
		String studentID= scan.nextLine();
		
		System.out.println(" Please enter your name.");
		String studentName = scan.nextLine();
		
		System.out.println(" Please enter your lastname.");
		String studentLastname = scan.nextLine();
		
		System.out.println(" Please enter your age.");
		int age = scan.nextInt();
		
		System.out.println(" Please enter your department.");
		String department = scan.next();
				
		
		Map<String, List<Student>> studentInfo = new HashMap<String, List<Student>>();
		studentInfo.put(studentID, Arrays.asList(new Student(studentID, studentName, studentLastname, age, department)));
	
		System.out.println(studentInfo);
	
	}

}
