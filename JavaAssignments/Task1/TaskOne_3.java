package Task1;
import java.util.Scanner;

/**
 * Task: Ask the user to enter any 2 numbers in between 1-10 and 
   add both of them to another variable call z. 
 * Use z for adding 30 into it and print the final result by using variable results. 
 * This file is an implementation of above task.
 * @author Tula Sah
 * File name: TaskOne_3.java
 * Date: 19th May, 2021
 * Compile: javac TaskOne_3.java
 * Run: java TaskOne_3
 */

public class TaskOne_3 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a, b,z;
        
        //Ask the user to enter any 2 numbers in between 1-10 and 
        //add both of them to another variable call z.
        System.out.print("Enter your first number (between 1-10): ");
        a= scan.nextInt();
        System.out.print("Enter your second number (between 1-10): ");
        b= scan.nextInt();
        z = a+b;
        
        //Use z for adding 30 into it and print the final result by using variable results.
        z += 30;
        System.out.println("The final value of z is: " + z);
        
    }
    
}
