package Task2;
import java.util.Scanner;



/**
 * Task :Ask user to choose the following option first: 
 *          If User Enter 1 - Addition  
 *           If User Enter 2 - Subtraction 
 *           If User Enter 3 - Division		 
 *           If User Enter 4 - Multiplication  
 *           If User Enter 5 – Average.
 *   - Ask user to enter the 2 numbers in a variable for first and 
 *    second(first and second are variable names) for the first 4 options mentioned above and print the result. 
 *   - Ask user to enter two more numbers as first1 and second2 for calculating the average as soon as	 user choose an option 5. 
 *     At the end if the answer of any operation is Negative print a statement saying “Oops option X(1/2/3/4/5/) is returning the negative number” 
 *   - NOTE: At a time user can perform one action at a time.   
 * This file is an implementation of the above task.
 * 
 * @author Tula Sah
 * File name: TaskTwo_2.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_2.java
 * Run: java TaskTwo_2
 */

public class TaskTwo_2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter 1 for Addition"
                          + "\n- 2 for subtraction"
                          + "\n- 3 for Division "
                          + "\n- 4 for Multiplication "
                          + "\n- 5 for Average:  ");
        int input = scan.nextInt();
        int first;
        int second;
        double result=0;
        
        System.out.println("\nEnter 2 numbers to perform an option " + input + " : ");
        first = scan.nextInt();
        second = scan.nextInt();
        
        if(input == 1){
            result = (first + second);
            System.out.println("The addition of " + first + " and " + second + 
                    " is: " + result);
        }
        else if(input == 2){
            result = (first - second);
            System.out.println("The subtraction of " + first + " and " + second + 
                    " is: " + result);   
        }
        else if(input == 3){
            result = (first/ second);
            System.out.println("The Division of " + first + " and " + second + 
                    " is: " + result);   
        }
        else if(input == 4){
            result = (first* second);
            System.out.println("The Multiplication of " + first + " and " + second + 
                    " is: " + result);   
        }
        else if(input == 5){
            result = (first + second)/2;
            System.out.println("The Average of " + first + " and " + second + 
                    " is: " + result);   
        }
        
        if(result < 0){
            System.out.println("Oops option " + input + " is returning the negative number ");
        }
        
    }
    
}
