package at.home1;

import java.util.Scanner;

public class homeat64 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scan=new Scanner(System.in);
        System.out.println("enter age of the Child");
		age=scan.nextInt();
		
		switch (age) {
		case 1:
			System.out.println("You can Crawl");
			break;
		case 2:
			System.out.println("You can Talk");
			break;
		case 3:
			System.out.println("You can Dance");
			break;
		case 4:
			System.out.println("You can get Trouble");
			break;
			default:
				System.out.println("I don't know how old you are");
		}
	}

}
