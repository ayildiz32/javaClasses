package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		String userGender;	
		
		
Scanner scan=new Scanner(System.in);
System.out.println("Please enter your gender: F or M");
char gender=scan.next().charAt(0);



switch (gender) {
case'F':
	userGender="Female";
	break;
case'M':
	userGender="Male";
	break;
}
 System.out.println(userGender);
	
	}

}
