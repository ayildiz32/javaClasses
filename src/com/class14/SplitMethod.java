package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
//		String str="Video provides a powerful way to help you prove your point";
//		
//		String[] array=str.split(" ");
//		
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		
		// how can we find how many sentence are in the following string
		
		String str1="Today is Sunday. Its sunny day. and we are having java class";
		
		String[] array2=str1.split("\\.");
//		System.out.println(array2.length);
		
		for(String string : array2) {
			System.out.println(string.trim());
		}

	}

}
