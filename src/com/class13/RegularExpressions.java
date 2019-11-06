package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		// print only text not numbers
		
		String str="45346He3464l3436lo63";
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[a-zA-Z]", ""));
		
		// remove everything exept text and numbers
		
		String str2="hi#$How^&*(&^%354835@@";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
