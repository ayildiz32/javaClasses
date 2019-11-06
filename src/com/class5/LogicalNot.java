package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean b1=!true;
		boolean b2=false;
		
		boolean traffic=true;
		//if traffic--> late, else --> on time
		
		if (!traffic) {
			System.out.println("On time");
		}else {
			System.out.println("Late");
		}
		
		
		
		System.out.println("///////////");
		
		
boolean isRain=false;
		
		if (!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Do not take an umbrella");
		}

		
		System.out.println("$$$$$$$$$$$$$$$");
		
		
		
		int num1=10;
		int num2=20;
		
		if (num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		
		if (!(num1==num2)) {
			System.out.println("number are not equal");
		}else {
			System.out.println("number are equal");
		}
		
		System.out.println("********************");
		
		String name="Mary";
		String name2="Anna";
		
//	     true OR false--> true add NOT --> false
			if (!(name.equals("Mary") || name2.equals("Anna"))) {
				System.out.println("You are not my sister");
			}else {
				System.out.println("You are my sister");
			}
	}

}
