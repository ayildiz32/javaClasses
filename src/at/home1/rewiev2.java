package at.home1;

import java.util.Scanner;

public class rewiev2 {
	public static void main(String[] args) {
		
		String[] days=new String[6];
		   
		   Scanner scan=new Scanner(System.in);
		for(int a=0; a<=days.length; a++) {
			System.out.println("Please enter day "+(a+1)+" of the week");
			days[a]=scan.nextLine();
		}
	
    }
}

