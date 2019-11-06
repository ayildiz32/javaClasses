package com.class11;

public class task2 {

	public static void main(String[] args) {
		// create 2D array of String with 2 and 3 columns
		
		String[][] array=new String[2][3];
		
//		//1st row
//		array[0][0]="ahmet";
//		array[0][1]="mehmet";
//		array[0][2]="john";
//		
//		//2nd row
//		array[1][0]="may";
//		array[1][1]="april";
//		array[1][2]="jun";
//		
//		System.out.println(array[0][2]);
//		
//		System.out.println("////////////");
		
//		int[][] numbers= {
//				{8,7,5,3,8},
//				{1,5,6,4,9},
//				{3,6,8,0,7},
//		};
//		System.out.println(numbers[1][4]);
//		
//		//////////////////////////
//		
//		// to identify the numbers of row
//		System.out.println("The numbers of rows are :="+numbers.length);
//		
//		//to identify the numbers of columns
//		System.out.println("The numbers of columns are :="+numbers[1].length);
//		
//		System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
//		
//		for(int i=0; i<numbers.length; i++) {
//			for(int j=0; j<numbers[2].length; j++) {
//				System.out.print(numbers[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
		
		///////////////////////
		
		int[][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7},
		};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[1].length; j++) {
				System.out.print(numbers[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
