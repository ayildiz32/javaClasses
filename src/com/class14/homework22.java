package com.class14;

public class homework22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,3,7,5,8};
		int max=0;
        int secondMax=0;

        for (int i = 0; i < arr.length; i++) {      	 
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
 
			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
        System.out.println(secondMax);
	}
}
