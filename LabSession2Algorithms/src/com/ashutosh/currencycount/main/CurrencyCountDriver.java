package com.ashutosh.currencycount.main;

import java.util.Scanner;

import com.ashutosh.currencycount.service.CurrencyCount;
import com.ashutosh.currencycount.service.MergeSort;

public class CurrencyCountDriver {

	public static void main(String[] args) {

		int sizeOfCurrencyDenominations;
		int[] currencyDenominations;
		int amountToPay;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");
		sizeOfCurrencyDenominations = sc.nextInt();

		currencyDenominations = new int[sizeOfCurrencyDenominations];

		System.out.println("enter the currency denominations value");

		for (int i = 0; i < currencyDenominations.length; i++) {
			currencyDenominations[i] = sc.nextInt();
		}

		System.out.println("enter the amount you want to pay");
		amountToPay = sc.nextInt();

		MergeSort obj = new MergeSort();
		obj.performSorting(currencyDenominations, 0, currencyDenominations.length - 1);

		CurrencyCount obj1 = new CurrencyCount();
		obj1.countCurrencyDenominations(currencyDenominations, amountToPay);

		sc.close();
	}
}
