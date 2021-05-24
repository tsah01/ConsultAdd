package Task2;

/**
 * Task :Write a program that prints all the numbers from 0 to 6 except 3 and 6.   
 * This file is an implementation of the above task.
 * @author Tula Sah
 * File name: TaskTwo_5.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_5.java
 * Run: java TaskTwo_5
 */
public class TaskTwo_5 {

   
    public static void main(String[] args) {
        for(int i =0; i<= 6; i++){
            if(i == 3 || i == 6){
                continue;
                
            }
            System.out.print(i + " ");
        }
        
    }
    
}
