package com.training.basic;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {2,8,9,10,-2,-3};
		int k;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		System.out.println(arr[arr.length-2]);

	}

}
