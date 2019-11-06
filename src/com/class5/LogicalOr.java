package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
		int day=3;
		if(day==2 || day==4) {
			System.out.println("SDLS CLASS");
		}else if(day==6 || day==7){
			System.out.println("Java class");
		}else if(day==1 || day==5) {
			System.out.println("No class");
		}else if(day==3) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}
		
		

		System.out.println("#################");
		
		
		
		
		String weekDay="cuma";
		
				if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
					System.out.println("SDLC Class");
					
				}else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
					System.out.println("Java Class");
					
				}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
					System.out.println("No class");
					
				}else if(weekDay.equals("Wednesday")) {
					System.out.println("Review Class");
					
				}else {
					System.out.println("Not a valid day");
				}
	}

}
