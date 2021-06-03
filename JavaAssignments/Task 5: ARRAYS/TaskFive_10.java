
package Task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task: Write a Java program to find the two elements from a given array of 
 *      positive and negative numbers such that their sum is closest to zero.  
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_10.java
 * Compile: javac TaskFive_10.java
 * Run: java TaskFive_10
 */

public class TaskFive_10 {

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

    static void getpairs(int inputarr[]) {  //5
        System.out.println("Matrix of elements whose sum is closest to zero are ");

        int[] diff = new int[inputarr.length];
        for (int i = 0; i < inputarr.length; i++) {  //0 1 2 3 4
            for (int j = i + 1; j < inputarr.length; j++) {// 1 2 3 4
                //int[][] diff = new int[inputarr.length][inputarr.length];
                if (inputarr[i] - inputarr[j] <= 0) {
                    diff[i] = inputarr[i] - inputarr[j];
                    System.out.println(inputarr[i] + "," + inputarr[j]);
                }

            }
        }
        Arrays.sort(diff);
        System.out.println("Pairs of elements whose sum is closest to zero are "
                + diff[0] + " and " + diff[1]);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creating an arrray
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int[] inputArray = createArray(size);

        // calling a method
        getpairs(inputArray);
    }

}
