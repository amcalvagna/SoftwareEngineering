// Reading user input with Scanner

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    // Create a new Scanner --  System.in is the standard input
    Scanner input = new Scanner(System.in);

    // Read a String using the nextLine method
    System.out.println("What is your name?"); //print
    String name = input.nextLine();

    System.out.print("What is your age?");  //println
    int age = input.nextInt();

    // Print a message using the name
    System.out.printf("Hello, " + name + ".\n"); //printf
    System.out.printf("Your age is %s.\n", age%2==0 ? "even" : "odd"); 

    input.close();
  }
}
