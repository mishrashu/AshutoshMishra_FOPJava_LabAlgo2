package com.ashutosh.transactions.service;

import java.util.Scanner;

public class TransactionService {

	public void checkTransactions(int[] transactions, int totalNumberOfTargets) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < totalNumberOfTargets; i++) {

			int transactionCountAfterTargetAchieved = 0;
			int sum = 0;
			boolean isTargetAchieved = false;
			int valueOftarget;

			System.out.println("enter the value of target");
			valueOftarget = sc.nextInt();
			
			while (valueOftarget < 0) {
				System.out.println("Please enter positive values only");
				valueOftarget = sc.nextInt();
			}

			for (int j = 0; j < transactions.length; j++) {
				sum += transactions[j];
				transactionCountAfterTargetAchieved++;

				if (sum >= valueOftarget) {
					isTargetAchieved = true;
					break;
				}
			}

			if (isTargetAchieved)
				System.out.println("Target achieved after " + transactionCountAfterTargetAchieved + " transactions");
			else
				System.out.println("Given target is not achieved");

		}
		sc.close();
	}
}
