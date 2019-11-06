package com.class13;

public class task2 {

	public static void main(String[] args) {
		/* * Create a String and print it in reverse order (Sunday → yadnuS). 
		 * */
		String day32="Sunday";
		//System.out.println(day.charAt(5)+" "+day.charAt(4)+" "+day.charAt(3));
		System.out.println(day32.length());
		for(int i=day32.length()-1;i>=0;i--) {
			System.out.print(day32.charAt(i));
			}
		/* * Create a String and if the String is not empty perform the following: if the 
		 * * String has an odd number of characters and has 3 or more characters,print 
		 * * the character in the middle of the String. 
		 * */
		//break till 1:45
		String str1="Hellourwewr";
		int lenght=str1.length();
		int middle=str1.length()/2;
		System.out.println();
		if(!str1.isEmpty()) {
			if(lenght%2!=0 && lenght>=3) {
				System.out.println(str1.charAt(middle));
		}
	}

System.out.println("=====");
int a=5%2;
System.out.println(a);

	}

}
