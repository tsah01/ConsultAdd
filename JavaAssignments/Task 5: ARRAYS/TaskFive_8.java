
package Task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Task: Write a Java program to remove the duplicate elements of a given array 
 *      and return the new length of the array.             
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_8.java
 * Compile: javac TaskFive_8.java
 * Run: java TaskFive_8
 */

public class TaskFive_8 {

    public static int[] createArray(int size) {

        Scanner scan = new Scanner(System.in);
        int[] number = new int[size];
        //The length of the array must be 1 and above.
        if (size < 1) {
            System.out.println(" Enter the Correct size (The size of the array must be 1 and above). ");
        } else {
            System.out.println("Enter your number to create an array: ");

            //store user inputinto the array
            for (int i = 0; i < size; i++) {

                number[i] = scan.nextInt();

            }

        }
        return number;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creating an arrray
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int[] inputArray = createArray(size);

        // using hash set to remove a duplicate elements from the array
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < size; i++) {
            set.add(inputArray[i]);//adding all unique eleements of created array into set
        }

        System.out.println("The unique  Array is : " + set);
        System.out.println("The length of new array is : " + set.size());
    }

}
