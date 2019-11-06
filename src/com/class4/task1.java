package com.class4;

public class task1 {

	public static void main(String[] args) {
		boolean diploma=true;
		double gpa=3.5;
		
		
		if (diploma) {
			System.out.println("Congratulations");
			if (gpa>=3.5) {
				System.out.println("you are eligible for scholarship");
			}else {
				System.out.println("you should have study hard");
			}
			
		}else {
			System.out.println("Not Good!!!");
		}
		
		System.out.println("*********");
		
		
		
		double rate=44.2;
		double price=200000;
		
		
		if (rate>=4.5) {
			System.out.println("you will not buy a house");
		}else {
			System.out.println("you will consider to buy a house");
			if (price>200000) {
				System.out.println("you should take a loan");
			}else {
				System.out.println("you pay cash");
			}
		}
	
}
}

 