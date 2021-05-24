package ExtraAssignments;

import java.util.Scanner;


/**
 * TASK: Reverse a string using swapping/other methods
 * This file is an implementation of above task.
 * @author Tula Sah
 * File name: Task1.java
 * Date: 24th May, 2021
 * Compile: javac Task1.java
 * Run: java Task1
 */

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your String to reverse: ");
        String input = scan.nextLine();

        byte[] byteArr = input.getBytes(); //convering the String input into the bytes of array
        int len = byteArr.length;
        System.out.println("The lentgth of the input string is: " + len);
        byte[] newArr = new byte[len]; //creating a new array of size 'byteArr'

        for (int i = 0; i < len; i++) {
            newArr[i] = byteArr[len - i - 1];//assigning the last character of byteArr 
            //into the first index of the newArr  
        }
        String reversedStr = new String(newArr);
        System.out.print("The reversed String of \"" + input + "\" is: " + reversedStr); // printing the Reverse String
    }

}
