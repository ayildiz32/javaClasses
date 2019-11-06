package com.class10;

public class task102 {

	public static void main(String[] args) {
		String[] countries= {"turkey", "russia", "spain", "germany"};
		
		for(int a=0; a<countries.length; a++) {
			if(countries[a].equals("spain")) {
				System.out.println("madrid");
			}else if(countries[a].equals("russia")) {
				System.out.println("moscow");
		    }else if(countries[a].equals("turkey")) {
			    System.out.println("Isparta");
	        }else  {
		        System.out.println("berlin");
}
		}
	}

}
