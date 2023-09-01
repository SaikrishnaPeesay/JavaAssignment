package com.training.scan;

import java.util.Scanner;

public class GreatestUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a= sc.nextInt();
		System.out.println("Enter the Second number ");
		int b= sc.nextInt();
		System.out.println("Enter the Third number ");
		int c= sc.nextInt();
		System.out.println(a>b&&b>c?"A is Greatest":b>c?"B is Greatest":"c is greatest");
		

	}

}
