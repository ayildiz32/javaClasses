package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		
		String[] animals= {"cat", "dog", "at", "snake", "cow"};
		
		for(int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("dog")) {
			    System.out.println("I love dogs");
			}else {
			    System.out.println(animals[i]);
			}
		}
	}
}
