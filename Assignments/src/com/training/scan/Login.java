package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"Sai","krishna","Kohli"};
		System.out.println("Enter user name to login: ");
		String name = sc.nextLine();
		boolean flag = false;
		for (String string : arr) {
			if(string.equals(name)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("You are logged in successfully");
		}else {
			System.out.println("Invalid Username");
		}
	}

}
