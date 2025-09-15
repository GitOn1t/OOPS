package com.java;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		n=sc.nextInt();
		int count=0;
		while (n>0) {
			n=n/10;
			count +=1;	
		}
		System.out.println(count);
	}

}
