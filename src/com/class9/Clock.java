package com.class9;

public class Clock {

	public static void main(String[] args) {
		// 24 hours, 60 minutes

		for(int h=0; h<12; h++) {
			for(int m=0; m<60; m++) {
				
				System.out.println(h+":"+m+" pm");	
			}	
		}
		
		for(int h=0; h<12; h++) {
			for(int m=0; m<60; m++) {
				System.out.println(h+":"+m+" am");
				
			}
	    }	
	}
}
