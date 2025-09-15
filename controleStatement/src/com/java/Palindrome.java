package com.java;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		n=sc.nextInt();
		int m=n;
		int reversed=0;
		while(n>0) {
		    int r=n%10;
		    reversed=reversed*10+r;
			n=n/10;
		}
		if(m==reversed) {
			System.out.println("It is a pallindrome");
		}else {
			System.out.println("It is not a Pallindrome");
		}
	}

}
