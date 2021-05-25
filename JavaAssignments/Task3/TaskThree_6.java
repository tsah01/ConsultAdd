package Task3;

import java.util.Scanner;

/*
 * TASK: Write a program that accepts three numbers from the user and 
        prints "INCREASING" if thenumbers are in increasing order, "DECREASING" 
        if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. 
        FOR eg:
                Input first number: 1524 //Neither increasing or decreasing order
                Input second number: 2345 // INCREASING
I               nput third number: 3321 // DECREASING
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class TaskThree_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNum = scan.nextInt();
        System.out.print("Input second number: ");
        int secondNum = scan.nextInt();
        System.out.print("Input third number: ");
        int thirdNum = scan.nextInt();

        if (firstNum < secondNum && secondNum < thirdNum) {
            System.out.println("INCREASING ");
        } else if (firstNum > secondNum && secondNum > thirdNum) {
            System.out.println("DECREASING ");
        } else {
            System.out.println("Neither increasing or decreasing order ");
        }

    }

}
