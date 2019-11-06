package at.home1;

import java.util.Scanner;

public class homeat65 {

	public static void main(String[] args) {
		
		String carOrigin, car;
		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        car=scan.nextLine();
        
        switch(car) {
        
        case "BMW":
        	carOrigin="german car";
        	break;
         case "Toyota": 
        	carOrigin="japanese car";
        	break;
         case "Maseratti":
        	carOrigin="italian car";
        default:
        	carOrigin="unknown";
        }

   System.out.println("Your favorite car is "+carOrigin);
   
   
   }



	}


