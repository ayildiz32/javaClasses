package com.class14;

public class StringMethodRecap {

	public static void main(String[] args) {
		
//		String str="your Syntax Tecnologies";
//		System.out.println(str.replace('y', 'i'));
//		
//		System.out.println(str.replace("your", "my"));
		String str2="Video provides a powerful way to help you prove your point. "
				+ "When you click Online Video, you can paste in the embed "
				+ "code for the video you want to add. ";
		System.out.println(str2.replaceAll("in(.*)", ""));
		
		String str3="23423Hell3049o^&*^&*$%$";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z]", ""));
		
		System.out.println("**************");
		System.out.println(str2.replaceFirst(" ", ""));
	}

}
