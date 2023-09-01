package com.training.scan;

public class LongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This isajdjnd a elephant";
		String[] words = sentence.split(" ");
		String bigWord=" ";
		int i=0;
		for (String string : words) {
			if(string.length()>i) {
				i=string.length();
				bigWord=string;
			}
		}
		System.out.println(bigWord);

	}

}
