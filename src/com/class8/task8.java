package com.class8;

public class task8 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
			
		}
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}

		for(int a=20; a>=1; a--) {
			
			if(a%2==0) {
				System.out.println(a);
			}
			
		}
		for(int c=21; c<=50; c+=2) {
			if(c%2==1) {
				System.out.println(c);
			}
		}
		
//		for(int b=20; b<=50; b++) {
//			if(b%2==1) {
//	System.out.println(b);			
//			}
	//	}
		
		System.out.println("************");
		
		System.out.println("*********************");
		// what is the output
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
			System.out.print(sum+ "+");
		}
		System.out.println();
		System.out.println(sum);
		//
		
		System.out.println("*********************");
		// what is the output
		int sumAll=0;
		
		for (int i=0; i<=20; i+=5) {//0, 5, 15, 20
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		System.out.println("*********************");
		// what is the output
		int total=2;
		
		for (int y=1; y<=3; y++) {
			total=total*y;//2=2*1; 4=2*2; 12=4*3
		}
		System.out.println(total);
		
	}

		
	

}
