package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			System.out.println("I am outer loop");
			
			for(int j=1; j<=3; j++) {
				System.out.println("I am inner loop");
			}
		}
System.out.println("*******************");
		
		for(int i=0; i<=5; i++) {
			for (int s=0; s<=5; s++) {
				System.out.println(i+" "+s);
			}
		}
		
		
	}

}
