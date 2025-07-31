package com.java.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp {
	String name;
	String Id;
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Emp(String name, String id, int salary) {
		super();
		this.name = name;
		Id = id;
		this.salary = salary;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", Id=" + Id + ", salary=" + salary + "]";
	}

}

public class Employee {
	public static void main(String[] args) {
	    List<Emp> employeeList = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);

	    // Sample data
	    employeeList.add(new Emp("zain1", "1j", 23456));
	    employeeList.add(new Emp("zain2", "1f", 23457));
	    employeeList.add(new Emp("zain3", "1k", 23458));

	    while (true) {
	        // Menu options
	        System.out.println("1. Add Employee");
	        System.out.println("2. Show All Employees");
	        System.out.println("3. Remove Employee by ID");
	        System.out.println("4. Search Employee by ID");
	        System.out.println("5. Update Employee Salary");
	        System.out.println("6. Exit");

	        int choice = sc.nextInt();

	        // Switch-case to handle user choice
	        switch (choice) {
	            case 1: add(employeeList); break;
	            case 2: show(employeeList); break;
	            case 3: System.out.println(remove(employeeList)); break;
	            case 4: System.out.println(search(employeeList)); break;
	            case 5: System.out.println(update(employeeList)); break;
	            case 6: System.exit(0); break;
	            default: System.out.println("Invalid choice");
	        }
	    }
	}


	public static String add(List<Emp> employeeList) {
		System.out.println("add the employee");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the Id");
		String Id = sc.next();
		System.out.println("Enter the amount");
		int salary = sc.nextInt();

		Emp addEmp = new Emp();
		addEmp.setId(Id);
		addEmp.setName(name);
		;
		addEmp.setSalary(salary);
		employeeList.add(addEmp);
		System.out.println("Added sucessfully");

		return "completed ;)";
	}

	public static String show(List<Emp> emplList) {

		for (int i = 0; i < emplList.size(); i++) {
			System.out.println(emplList.get(i));
		}
		return "success";	 
	}
	
	public static String remove(List<Emp> empList) {
		System.out.println("Enter the ID");
		
		Scanner sc= new Scanner(System.in);
		String Id=sc.next();
		
		for(int i=0;i<empList.size();i++) {
			if(empList.get(i).getId().equals(Id)) {
				empList.remove(i);
				return "removed";
				
			}
		}
		return "not found";
	}
	
	public static String search(List<Emp> emplList) {
		System.out.println("search by id");
		Scanner sc= new Scanner(System.in);
		String ID= sc.next();
		
		for(int i=0;i<emplList.size();i++) {
			if(emplList.get(i).getId().equals(ID)) {
				System.out.println(emplList.get(i));
				return"found";
				
			}
		}
		
		return"not found" ;
	}
	
	public static String update(List<Emp> empList){
		
		System.out.println("update the employee");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the Id");
		String Id = sc.next();
		System.out.println("Enter the amount");
		int salary = sc.nextInt();
		for(Emp emp:empList) {
			if(emp.getId().equalsIgnoreCase(Id)&& emp.getName().equalsIgnoreCase(name)) {
				emp.setSalary(salary);
				
				return "Updated the salary for" + name;
			}
		}
		
		return "match not found";
	}
	
	

}
