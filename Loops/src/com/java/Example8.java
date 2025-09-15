package com.java;

import java.util.Scanner;

//AP series(Arithmetic progression)
public class Example8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a,d,n");
		int a= sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int term=a;
		
		for(int i=0;i<=n;i++) {
			System.out.print(term +" ,");
			term+=d;
			
			
		}
	}
	

}
