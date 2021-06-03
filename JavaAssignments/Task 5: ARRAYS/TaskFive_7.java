
package Task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Task: Write a Java program to get the difference between the largest and 
 *          smallest values in an array of integers. 
 *          The length of the array must be 1 and above.             
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_7.java
 * Compile: javac TaskFive_7.java
 * Run: java TaskFive_7
 */

public class TaskFive_7 {

    public static int differece(int[] a) {
        Arrays.sort(a);
        int diff;
        int smallest = a[0];
        int largest = a[a.length - 1];
        diff = largest - smallest;
        return diff;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creating an arrray
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        //The length of the array must be 1 and above.
        if (size < 1) {
            System.out.println(" The size of the array must be 1 and above ");
        } else {
            System.out.println("Enter your number to create an array: ");

            //store user inputinto the array
            int[] number = new int[size];
            for (int i = 0; i < size; i++) {

                number[i] = scan.nextInt();

            }
            System.out.println("Your array is : " + Arrays.toString(number));

            //finding the difference between the largest and smallest values in an array of integers
            System.out.println("The difference between the largest and smallest values is: " + differece(number));
        }

    }

}
