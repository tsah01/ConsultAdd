
import java.util.Scanner;



/**
 * Task :Given an integer , perform the following conditional actions: 
 *       - If  is odd, print NEW 
 *       - If  is even and in the inclusive range of 2 to 5 , print OLD 
 *       - If  is even and in the Inclusive range of 6 to 30, print NEW 
 *       - If  is even and greater than 30, print OLD    
 * This file is an implementation of the above task. 
 * @author Tula Sah
 * File name: TaskTwo_6.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_6.java
 * Run: java TaskTwo_6
 */
public class TaskTwo_6 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number to check some conditional action : ");
        int number = scan.nextInt();
        
        if(number % 2 != 0){ // If number is ODD
            System.out.print(" NEW "); 
            
        }
        else{ // EVEN NUMBERS
            if(number >= 2 && number <= 5){
              System.out.print(" OLD ");   
            }
            else if(number >= 6 && number <= 30){
              System.out.print(" NEW ");   
            }
            else if(number >= 6 && number <= 30){
              System.out.print(" NEW ");   
            }
            else if(number > 30){
               System.out.print(" OLD "); 
            }   
        }
        
    }
    
}
