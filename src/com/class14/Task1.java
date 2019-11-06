package com.class14;

public class Task1 {

	public static void main(String[] args) {
		
      //Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		
		//		Create a String that should be combination of letters,
		//numbers and special characters. Find out how many alpha characters are there in the String.
		
		
        //		You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		//How would you find out how many sentences are in that String?

		String a="Ahmet come to class";
		System.out.println(a.replaceAll(" ", ""));
		
		
		String b="234$%$sdfs236*";
		System.out.println(b.replaceAll("[a-zA-Z0-9]", ""));
		
		String p="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] asl=p.split("\\?");
//	
		System.out.println(asl.length);
	}

}
