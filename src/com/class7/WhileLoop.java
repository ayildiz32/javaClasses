package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		
		int time=8;
		
		if(time<12) {
			System.out.println("Good Morning");
		}
		
		System.out.println("**************");
		
		while(time<12) {
			System.out.println("Good Morning");
			time++;
		}

		System.out.println("///////////");
		
		int d=-1;
		
		while(d<4) {
			System.out.println("Good Afternoon");
			d++;
		}
		System.out.println("Outside of while loop");
	}

}
