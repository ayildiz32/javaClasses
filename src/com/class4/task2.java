package com.class4;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner loan=new Scanner(System.in);
		System.out.println("what is amount of  loan");
		
		int price=loan.nextInt();
		 if (price<200000)  {
			 System.out.println("you would lend the money");
		 }else{
			 System.out.println("you would reject the money");
			 
		 }
		 
		 System.out.println("********");
		
		 Scanner keyboard=new Scanner(System.in);
		 System.out.println("What is your age");
		 
		 int age=keyboard.nextInt();
		 if (age>=18) {
			 System.out.println("you can get to drive licence");
		 }else {
			 System.out.println("you will get a learners permit");
		 }
		 System.out.println("&&&&&&&&&&&");
		 
		 
	}

}
