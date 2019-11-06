package com.class8;

import java.util.Scanner;

public class task83 {

	public static void main(String[] args) {
		
//		for(int a=1; a<=50; a++) {
//			if(a%3==0) {
//				continue;
//			}
//			System.out.println(a);
//		}
		Scanner scan=new Scanner(System.in);
		
		
		for(int b=1; b<=10; b++) {
			
			System.out.println("apply for credit card");
			String ask=scan.nextLine();
			
				if(ask.equalsIgnoreCase("yes")) {
					System.out.println("stop");
					break;
			}
			
			
			
		}
		
	}

}
