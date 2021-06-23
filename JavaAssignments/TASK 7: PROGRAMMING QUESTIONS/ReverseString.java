package Task7;

import java.util.Scanner;

/**
 * Task:Program to reverse a string in java 
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: ReverseString.java
 * Compile: javac ReverseString.java
 * Run: java ReverseString
 */

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        //String input = scan.nextLine();
        StringBuilder input = new StringBuilder(scan.nextLine());
        
        /*
        String reversedInput = input.reverse().toString();
        System.out.println("Reversed String is " + reversedInput);
        
        */
        System.out.print("Reversed string is: ");
        for(int i =input.length()-1; i>=0; i--){
          System.out.print(input.charAt(i) + " ");  
            
        }

    }

}
