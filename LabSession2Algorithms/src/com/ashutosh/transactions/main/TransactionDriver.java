package com.ashutosh.transactions.main;

import java.util.Scanner;

import com.ashutosh.transactions.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {

		int numberOfTransaction;
		int[] transactions;
		int totalNumberOfTargets;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of transaction array");
		numberOfTransaction = sc.nextInt();

		while (numberOfTransaction < 0) {
			System.out.println("Please enter positive values only");
			numberOfTransaction = sc.nextInt();
		}

		transactions = new int[numberOfTransaction];

		System.out.println("enter the values of array");

		for (int i = 0; i < transactions.length; i++) {
			transactions[i] = sc.nextInt();

			while (transactions[i] < 0) {
				System.out.println("Please enter positive values only");
				transactions[i] = sc.nextInt();
			}
		}

		System.out.println("enter the total no of targets that needs to be achieved");
		totalNumberOfTargets = sc.nextInt();

		while (totalNumberOfTargets < 0) {
			System.out.println("Please enter positive values only");
			totalNumberOfTargets = sc.nextInt();
		}

		TransactionService obj1 = new TransactionService();
		obj1.checkTransactions(transactions, totalNumberOfTargets);

		sc.close();
	}
}