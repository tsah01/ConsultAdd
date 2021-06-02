
package Task5;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Task: Write a Java program to find the second smallest element in an array.         
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_3.java
 * Compile: javac TaskFive_3.java
 * Run: java TaskFive_3
 */ 

public class TaskFive_3 {
    
     public static int second_smallest_element(int[] a) {
        Arrays.sort(a);
        System.out.println("Sorted an array in ascending order: " + Arrays.toString(a));
        int secondSmallestNum = a[1];
        return secondSmallestNum;
    }

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter your number to create an array: ");

        //store user inputinto the array
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {

            numberArray[i] = scan.nextInt();

        }
        System.out.println("Your array is : " + Arrays.toString(numberArray));
        // now calling the method
        int output = second_smallest_element(numberArray);
        System.out.println("The second smallest element in the array is: " + output);

    }
    
}
