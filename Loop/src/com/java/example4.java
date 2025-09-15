package com.java;

import java.util.Scanner;

public class example4 {
	// display multiplication table
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number whose table got to be generated: ");
		int num;
		num=sc.nextInt();
		int n=10;
		
		for(int i=1;i<=n;i++) {
			System.out.println(num + "* "+ i+ " = " + num*i);
		}
	}

}
