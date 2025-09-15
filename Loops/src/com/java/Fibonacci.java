package com.java;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Program to write Fibonacci series");
		System.out.println("Enter the term");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+ " , "+ b + " , " );
		for(int i=0;i<n-2;i++) {
			
			c=a+b;
			System.out.print(c +" , ");
			a=b;
			b=c;
			
			
		}
	}

}
