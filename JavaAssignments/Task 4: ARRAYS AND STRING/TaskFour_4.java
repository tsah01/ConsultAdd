package task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Task: Write a JAVA method to return a boolean true if the string doesn’t have
 *          repeating letters and consecutive or nonconsecutive i.e. all the 
 *          letters of the string be unique (isogram) else false.  
 * ISOGRAM: AN ISOGRAM IS A WORD IN WHICH NO LETTER OCCURS MORE THAN ONCE.
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 28th May, 2021
 * File name: TaskFour_4.java
 * Compile: javac TaskFour_4.java
 * Run: java TaskFour_4
 */

public class TaskFour_4 {

    /* creating a method for ISOGRAM */
    public static boolean isogram(String input) {
        /*Convert the string into lower case*/
        String lowerCaseInput = input.toLowerCase();
        /* convert the input into array so that we can sort them*/
        char[] inputArray = new char[lowerCaseInput.length()];
        inputArray = lowerCaseInput.toCharArray();
        /* then sort the string so that all will be in ascending order*/
        Arrays.sort(inputArray);

        /* now check if there are any repeating letters in the string */
        for (int i = 0; i < inputArray.length - 1; i++) {
            /* if  two letters matched then return false otherwise return true*/
            if (inputArray[i] == inputArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String userInput = scan.next();

        //calling a method
        System.out.println(isogram(userInput));

    }

}
