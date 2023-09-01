package com.training.basic;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Values to Enter: ");
		int number = sc.nextInt();
		for(int z=0;z<=number;z++) {
			System.out.println("Enter the number");
			int a= sc.nextInt();
			if(isPrime(a)) {
				System.out.println("Is prime");
			}else {
				System.out.println("Not Prime");
			}
			
		}
		
		

	}
	public static boolean isPrime(int p) {
		if(p<=1) {
			return false;
		}
		
		for(int i=2;i<=(int)Math.sqrt(p)+1;i++) {
			if(p%i==0) {
				return false;
			}
		}
		return true;
	}

}
