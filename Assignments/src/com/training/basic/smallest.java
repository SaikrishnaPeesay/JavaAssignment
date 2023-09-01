package com.training.basic;

public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,9,44,-3,8};
		int min=arr[0];
		for (int i : arr) {
			if(i<min) {
				min=i;
			}
		
		}
		System.out.println(min);
	}

}
