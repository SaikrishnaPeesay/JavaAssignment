package com.training.scan;

import java.util.Scanner;

public class SmallestUsingAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a= sc.nextInt();
		System.out.println("Enter the Second number ");
		int b= sc.nextInt();
		System.out.println("Enter the Third number ");
		int c= sc.nextInt();
		
		int smallest = a;
		if(b<a&&b<a) {
			smallest=b;
		}else if(c<a&&c<b){
			smallest=c;
		}
		System.out.println("Smallest is "+ smallest);

	}

}
