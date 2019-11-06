package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		/*check age, if age is less than 16-->you are to young to drive
		 * otherwise--.you are eligible to drive& we will check 
		 * if you are older than 18
		 * you can get drive licence and if not you can get drive permit
		 *  
		 */
      int age=18;
      if (age<16) {
    	  System.out.println("you are to young to drive");
      }else {
    	  System.out.println("you are eligible to drive");
    	  if (age>=18) {
    		  System.out.println("you can drive alone");
    	  }else {
    		  System.out.println("you need your parent to drive");
    		  
    	  }
      }
    		 /*we need to check if student completed the quiz
    		  * if yes-->good job, if not-->not good
    		  *  if they completed we will check score
    		  *  if more than 90-->you got an AA
    		  *  if more than 80-->you got a B
    		  *  anything below-->you should study more
    		  */
      
      boolean quiz=true;
      int score=79;
      
      if (quiz) {
          System.out.println("Good job!");
          
          if (score>=90) {
              System.out.println("You got an A");
          }else if (score>=80) {
              System.out.println("You got a B");
          }
      } else {
          System.out.println("That is not good");
      }
	}
}
