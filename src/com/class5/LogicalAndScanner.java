package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*ask user to enter age
		 * if age is from 1 to 3 -->you are a baby
		 * if age from 3-5 -->you are a toddler
		 * if age from 5-12-->you are a kit
		 *  if age from 12-19--> you are teenager
		 *  if age >20---you are adult
		 *  
		 */
		
		int age;
		Scanner input;
		
		
		
  input=new Scanner(System.in);
  System.out.println("What is your age?");
  age=input.nextInt();
  
  if (age>=1 && age<=3) {
	  System.out.println("you are a baby");
  }else if(age>=3 && age<=5) {
	  System.out.println("you are a toddler");
  }else if(age>5 && age<=12) {
	  System.out.println("you are a kit");
  }else if(age>=12 && age<=19) {
	  System.out.println("teenager");
  }else if(age>=20) {
	  System.out.println("you are adult");
  }else {
	  System.out.println("you are unborn or dead");
  }
  
		
	}

}
