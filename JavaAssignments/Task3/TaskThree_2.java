/*
 * Task: Write a program in which: 
         a. Take 10 values input from user using loop. 
         b. Print sum of all the numbers provided
         c. Print the Average of those 10 values 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;


public class TaskThree_2 {

   
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int number;
        double sum=0;
        double avg ;
        
        for(int i = 1; i<= 10; i++ ){
          System.out.print("Enter your number : ");
          number =  scan.nextInt();
          sum += number; // sum = sum + number 
        }
       
        avg = (sum/10);
        System.out.println("======================" );
        System.out.println("Sum of all numbers =  " + sum);
        System.out.println("Average of all numbers  =  " + avg);
    }
    
}
