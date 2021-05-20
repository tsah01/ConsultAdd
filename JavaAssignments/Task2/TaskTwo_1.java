
import java.util.Scanner;



/**
 * Task :Write a program in JAVA to print a number is divisible by 3 
 *       it should print “Consultadd” as a string. 
 *      - If a number is divisible by 5 it should print “JAVA Training” as a string 
 *      - If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string. 
 * This file is an implementation of the above task.
 * 
 * @author Tula Sah
 * File name: TaskTwo_1.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_1.java
 * Run: java TaskTwo_1
 */

public class TaskTwo_1 {

   
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = scan.nextInt();
       
       if(number % 3 == 0){
         System.out.println("Consultadd ");  
           
       }
       else if(number % 5 == 0){
           System.out.println("JAVA Training ");
       }
       else if(number % 3 == 0 && number % 5 == 0){
           System.out.println("Consultadd JAVA Training");
       }
    }
    
}
