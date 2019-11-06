package com.class7;

import java.util.Scanner;

public class homework71 {

	public static void main(String[] args) {
		/*You need ask user to pay for coffee
         * You need to keep asking user to pay for it untill
         * entered price is equal=5;
         * After user paid then say "Enjoy your coffee!"
         */
		
		Scanner scan=new Scanner(System.in);

		

        int i=1;
        
		while(i>=0) {
		    
		    System.out.println("Please pay your cooffee");
		    int price=scan.nextInt();
		    
		    if(price==5) {
		        System.out.println("enjoy with your coffee");
		        break;
		    }
		    
		    i++;
		    
		    
		}
	
		int price1;
		System.out.println("Please pay you coffeeee");
		price1=scan.nextInt();
		
		while(price1!=5) {
			System.out.println("Please pay for your cofffffee");
			price1=scan.nextInt();
		}
		System.out.println("enjoy with your coffee");
		}
		
	}


