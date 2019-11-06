package com.class3;

public class RealationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=20;
int num2=19;

System.out.println(num1>num2);
System.out.println(num1<num2);		
System.out.println("*********");
     
double d=1.99;
double d1=2.99;
 boolean b=d>d1;
 System.out.println(b);
 
 boolean b1=d<d1;
 boolean b2=d==d1;
 boolean b3=d!=d1;
 System.out.println(b1);
 System.out.println(b2);
System.out.println(b3);
System.out.println("###########");

int a=40;
int c=30;

if (a>c) {
System.out.println("a is larger than c");

}
else {
	System.out.println("a is smaller than c");
}

    int expectedHours=15;
    int actualHours=20;
    if(actualHours>expectedHours) {
    	System.out.println("you will succeed");
    } else {
    	System.out.println("please study more"); }
    
    double teaPrice=4.99;
    double allowedPrice=3.99;
    if(allowedPrice<=teaPrice) {
    	System.out.println("I will buy tea");
    	System.out.println("and I will enjoy my tea");
    } else {
    	System.out.println("I cannot afford, I need to study more");
    	System.out.println("I will go back to study more");
    }
        System.out.println("I keep writing some code");
        System.out.println("I keep writing more code");
        
        boolean val=false;
         if(val) { // if value ==true
        	 System.out.println("hello");
         } else {
        	 System.out.println("bye");
         }
         
         boolean isRain=true;
         
          if(isRain) {
        	  System.out.println("I will take umbrella");
          } else {
        	  System.out.println("I for a walk");
          }
    }
	

	

}
