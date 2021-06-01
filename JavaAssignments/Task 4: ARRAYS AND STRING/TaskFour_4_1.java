package task4;

import java.util.Scanner;
import static task4.TaskFour_4.isogram;

/**
 * Task: Write a JAVA program that reverse the words of a sentence. 
 *     For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”.    
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 28th May, 2021
 * File name: TaskFour_4_1.java
 * Compile: javac TaskFour_4_1.java
 * Run: java TaskFour_4_1
 */

public class TaskFour_4_1 {

    public static String reverseWords(String input) {
        StringBuilder sb = new StringBuilder();
        /* first we split the input into string array*/
        String[] inputArray = input.split(" ");
        String reversedInput;
        for (int i = 0; i < inputArray.length; i++) {
            /*reversing each word from the array*/
            reversedInput = new StringBuilder(inputArray[i]).reverse().toString();
            /* joining each reversed words with space*/
            sb.append(reversedInput + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String userInput = scan.nextLine();

        //calling a method
        System.out.println(reverseWords(userInput));

    }

}
