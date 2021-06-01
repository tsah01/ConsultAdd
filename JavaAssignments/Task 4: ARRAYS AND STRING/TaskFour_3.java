package task4;

import java.util.Scanner;

/**
 * Task: Write a JAVA method to remove all the spaces from the String and 
 *          return the resultant.         
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 28th May, 2021
 * File name: TaskFour_3.java
 * Compile: javac TaskFour_3.java
 * Run: java TaskFour_3
 */

public class TaskFour_3 {

    /* creating a method*/
    public static String removeSpaces(String input) {
        String newInput;
        newInput = input.replaceAll(" ", "");
        // OR newInput = input.replaceAll("\\S", "");WHERE \\S MEANING A SPACE IN UNICODE
        return newInput;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your input to remove all spaces: ");
        String userInput = scan.nextLine();

        /* calling a  method*/
        String inputWithoutSpaces = removeSpaces(userInput);
        System.out.print("String after removing all spaces is:  " + inputWithoutSpaces);
    }

}
