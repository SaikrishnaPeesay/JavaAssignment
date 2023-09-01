package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a string: ");
			arr[i] = sc.nextLine();
		}
		// arr= {"sai","krishna"};
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		boolean flag = true;
		for (String string : arr) {
			if (string.equals(name)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("You are registered");
		} else {
			System.out.println("Name must be unique");
			
		}
	}

}
