
package Task7;

import java.util.Scanner;
/**
 * Task:Program to Count the number of words in the String?  
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: CountWords.java
 * Compile: javac CountWords.java
 * Run: java CountWords
 */

public class CountWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        System.out.println("The given string is: " + input);

        String[] words = input.split("\\s"); //split an input with space
        int wordConut = words.length;
        System.out.println("The given string has: " + wordConut + " words");
    }

}
