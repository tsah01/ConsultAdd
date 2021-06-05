package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Task: Write a Java program to sort an array of positive integers of a given 
 *          array, in the sorted array the value of the first element should be
 *          maximum, second value should be minimum value, third should be 
 *          second maximum, fourth second be second minimum and so on.  
  
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_11.java
 * Compile: javac TaskFive_11.java
 * Run: java TaskFive_11
 */

public class TaskFive_11 {

    public static Integer[] createArray(int size) {

        Scanner scan = new Scanner(System.in);
        Integer[] number = new Integer[size];
        //The length of the array must be 1 and above.
        if (size < 1) {
            System.out.println(" Enter the Correct size (The size of the array must be 1 and above). ");
        } else {
            System.out.println("Enter the elememts of an array size " + size + " : ");

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
        Integer size = scan.nextInt();

        Integer[] inputArray1 = createArray(size);
        Arrays.sort(inputArray1);// sorting in a ascending order
        
        List<String> list = new ArrayList<String>();

        //now printing the elements in a (maximum, minimum,second maximum, second minimum,....)order
        System.out.println("The output Array is: ");
        if (size % 2 == 0) {
            for (int i = 0; i < size / 2; i++) {
                list.add( inputArray1[size - 1 - i] + " , " + inputArray1[i] );
            }
        } else {
            for (int i = 0; i < (size / 2 + 1); i++) {
                list.add( inputArray1[size - 1 - i] + " , " + inputArray1[i] );
            }
        }
        
        System.out.println(list);

    }

}
