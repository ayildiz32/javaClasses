package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		System.out.println("//////////////");
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		/*    .equals : compares the values (are both of them have the same sequence of char? )
		 *    .equals  :content comparison method
         *    ==   : compares the objects   (are these same objects? )
         *    == :address comperison operator
         *
         */
		System.out.println("==============");
        System.out.println(str1.contains("zz"));
        
        System.out.println("=======StartsWith and EndsWith=======");
        String str5="Today is Saturday";
        System.out.println(str5.startsWith("Today"));
        System.out.println(str5.endsWith("day"));
        
        System.out.println("=======Concat=======");
        System.out.println(str5.concat(" and we have java class"));
         
        
        System.out.println("=======trime=======");
        String str6="    It is sunny    ";
        System.out.println("Before triming: "+str6);
        System.out.println(str6.trim());
        
        System.out.println("=======Index OF and CharAt=======");
        String str7="Tomorrow we will be done with String Manipulation";
        
        System.out.println(str7.indexOf('e'));
        System.out.println(str7.indexOf('e', 11));
        System.out.println(str7.indexOf("we"));
        
        System.out.println(str7.charAt(10));
        
        
        
        
        
   

        
        String city="Fairfax";
        //String city1=�FAirfax�;
//        System.out.println(city.isEmpty());
//        System.out.println(city.length());
        
        int [] a= {12,32,55,77};
        System.out.println(a.length);
        System.out.println(city);
        String city2=city.toUpperCase();
        System.out.println(city2);
	}
}