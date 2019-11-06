package com.class7;

public class exp71 {

	public static void main(String[] args) {
		
		// print even numbers from 20 to 50 using do while
		// way 1
		
		int num=20;
		
		do {
			System.out.println(num);
			num+=2;
		}while(num<=50);
		
		num++;
		
		
// way 2
		
		int even1=30;
		do {
			if(even1%2==0) {
				System.out.println(even1);
			}
			even1++;
			
		} while(even1<=50);
			
		
	}

}
