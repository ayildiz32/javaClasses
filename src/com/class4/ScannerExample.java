package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter any number");
        int number=scan.nextInt();
        
		System.out.println("entered number is "+number);
	
		
		System.out.println("*******");
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your name");
		String name=input.nextLine();
		
		System.out.println("good afternoon "+name);
}

}
