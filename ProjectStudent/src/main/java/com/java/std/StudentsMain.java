package com.java.std;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Students {
	String name;
	int rollNo;
	int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
}

public class StudentsMain {
	public static void main(String[] args) {

		List<Students> studentList = new ArrayList<Students>();
		Students s1 = new Students("zain1", 101, 78);
		Students s2 = new Students("zain2", 102, 78);
		Students s3 = new Students("zain3", 103, 78);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		// remove by rollno
		System.out.println(removeByRollNO(studentList));

		// show all students
		 show(studentList);
		 
		 // search by roll number
		 search(studentList);

	}

	public static String removeByRollNO(List<Students> studentList) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rollNo");
		int rollno = sc.nextInt();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getRollNo() == rollno) {
				System.out.println(studentList.get(i));
				studentList.remove(i);
				return "found";

			}
		}

		return "not found";
	}

	public static String show(List<Students> studentList) {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		return "showing";

	}
	
	public static String search(List<Students> studenList) {
		System.out.println("enter the roll no");
		Scanner sc= new Scanner(System.in);
		int rollNo=sc.nextInt();
		for(int i =0;i<studenList.size();i++) {
			if(studenList.get(i).getRollNo()==rollNo) {
				System.out.println(studenList.get(i));
			}
		}
		
		
		
		return null;
	}
	

}
