package com.class13;

public class StringManipulation1 {

	public static void main(String[] args) {
//		Create a String and print it in reverse order (Sunday --> yadnuS).
		
//		Create a String and if the String is not empty perform the following:
//		if the String has an odd number of characters and has 3 or more characters,
//		print the character in the middle of the String.
		
       
       String s="Sunday";
       for(int i=s.length()-1 ; i>=0 ; i--) {
       System.out.print(s.charAt(i));}
       System.out.println();
       
       System.out.println("////////////////");
       
       String a= "ahmet";
       
       if(!a.isEmpty()) {
    	   if(a.length()%2==1 && a.length()>3) {
    		   System.out.println(a.charAt(a.length()/2));
    	   }
       }
       //substring
       //This method returns a new string that is a substring of this string.
       String str="Java is getting interesting";
       System.out.println(str.substring(10));
       /*
        *  * String substring(int beginIndex, int endIndex) 
        *  * This method returns a new string that is a substring  
        *  * that begins with the character at the specified index  
       * and extends to the end of this string
       *   */
       System.out.println(str.substring(8, 15));
       
     
       
	}
}
