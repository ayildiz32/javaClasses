package at.home1;

import java.util.Scanner;

public class homework51 {

	public static void main(String[] args) {
		
		Scanner scan;
		
		double quiz; 
		double midterm;
        double finalScore;
       
        
        
        scan=new Scanner(System.in);
        System.out.println("Please Enter Your quiz");
        quiz=scan.nextDouble();
        
        
        System.out.println("Please Enter Your Midterm");
        midterm=scan.nextDouble();
        
        
        System.out.println("Please Enter Your FinalScore");
        finalScore=scan.nextDouble();
        
        
        double average=((quiz+midterm+finalScore)/3);
        
        
        
        if (average>=90 && average<=100) {
        	System.out.println("your grade is A");
        	
        }else if(average>=70 && average<90) {
        	System.out.println("your grade is B");
        	
        }else if(average>=50 && average<70) {
        	System.out.println("your grade is C");
        	
        }else if(average<50) {
        	System.out.println("your grade is F");
        	
        }else {
        	System.out.println("Invalid grade");
        }
        
        
         System.out.println("*********************");
         
         
        boolean noRain=true;
        
        
        System.out.println("Class mode");
        noRain=scan.nextBoolean();
        
        
        if (noRain) {
        	System.out.println("In Class");
        }else {
        	System.out.println("Online");
        }
        
	}

}
