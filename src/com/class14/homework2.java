package com.class14;

public class homework2 {

	public static void main(String[] args) {
		
		// Maximum and minimum number in the array?
		// Write a java program to find the second largest number in the array?
		
		
		int[] array= {4,2,3,7,5,8};
		int max=0;     
        for (int i = 1; i < array.length; i++){  
              if(array[i]>max){
                max=array[i];           
              }
            }
        System.out.println(max);
        
        int[] array1= {4,2,3,7,5,8};
        int min=array1[0];
        for (int i = 0 ; i <array1.length ; i++){          
            if(array1[i]<min){
              min=array1[i];  
              
            }        
          }
        System.out.println(min);
        
        System.out.println("**************");
        
        int[] arr= {4,2,3,7,5,8};
        int secondMax=0;
        int max1=0;
        for (int i = 0; i < arr.length; i++) {      	 
			if (arr[i] > max1) {
				secondMax = max1;
				max1 = arr[i];
 
			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
        System.out.println(secondMax);
      
        }         
	}


