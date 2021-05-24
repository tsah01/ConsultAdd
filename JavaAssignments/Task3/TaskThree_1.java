/*
 * Task: Write a simple program to print multiplication table of a certain number
         taken from user:
         For eg. 2 X 1 = 2 
         2 X 2 = 4 
         and so on. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;

/**
 *
 * @author sah
 */
public class TaskThree_1 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number to print the multiplication table: ");
        int number = scan.nextInt();
        System.out.println("The multiplication Table of " + number + " is: ");
        System.out.println("=================================");
        
        for(int i =1; i<= 10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
    
}
