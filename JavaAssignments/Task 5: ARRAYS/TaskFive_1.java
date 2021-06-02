package Task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * Task: Write a Java program to remove duplicate elements from an array.       
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_1.java
 * Compile: javac TaskFive_1.java
 * Run: java TaskFive_1
 */

public class TaskFive_1 {

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
        System.out.println("your array is : " + Arrays.toString(number));

        //now to removing a duplicate elements from the array using a set
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < number.length; i++) {
            set.add(number[i]); // adding all elements of the the arry into the set
        }
        System.out.println("Array after removing all duplicates elements: " + set);
        // printing the user entered hashset
        //System.out.println(set);
    }

}
