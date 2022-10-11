package com.greatlearning.LabAlgo2.Question1;

import java.util.Scanner;

class PayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array"); // input to determine size of array

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the values of array"); // input to determine values of array
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved"); // input to determine the number
		// of targets

		int NoOfTargets = sc.nextInt();

		// loop if number of targets is more than 1
		while (NoOfTargets-- != 0) {
			boolean check = false;
			long target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved in " + (i + 1) + " transactions ");
					check = true;
					break;
				}
			}
			if (check == false) {
				System.out.println("Given target is not achieved ");
			}
		}
		sc.close();
	}

}
