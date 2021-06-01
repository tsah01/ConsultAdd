package task4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Task: Write a JAVA program that takes out the even from the odds and odd from 
 *          the list of even numbers. 
 *          For eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2 
 *                  => {22,44,64,76,98,12,43,54,90} // Output for this case =>43.     
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 28th May, 2021
 * File name: TaskFour_5.java
 * Compile: javac TaskFour_5.java
 * Run: java TaskFour_5
 */

public class TaskFour_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter 1(for odd) or 2(for even) to choose the list: ");
        int input = scan.nextInt();

        switch (input) {
            case 1:
                System.out.print("Enter the numbers to build the odd list(NOTE: ENTER -1 TO STOP THE LOOP): ");
                int number = scan.nextInt();

                while (number != -1) {
                    list.add(number);
                    System.out.print("Enter the numbers to build the odd list(NOTE: ENTER -1 TO STOP THE LOOP): ");
                    number = scan.nextInt();
                }
                /*iterate the list to check if there are any even numbers  */
                System.out.print("The even numbers are: ");
                for (Integer num : list) {
                    if (num % 2 == 0) {
                        System.out.print(num + " ");
                    }
                }
                break;
                
            case 2:
                System.out.print("Enter the numbers to build the even list (NOTE: ENTER -1 TO STOP THE LOOP): ");
                int evenNum = scan.nextInt();

                while (evenNum != -1) {
                    list.add(evenNum);
                    System.out.print("Enter the numbers to build the even list(NOTE: ENTER -1 TO STOP THE LOOP): ");
                    evenNum = scan.nextInt();
                }
                /*iterate the list to check if there are any odd numbers  */
                System.out.print("The odd numbers are: ");
                for (Integer num : list) {
                    if (num % 2 != 0) {
                        System.out.print(num + " ");
                    }
                }
                break;

        }

    }

}
