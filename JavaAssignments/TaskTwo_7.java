
import java.util.Scanner;



/**
 * Task :Write a Java program that reads a floating-point number and 
 * prints "zero" if the number is zero. Otherwise, print "positive" or "negative". 
 * Add "small" if the absolute value of the number is less than 1, 
 * or "large" if it exceeds 1,000,000.
 
 * This file is an implementation of the above task.
 * @author Tula Sah
 * File name: TaskTwo_7.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_7.java
 * Run: java TaskTwo_7
 */
public class TaskTwo_7 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float number = scan.nextFloat();
        float absVal = Math.abs(number);
        
        if(number == 0){
            System.out.println("Zero ");
        }
        else if(number > 0){
            System.out.println("Positive ");
        }
        else if(number < 0){
            System.out.println("Negative ");
        }
        
        // check for absolute value
        if(absVal < 1){
            System.out.println("Small ");
        }
        else if (absVal > 1000000){
            System.out.println("Large ");
            
        }
        
       
    }
    
}
