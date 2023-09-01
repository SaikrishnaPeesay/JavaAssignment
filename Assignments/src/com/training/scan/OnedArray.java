package com.training.scan;

import java.util.Scanner;

public class OnedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i =0;i<size;i++) {
			int u = sc.nextInt();
			arr[i]=u;
		}
//		System.out.println("Array elements:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
		for (int i = 0; i < size; i++) {
        	sum+=arr[i];
            
        }
        System.out.println((int)sum);
        System.out.println(sum/size);
        
        
    sc.close();
		
		

	}

}
