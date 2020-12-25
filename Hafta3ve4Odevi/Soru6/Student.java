package com.Hafta3ve4Odevi.Soru6;

public class Student {

	private int age;
	private String studentID,studentName, studentLastname, department;

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentLastname() {
		return studentLastname;
	}

	public void setStudentLastname(String studentLastname) {
		this.studentLastname = studentLastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		
		return " Student ID: " + studentID +
				" Student name: " + studentName +
				" Student lastname: " + studentLastname +
				"Student age: " + age +
				" Student department: " + department +
				"-> Student Information";			
	}
}
