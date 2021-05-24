package ExtraAssignments;

import java.util.Scanner;

/**
 * TASK: Convert the odd index value of string to uppercase. 
 *      ex: String s = "consultadd", output: COnSuLtAdD 
 * This file is an implementation of above task.
 * @author Tula Sah
 * File name: Task2.java
 * Date: 24th May, 2021
 * Compile: javac Task2.java
 * Run: java Task2
 */

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String input = scan.nextLine();

        char[] inputArry = new char[input.length()]; //ocnverting string into the arry 
        for (int i = 0; i < input.length(); i++) {
            inputArry[i] = input.charAt(i);
        }

        char[] newArry = new char[inputArry.length]; //creating a new arry of input size d

        for (int i = 0; i < inputArry.length; i++) {
            if (i % 2 != 0) { //check if it is an odd index
                newArry[i] = Character.toUpperCase(inputArry[i]);//converting into uppercase letter
            } else {
                newArry[i] = inputArry[i];
            }
        }
        // print the newArry
        for (int i = 0; i < newArry.length; i++) {
            System.out.print(newArry[i]);
        }

    }

}
