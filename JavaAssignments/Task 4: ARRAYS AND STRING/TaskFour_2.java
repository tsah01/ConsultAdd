package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Task: Write a JAVA program that gives sum of all the values of array except 
 *          the highest and lowest values.  
 *          
 * This file is an implementation of above task.
 * @author Tula Sah
 * File name: TaskFour_2.java
 * Date: 28th May, 2021
 * Compile: javac TaskFour_2.java
 * Run: java TaskFour_2
 */

public class TaskFour_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your values(NOTE: ENTER -1 TO STOP THE LOOP): ");
        double number = scan.nextDouble();
        double sum = 0;

        ArrayList<Double> arrylist = new ArrayList<>();
        while (number != -1) {
            arrylist.add(number);
            System.out.print("Enter your values(NOTE: ENTER -1 TO STOP THE LOOP): ");
            number = scan.nextDouble();

        }
        Collections.sort(arrylist);/* sorting array in acending order*/
        /* printing a line */
        System.out.println();
        /* printing arrylist in sorted order*/
        for (double printArray : arrylist) {
            System.out.println("Your values are : " + printArray);
        }
        
        /* summing up all the array values except first and last*/
        for (int i = 0; i < arrylist.size() - 2; i++) {
            sum += arrylist.get(i + 1);
        }
        /* printing the sum of all values except lowest and highest*/
        System.out.println("The sum of all the values of array excep the highest "
                + " and lowest values is: " + sum);
    }

}
