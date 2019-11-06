package com.class12;

public class StringMiniPulationDemo2 {

	public static void main(String[] args) {
		
//		int a=2;
//		if(a==20) {
//			System.out.println("Number is "+a);
//		}else {
//			System.err.println("Number is not 20 but is "+a);
//		}
		
		String sentence="It was raining";
		String sen="raining";
		System.out.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("w"));
		
		// Create two Strings and initaialize them with some value.
        //implement the following methods on those strings.
        
        /*
         * sen.length();
         * sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
		
		System.out.println("******************");
		
		
		String str2= "It is very hot in the class";
        System.out.println("Is this string starts with " + str2.startsWith("It"));
        //System.out.println("Is this string starts with " + str2.startsWith("is", 3));
    System.out.println("_______________________");
        //This method tests if this string ends with the specified suffix
        System.out.println("Is this string starts with = " + str2.endsWith("class"));

	}

}
