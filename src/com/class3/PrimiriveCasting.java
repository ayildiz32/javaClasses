package com.class3;

public class PrimiriveCasting {
	public static void main(String[] args) {
		
		double d=12;
		System.out.println(d);
		
		// int=12.0; compile time error
		//widening or automatic casting
		
		byte b=127;
		int i=b;
		System.out.println(i);
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		// narrowing or explicit or manuel casting
		
		double d2=125.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=257;
		byte b1=(byte)num3;
		System.out.println(b1);
	}

}
