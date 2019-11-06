package com.class11;

public class task1 {

	public static void main(String[] args) {
		
	// 1	
//		String[] cars= {"BMW", "Audi", "tesla", "sonata", "at"};
//		
//		for(int i=0; i<cars.length; i++) {
//			System.out.println(cars[i]);
//		}
//		
//		System.out.println("****************");
//		
//		for(String element:cars) {
//			System.out.println(element);
//		}
	
		
		
//2
//		int[] num= {2, 5, 6, 8};
//		int sum=0;
//		for(int i=0; i<num.length; i++) {
//			sum=sum+num[i];
//			
//		}
//		System.out.println(sum);
//		
		
//		
//		int sum=0;
//		for(int element:num) {		
//			sum=sum+element;		
//		}
//		System.out.println(sum);
		
		//3
		
//		String[] countries= {"usa", "germany", "france"};
//		
//		for(int i=0; i<countries.length; i++) {
//			}
		
		
		String[] countries= {"usa", "germany", "france"};
		for(String s:countries) {
			switch(s) {
			case "usa":
				System.out.println("Dallas");
				break;
			case "germany":
				System.out.println("berlin");
				break;
			case "france":
				System.out.println("paris");
				break;
			}
				System.out.println();	
		}
		
	}

}
