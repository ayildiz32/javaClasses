package com.class6;

public class recap {

	public static void main(String[] args) {
		
		int time=10;
		String timeOfDay;
		
		if (time>=1 && time<=11) {
			timeOfDay="Morning";
			
		}else if(time>=12 && time<=15) {
			timeOfDay="noon";
			
		}else if(time>=16 && time<=20) {
			timeOfDay="evening";
			
		}else if(time>20 && time<=24) {
			timeOfDay="night";
			
		}else {
			timeOfDay="invalid";
		}
		System.out.println(timeOfDay);
			
		if(timeOfDay.equals("morning")) {

		}

	}

}
