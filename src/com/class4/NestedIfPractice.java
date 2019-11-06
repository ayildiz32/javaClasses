package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {
		boolean isFriday=true;
		int day=14;
		if (isFriday) {
			System.out.println("today is friday");
			if (day==13) {
				System.out.println("i will watch movie"); }
			else {
			System.out.println("I will play game");
			}
			}else {
				System.out.println("Today is NOT friday");
			}		
	}

}
