package at.home1;

import java.util.Scanner;

public class homeat3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println();
		int num=scan.nextInt();
		int[] array=new int[5];
	
		int s=0;
		for(int i=1; i<5; i++) {
			
			s=i*10;
			System.out.println(s);
		}
	}
}