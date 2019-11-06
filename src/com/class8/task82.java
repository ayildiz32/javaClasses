package com.class8;

public class task82 {

	public static void main(String[] args) {
		/*write a code to find the some of even& odd numbers
		 * from range 1 to 20
		 * expectation 2 outputs
		 * sum for odd nums=..
		 * sum for even nums=..
		 * 
		 */
//int sum=0;
//		for(int a=1; a<=20; a++) {
//			if (a%2==0) 
//				sum=sum+a;
//		}
//			
//			System.out.println(sum);
//		
		
		
//		sum=0;
//		for(int a=1; a<=20; a++) {
//			if (a%2==1) {
//				sum=sum+a;
//			}
//			}
//			System.out.println(sum);
			
			
			int sumEven=0;
			int sumOdd=0;
			
			for (int i=1; i<=20; i++) {
				if(i%2==0) {
					sumEven=sumEven+i;
				}else {
					sumOdd=sumOdd+i;
				}
			}
		System.out.println("The total of all even#="+sumEven);
		System.out.println("The total of all odd#="+sumOdd);
	}

}
