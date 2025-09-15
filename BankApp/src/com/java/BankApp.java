package com.java;

import java.util.HashMap;
import java.util.Scanner;

public class BankApp {

	static HashMap<String, Double> account = new HashMap<String, Double>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("-------Bank menu------");
			System.out.println("1. Create an account");
			System.out.println("2. View the account");
			System.out.println("3.  Deposite");
			System.out.println("4. Withdraw");
			System.out.println("5. Delete an account");
			System.out.println("0. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				create(sc);
				break;
			case 2:
				view(sc);
				break;
			case 3:
				deposite(sc);
				break;
			case 4:
				withdrawal(sc);
				break;
			case 5:
				delete(sc);
				break;
			case 0:
				System.out.println("Goodbye!:)");
			default:
				System.out.println(" ");
			}

		} while (choice != 0);

	}

	static void create(Scanner sc) {
		System.out.println("Enter the account number");
		String acc = sc.next();
		System.out.println("Enter the initial balance");
		double bal = sc.nextDouble();
		account.put(acc, bal);
		System.out.println("Account created ");

	}

	static void view(Scanner sc) {
		System.out.println("Enter the account number");
		String acc = sc.next();
		if (account.containsKey(acc)) {
			System.out.println("Balance " + account.get(acc));
		} else {
			System.out.println("Account not found");
		}

	}

	static void deposite(Scanner sc) {
		System.out.println("Enter the account number");
		String acc = sc.next();

		if (account.containsKey(acc)) {
			System.out.println("Enter the ammount");
			double amnt = sc.nextDouble();
			account.put(acc, account.get(acc) + amnt);
			System.out.println("Amount deposited sucessfuly");

		}

	}

	static void withdrawal(Scanner sc) {
		System.out.println("Enter the account number");
		String acc = sc.next();
		if (account.containsKey(acc)) {
			System.out.println("Enter the amount");
			Double amnt = sc.nextDouble();
			Double bal = account.get(acc);
			if (amnt < bal) {
				account.put(acc, bal - amnt);
				System.out.println("amount withdrawed sucessfuly");
			} else {
				System.out.println("balance insufficient");
			}
		} else {
			System.out.println("Account not found");
		}
	}
	
	static void delete(Scanner sc) {
		System.out.println("Enter the account number");
		String acc=sc.next();
		if(account.containsKey(acc)) {
			account.remove(acc);
			System.out.println("Account deleted sucessfuly");
		} else {
			System.out.println("Account not found");
		}
	}

}
