
import java.util.Scanner;



/**
 * Task :If user enters a negative number just break the loop and print “It’s Over”  
 * If user enters a positive number just continue in the loop and print “Good Going” 
 * This file is an implementation of the above task.
 * @author Tula Sah
 * File name: TaskTwo_4.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_4.java
 * Run: java TaskTwo_4
 */

public class TaskTwo_4 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number to continue and negative for break: ");
        int number = scan.nextInt();
        
        while(number >= 0){
            System.out.println("Good Going ");
            System.out.print("Enter a positive number to continue and negative for break: ");
            number = scan.nextInt();
        }
        System.out.println("Its Over ");
    }
    
}
