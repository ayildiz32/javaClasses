package com.class6;

import java.util.Scanner;

public class task51 {

	public static void main(String[] args) {
	
		Scanner scan;
		
    boolean sale=true;
   
    
    scan=new Scanner(System.in);
    
    double price; 
    double discount;
    double lastPrice;
    
    if (sale) {
    	
    	System.out.println("Please Enter Price");
    	price=scan.nextDouble();
    	
    		if(price<20) {
    			discount=price*0.1;
//    			lastPrice=price-discount;
    			
    				}else if(price>=20 && price<100) {
    						discount=price*0.2;
//    							lastPrice=price-discount;
    							
    					} else if(price>=100 && price<500) {
    							discount=price*0.3;
    								
    								
    							}else {
    								discount=price*0.5;
    								
    									}
    		lastPrice=price-discount;
    		 System.out.println("After discount "+discount+" the price item reduce from " + price + " to "+lastPrice );
    	
    	}else {
    		System.out.println("I am not shopping");
    		}
   
    
	}

}
