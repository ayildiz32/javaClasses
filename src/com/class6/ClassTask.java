package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		
		Scanner scan;
		
		String month;
		
		 scan=new Scanner(System.in);
	        System.out.println("when were you born?");
	        month=scan.nextLine();
		
		if (month.equals("january") || month.equals("february") || month.equals("december")) {
			month="winter";
		}else if(month.equals("march") || month.equals("april") || month.equals("may")) {
			month="spring";
		}else if(month.equals("june") || month.equals("july") || month.equals("august")) {
			month="summer";
		}else if(month.equals("september") || month.equals("october") || month.equals("november")) {
			month="winter is coming";
		}else {
			System.out.println("unknown");
		}
		System.out.println("you were born in "+month);

	}

}
