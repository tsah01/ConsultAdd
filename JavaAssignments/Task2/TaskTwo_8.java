package Task2;
import java.util.Scanner;




/**
 * Task :Write a JAVA program which takes character input from the user,  
 * If the character is from r, a, n, d, o, m (consider both upper and lower cases),
 * then print FOUND.Print NOT FOUND for all the other alphabets.   
 * This file is an implementation of the above task.
 * @author Tula Sah
 * File name: TaskTwo_8.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_8.java
 * Run: java TaskTwo_8
 */
public class TaskTwo_8 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character to check: ");
        String input = scan.next();
        char character = input.charAt(0); // getting the first character
        
        if(character == 'r' ||character == 'R' 
                || character == 'a' || character == 'A'
                || character == 'n' || character == 'N'
                || character == 'd' || character == 'D'
                || character == 'o' || character == 'O'
                || character == 'm' || character == 'M'){
            System.out.println("FOUND");
        }
        else{
             System.out.println("NOT FOUND");
        }
            
       
    }
    
}
