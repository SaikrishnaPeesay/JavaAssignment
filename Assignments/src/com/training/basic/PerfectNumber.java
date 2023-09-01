package com.training.basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of to check: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter the number: ");
			int k = sc.nextInt();
			if (isPerfect(k)) {
				System.out.println("Perfect");
			} else {
				System.out.println("Not Perfect");
			}
		}
		sc.close();
	}

	public static boolean isPerfect(int k) {
		int sum = 0;
		for (int i = 1; i <=k/2
				; i++) {
			if (k % i == 0) {
				sum += i;
			}
		}
		return sum == k;
	}

}
