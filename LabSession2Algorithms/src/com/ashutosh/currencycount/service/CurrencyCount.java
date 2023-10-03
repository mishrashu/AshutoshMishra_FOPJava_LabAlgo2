package com.ashutosh.currencycount.service;

public class CurrencyCount {

	public void countCurrencyDenominations(int[] currencyDenominations, int amountToPay) {

		int[] currencyCounter = new int[currencyDenominations.length];

		try {
			for (int i = 0; i < currencyDenominations.length; i++) {

				if (amountToPay >= currencyDenominations[i]) {
					currencyCounter[i] = amountToPay / currencyDenominations[i];
					amountToPay = amountToPay - (currencyCounter[i] * currencyDenominations[i]);

					if (amountToPay == 0)
						break;
				}
			}

			if (amountToPay > 0) {
				System.out.println("exact amount can not be given with the heightest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < currencyDenominations.length; i++) {
					if (currencyCounter[i] != 0) {
						System.out.println(currencyDenominations[i] + ":" + currencyCounter[i]);
					}
				}
			}
		} catch (ArithmeticException er) {
			System.out.println(er + " notes of denomination 0 is invalid");
		}
	}
}
