package Task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task: Write a Java program to find the second largest element in an array.        
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_2.java
 * Compile: javac TaskFive_2.java
 * Run: java TaskFive_2
 */

public class TaskFive_2 {

    public static int second_largest_element(int[] a) {
        Arrays.sort(a);
        System.out.println("Sorted an array in ascending order: " + Arrays.toString(a));
        int secondLargestNum = a[a.length - 2];
        return secondLargestNum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter your number to create an array: ");

        //store user inputinto the array
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {

            number[i] = scan.nextInt();

        }
        System.out.println("Your array is : " + Arrays.toString(number));
        // now calling the method
        int output = second_largest_element(number);
        System.out.println("The second largest element in the array is: " + output);

    }

}
