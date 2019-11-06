package com.class5;

public class task51 {

	public static void main(String[] args) {
		
		int day=4;
		
		if (day>=1 || day<=5) {
			System.out.println("It is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day"); 
		}
		
		
		
		System.out.println("************");
		
		
		double height=5.2;
		
		if (height<5) {
			System.out.println("Short");
		}else if(height>=5 && height<6) {
			System.out.println("Medium");
		}else if(height>=6) {
			System.out.println("Tall");
		}else {
			System.out.println("Invalid number");
		}
	}

}
