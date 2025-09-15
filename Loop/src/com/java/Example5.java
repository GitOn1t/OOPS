package com.java;

import java.util.Scanner;

public class Example5 {
	//find the sum of n numbers
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		
		System.out.println("The sum of n natural numbers is: "+ sum);
		
	}

}
