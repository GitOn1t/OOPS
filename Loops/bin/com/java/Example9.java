package com.java;

import java.util.Scanner;

public class Example9 {
	//display geometric progression  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("program for geometric progression");
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of r: ");
		int r= sc.nextInt();
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		 int term=a;
		 for(int i=0;i<n;i++) {
			 System.out.print(term + " ,");
			 term*=r;
		 }
		
	}

}
