package com.training.scan;

public class Polindrome {

	public static void main(String[] args) {
		String original = "saias";
		String reverse = "";
		for(int i=original.length()-1;i>=0;i--) {
			reverse+=original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("It is Polindrome");
		}else {
			System.out.println("It is not a Polindrome");
		}
	}

}
