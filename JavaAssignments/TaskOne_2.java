
import java.util.Scanner;

/**
 * Task : Write a program to print the value given by the user.
 * This file is an implementation of above task.
 * @author Tula Sah
 * File name: TaskOne_2.java
 * Date: 19th May, 2021
 * Compile: javac TaskOne_2.java
 * Run: java TaskOne_2
 */
public class TaskOne_2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int value = scan.nextInt();
        System.out.println("The user value is: " + value);
    }
    
}
