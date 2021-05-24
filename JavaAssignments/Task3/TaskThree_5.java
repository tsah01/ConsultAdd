/*
 * TASK: Write a JAVA program that takes long type input from user, and 
           a. display the number of digits.
           b. Calculate the sum of all the digits of the input. 
            
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;


public class TaskThree_5 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number to print the multiplication table: ");
        String longInput = scan.next(); //take a long type inputs from the user
        long sum =0;
        
        for(int i =0; i < longInput.length(); i++){
            System.out.println(longInput.charAt(i));
            int number = Integer.parseInt(String.valueOf(longInput.charAt(i)));
            //OR we can also use --> int a=Character.getNumericValue(c); where 'c' is a char
            sum += number;
            
        }
        
        System.out.println("The sum of all the digits of the inputs are: " + sum);
        
    }
    
}
