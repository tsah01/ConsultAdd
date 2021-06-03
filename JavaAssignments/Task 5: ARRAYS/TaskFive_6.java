package Task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Task: Write a program to remove the duplicates from a sorted array change 
 *          them into 0 and add 0 in the end.  
 *       eg:   input: [2,2,3,3,4,4,4,11,11,11,11] 
 *             output:[2,3,4,11,0,0,0,0,0,0,0]         
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_6.java
 * Compile: javac TaskFive_6.java
 * Run: java TaskFive_6
 */

public class TaskFive_6 {

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
        //printing an array
        System.out.println("Your array is : " + Arrays.toString(number));

        // using hash set to remove a duplicate elements from the array
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < size; i++) {
            set.add(number[i]);//adding all unique eleements of created array into set
        }
        //printing hashSet

        System.out.println("Your hashSet is : " + set);

        int[] outputArray = new int[size];
        //converting set into an array
        int i = 0;
        for (Integer num : set) {
            outputArray[i++] = num;
        }
        System.out.println("Your outputArray is : " + Arrays.toString(outputArray));

        /*
            //finding the number of duplicate elements; numOfZero = size - set.length
            int numOfZeroToBePlaced = size- outputArray.length;
            //now placing all zero at the end of array
            while (numOfZeroToBePlaced < size) {
                outputArray[numOfZeroToBePlaced++] = 0;
            }
             // printing the zeroAtTheEndArray
            System.out.println("Final outputArray is : " + Arrays.toString(outputArray));
        
         */
    }

}
