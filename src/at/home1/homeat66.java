package at.home1;

import java.util.Scanner;

public class homeat66 {

	public static void main(String[] args) {
	
		
		String country, language;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Where are you from?");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Italy":
			language="itallian";
		    break;
		case "Agentina":
			language="spanish";
			break;
		case "France":
			language="french";
			break;
		case "russia":
			language="russian";
			break;
		default:
			language="turkish";
			break;
			
		}
			System.out.println("your language is "+language);
			
			System.out.println("*******************");
			
			char grade;
			String explanation;
			System.out.println("What is your grade");
			grade=scan.next().charAt(0);
			
			switch(grade) {
			
			case 'A':
				explanation="Excellent";
				break;
			case 'B':
				explanation="Good";
				break;
			case 'C':
				explanation="Average";
				break;
			case 'D':
				explanation="Bad";
				break;
			default:
				explanation="Not acceptable";
				break;
				
			}
			
			
			System.out.println(explanation);
			
			
			System.out.println("+++++++++++++++++");
			
			
			int num1, num2;
			System.out.println("enter num1");
			num1=scan.nextInt();
			System.out.println("enter num2");
			num2=scan.nextInt();
			
			System.out.println(num1+num2);
			
			System.out.println(num1*num2);
			
			System.out.println(num1-num2);
			
			System.out.println((num1/num2)*num2+num1);
			
			
	}	
}
