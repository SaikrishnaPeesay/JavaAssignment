package com.training.basic;
import java.util.Scanner;
public class Armtrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNum,remainder,ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		originalNum=number;
		while(originalNum!=0) {
			remainder = originalNum%10;
			ans+=Math.pow(remainder, 3);
			originalNum/=10;
		}
		System.out.println(number==ans);
		
		

	}

}
