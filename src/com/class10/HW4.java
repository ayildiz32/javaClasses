package com.class10;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int secretNumber;
		int guessNumber;
		
		
		secretNumber=12;
		
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber=scan.nextInt();

			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber!=secretNumber);
             System.out.println("congratulations you got it");
	}

}
