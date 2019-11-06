package com.class7;

public class Task {

	public static void main(String[] args) {
		
		boolean workDay=true;
        int day=1;
        
while(workDay) {
	
	System.out.println("I need a day off");

	if(day==6) {
		
		System.out.println("I do not need a day of anymore");
		workDay=false;
	}
	day++;
}

//boolean workDay=true;
//int day=1;
//   while(workDay) {
//	   if(day==6 || day==7) {
//		
//		System.out.println("I do not need a day of anymore");
//		workDay=false;
//	   }else {
//	System.out.println("I need a day off");
//}
//	day++;
//	}
  }
}
