package com.class4;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=23;
		num=89;
		num-=200;
		num-=110;
		num+=220;
		
		if (num>0) {
			System.out.println(num+" is a positive number");
		}else if(num==0){
			System.out.println("Value of number is " + num);
		} else {
			System.out.println(num+ " is a negative number ");
		}
		
		int i=134;
		
		if (i%2!=0) {
			System.out.println(i + " is a even number ");
		} else {
			System.out.println(i+ " is a odd number ");
		}

	}

}
