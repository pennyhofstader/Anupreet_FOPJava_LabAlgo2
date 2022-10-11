package com.greatlearning.LabAlgo2.Question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CurrencyDenomination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// input to determine currency size
		System.out.println("Enter the size of currency denominations");
		int currencySize = sc.nextInt();

		// input to determine currency denominations value
		System.out.println("Enter the currency denominations value");
		Integer[] denominationValue = new Integer[currencySize];
		for (int i = 0; i < currencySize; i++) {
			denominationValue[i] = sc.nextInt();
		}

		// logic to use the minimum number of notes
		Arrays.sort(denominationValue, Collections.reverseOrder());
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		int i = 0;

		int currencyCount[] = new int[currencySize];
		while (amount > 0) {
			currencyCount[i] = amount / denominationValue[i];
			amount = amount - (denominationValue[i] * currencyCount[i]);
			i++;
		}

		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int j = 0; j < currencySize; j++) {

			System.out.println(denominationValue[j] + " : " + currencyCount[j]);
		}
		sc.close();

	}
}
