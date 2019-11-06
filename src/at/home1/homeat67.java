package at.home1;

import java.util.Scanner;

public class homeat67 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int number;
		
		number=scan.nextInt();
		
		    if(number%2==0) {
		System.out.println("Valueis even");
		     if(number>100) {
		    	 System.out.println("Value is too large");
		     }
		     
		     else{
		    	 System.out.println("Value is just right");
		     }
		    }else {
		    	if(number<100) {
		    		System.out.println("Value is just right and is an odd number");
		    	}else {
		    		System.out.println("This is an odd number and value is too high");
		    	}
		    }
			  
	
	}
}
