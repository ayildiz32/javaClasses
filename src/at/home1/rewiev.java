package at.home1;

import java.util.Scanner;
public class rewiev {
  public static void main(String[] args) {
  
  Scanner keyboard=new Scanner(System.in);
  System.out.println("Please Enter First Name");
  String name=keyboard.nextLine();
  
  Scanner key=new Scanner(System.in);
  System.out.println("Please Enter Surname");
  String surname=key.nextLine();
  
  System.out.println(name+" " +surname);
}
  }