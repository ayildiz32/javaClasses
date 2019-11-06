package com.class2;

public class VariableDeclaration {
	public static void main(String[] args) {
		
		//declaring variable num1 that will hold value of int and
		// assigning value of 123 to it
		int num1=123;
		int num2=6767;
		int num3=325155;
		char num4='A';
		
		// 2. declare veriable first and then assign value
		int n1;
		int n2;
		int n3;
		n1=56;
		n2=7676;
		n3=767;
		
		// 3. declare all variable together and then assign value
		int number1, number2, number3;
		number1=12;
		number2=15;
		number3=676;
		
		System.out.println(n1); 
		System.out.println(num2);
		System.out.println(number3);
		
		num1=222;
		System.out.println(num1);
		
		boolean var=true;
		System.out.println(var);
		
		char myVariable;
		myVariable='$';
		System.out.println(myVariable);
		
		number2=number1;
		System.out.println(number2);
		// number2=false;-->compile time error asking to change datatype of
		// variable number2 to boolean
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;
		System.out.println(isSnow);
		
		
	}

}
