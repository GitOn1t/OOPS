package com.java.std;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//model
class Student {
	String name;
	int rollno;
	int marks;

	public Student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}

}

//controller
public class StudentMain {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();

		Student s1 = new Student("ravi1", 101, 51);
		Student s2 = new Student("ravi2", 102, 53);
		Student s3 = new Student("ravi3", 103, 41);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		// show all students
		showStudents(studentList);
		// 1.add Student
		System.out.println(addStudent(studentList));
		showStudents(studentList);
		// 2removeByRollNO
	System.out.println(	removeStudentByRollNo(studentList));
		showStudents(studentList);

		// 3.updateStudents
		// 4.showStudents
		// 5.searchByRollNp
		
		searchById(studentList);

	}

	private static String removeStudentByRollNo(List<Student> studentList) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no");
		int rollno = sc.nextInt();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getRollno() == rollno) {
				studentList.remove(i);
				return "removed";
			}
		}

		return "not found";

	}

	// dao and daoIMpl
	// 1 add students
	public static String addStudent(List<Student> studentList) {
		System.out.println("add method is called");

		Student newStudent = new Student("ravi4", 104, 54);

		studentList.add(newStudent);

		return "successfullAdded";

	}

	// show all students
	public static String showStudents(List<Student> studentList) {
		System.out.println("show all students");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		return "completed";

	}
	
	public static String searchById(List<Student> studentList) {
		System.out.println("Search by rollNo");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rollNo ");
		int rollNo= sc.nextInt();
		for(int i =0; i<studentList.size();i++) {
			if(studentList.get(i).getRollno()==rollNo) {
				System.out.println(studentList.get(i));
				
			}
		}
		
		return null;
	}
}
