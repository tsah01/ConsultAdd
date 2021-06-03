
package Task5;

import java.util.Scanner;


/**
 * Task: Write a Java program to find the sum of the two elements of a given 
 *      array which is equal to a given integer.   
 *        example   Sample array: [1,2,4,5,6] 
                    Target value: 6.
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_9.java
 * Compile: javac TaskFive_9.java
 * Run: java TaskFive_9
 */

public class TaskFive_9 {

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

    static void getpairs(int inputarr[], int inputnum) {  //5
        System.out.println("Pairs of elements whose sum is " + inputnum + " are");

        for (int i = 0; i < inputarr.length; i++) {  //0 1 2 3 4
            for (int j = i + 1; j < inputarr.length; j++) {// 1 2 3 4
                if (inputarr[i] + inputarr[j] == inputnum) {
                    System.out.println(inputarr[i] + "," + inputarr[j]);
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creating an arrray
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int[] inputArray = createArray(size);
        System.out.print("Enter the Target value: ");
        int num = scan.nextInt();
        // calling a method
        getpairs(inputArray, num);

    }

}
