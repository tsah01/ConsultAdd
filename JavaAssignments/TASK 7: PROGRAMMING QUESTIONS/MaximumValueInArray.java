package Task7;

import java.util.Scanner;

/**
 * Task:Program to Count occurrences of each character in a string in java? 
 *
 * @author Tula Sah
 * Date: 9th June, 2021 
 * File name: MaximumValueInArray.java 
 * Compile: javac MaximumValueInArray.java
 * Run: java MaximumValueInArray
 */

public class MaximumValueInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scan.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array elements: ");
            number[i] = scan.nextInt();
        }

        //printing the array
        System.out.print("Your array is ");
        for (Integer num : number) {
            System.out.print(num + " ");
        }

        int max = 0;

        for (int i = 0; i < size; i++) {

            if (max < number[i]) {
                max = number[i];
            }

        }
        System.out.println("\nThe Maximum value in the array is " + max);

    }

}
