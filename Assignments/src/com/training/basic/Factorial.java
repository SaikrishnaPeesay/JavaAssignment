package com.training.basic;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
//		int i =5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int i = sc.nextInt();
		int x = 1;
		for(int val=1;val<=i;val++) {
			x=x*val;
		}
		System.out.println(x);
		
	}

}
