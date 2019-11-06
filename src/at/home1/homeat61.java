package at.home1;

import java.util.Scanner;

public class homeat61 {

	public static void main(String[] args) {
		
		
		String word1, word2;
		int int1, int2;
		
	 Scanner input=new Scanner(System.in);
	 System.out.println("Please enter two strings");
	 word1=input.nextLine();
	 word2=input.nextLine();
	 
	 
	 
	
	 System.out.println("Please enter two numbers");
	 int1=input.nextInt();
	 int2=input.nextInt();
	 
	 if((word1.equals(word2)) && int1==int2) {
		 System.out.println("AND");
	 } 
	 
	 
	 else if(!word1.equals("word2") && (int1==int2)) {
			System.out.println("OR");
			
		}else if(!((word1.equals("word2"))) && !(int1==int2)) {
			System.out.println("NONE");
			
		}
	 
	 else {
			System.out.println("Invalid");
		}
	 
	 
	
	 
		
		
		
	}
	

	
	
}
