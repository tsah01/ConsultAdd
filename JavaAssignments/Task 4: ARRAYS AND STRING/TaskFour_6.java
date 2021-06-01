package task4;

import java.util.Scanner;

/**
 * Task: Write a JAVA program that swaps the case of the alphabets of the string,  
 *         For eg,  => “heLLo WOrLd” => “HEllO woRlD”.     
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 28th May, 2021
 * File name: TaskFour_6.java
 * Compile: javac TaskFour_6.java
 * Run: java TaskFour_6
 */

public class TaskFour_6 {

    public static String swapsCaseOfAlphabets(String input) {
        StringBuilder sb = new StringBuilder();
        /* first we split the input into string array*/
        String[] inputArray = input.split(" ");

        for (String word : inputArray) {
            char[] letters = word.toCharArray();// letterd[a,b,c,s,..]
            for (int i = 0; i < letters.length; i++) {
                if (Character.isUpperCase(letters[i])) {
                    letters[i] = Character.toLowerCase(letters[i]);
                    //sb.append(letters[i]);
                } else if (Character.isLowerCase(letters[i])) {
                    letters[i] = Character.toUpperCase(letters[i]);
                    //sb.append(letters[i]);
                }
                sb.append(letters[i]);
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String userInput = scan.nextLine();
        //calling a method
        System.out.println(swapsCaseOfAlphabets(userInput));

    }

}
