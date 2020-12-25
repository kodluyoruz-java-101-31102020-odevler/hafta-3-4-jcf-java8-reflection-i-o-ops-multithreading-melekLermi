package com.Hafta3ve4Odevi.Soru3;

public class Student {

		private int age;
		private String studentID,studentName, studentLastname, department;
	
		public Student(String studentID, String studentName, String studentLastname,int age, String department) {
			this.studentID = studentID;
			this.studentName = studentName;
			this.studentLastname = studentLastname;
			this.age = age;
			this.department = department;			
		}

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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((department == null) ? 0 : department.hashCode());
			result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
			result = prime * result + ((studentLastname == null) ? 0 : studentLastname.hashCode());
			result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (age != other.age)
				return false;
			if (department == null) {
				if (other.department != null)
					return false;
			} else if (!department.equals(other.department))
				return false;
			if (studentID == null) {
				if (other.studentID != null)
					return false;
			} else if (!studentID.equals(other.studentID))
				return false;
			if (studentLastname == null) {
				if (other.studentLastname != null)
					return false;
			} else if (!studentLastname.equals(other.studentLastname))
				return false;
			if (studentName == null) {
				if (other.studentName != null)
					return false;
			} else if (!studentName.equals(other.studentName))
				return false;
			return true;
		}
		
		
		

}
