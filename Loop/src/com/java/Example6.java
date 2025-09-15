package com.java;

import java.util.Scanner;

public class Example6 {
	//factorial of a number
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n;
		n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			
			fact*=i;
			
		}
		System.out.println("The factorial of the given number is: " + fact);
	}

}
