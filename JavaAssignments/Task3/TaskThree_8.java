package Task3;

import java.util.Scanner;

/**
 * TASK: Write a Java program that takes a year from user and print whether that 
 *          year is a leap year or not.
 *          - if year is divisible by 4 it is a leap year
 *          - or if year is divisible by 400, it is a leap year
 *          - if year is divisible by 100, it is not a leap year
 * @author sah
 */

public class TaskThree_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.print("It is a leap year ");
        } else if (year % 400 == 0) {
            System.out.print("It is a leap year ");
        } else {
            System.out.print("It is not a leap year ");
        }

    }

}
