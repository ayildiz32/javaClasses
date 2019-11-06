package at.home1;

import java.util.Scanner;

public class homeat62 {

	public static void main(String[] args) {
		
		
		
		int age;
		String gender;
		
		Scanner scan=new Scanner(System.in);
		System.out.println();
		gender=scan.nextLine();
		
		System.out.println();
		age=scan.nextInt();
		if(age>25 && gender.equals("F")) {
			gender="Woman";
		}else if(age>25 && gender.equals("M")) {
			gender="Man";
		}else if(age<25 && gender.equals("F")) {
			gender="Girl";
		}else if(age<25 && gender.equals("M")) {
			gender="Boy";
		}else {
			gender="Invalid";
		}
System.out.println(gender);
	}

}
