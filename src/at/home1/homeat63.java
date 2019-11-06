package at.home1;

import java.util.Scanner;

public class homeat63 {

	public static void main(String[] args) {
		
		
		
		String name;
	
		
		System.out.println("Enter the name of instructor");
		
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
		
		switch(name) {
		
		
		case "Shiva":
			
			System.out.println("Will take care of Java Assignment");
		break;
		case "Sandish":
			
			System.out.println("Will take care of SDLC Assignment");
		break;
		case "Weqas":
			
			System.out.println("Will take care of Selenium Assignment");
		break;
		
		case "Asel":
			
			System.out.println("Will take care of every Assignment");
		break;
		
		default:
			System.out.println(" Invalid instructor selected");
		
		}
		
		
	}

}
