package Task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task: Write a Java program to move all 0's to the end of an array. 
 *          Maintain the relative order of the other (non-zero) array elements.         
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_5.java
 * Compile: javac TaskFive_5.java
 * Run: java TaskFive_5
 */

public class TaskFive_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creating an arrray
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter your number to create an array: ");

        //store user inputinto the array
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {

            number[i] = scan.nextInt();

        }
        System.out.println("Your array is : " + Arrays.toString(number));

        int count = 0;
        int[] zeroAtTheEndArray = new int[size];

        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) { //checking each elements of the array if that zero or not
                zeroAtTheEndArray[count++] = number[i];

            }
        }
        //now placing all zero at the end of array
        while (count < size) {
            zeroAtTheEndArray[count++] = 0;
        }

        // printing the zeroAtTheEndArray
        System.out.println("Temporary array is : " + Arrays.toString(zeroAtTheEndArray));
    }

}
