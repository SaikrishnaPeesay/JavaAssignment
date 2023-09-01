package com.training.basic;

public class SumAndAverage {

	public static void main(String[] args) {
		int[] arr = {5,10,15,20,28};//76
		float sum=0;
		for (int a : arr) {
			sum+=a;
		}
		System.out.println((int)sum);
		System.out.println(sum/(arr.length));
	}

}
