package com.training.basic;
import java.util.*;
public class Greatest {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		int a[]= {5,8,2,3,4};
		int max = a[0];
		for (int i : a) {
			if (i>max) {
				max=i;
			}
		
		}
		System.out.println(max);
	}
}
