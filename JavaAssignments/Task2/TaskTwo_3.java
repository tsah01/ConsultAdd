package Task2;
/**
 * Task : Write a program in JAVA to implement the given flowchart:` 
 * This file is an implementation of the above task.
 * @author Tula Sah
 * File name: TaskTwo_3.java
 * Date: 19th May, 2021
 * Compile: javac TaskTwo_3.java
 * Run: java TaskTwo_3
 */

public class TaskTwo_3 {

  
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        double avg = (a + b + c)/3;
        System.out.println("Avg = " + avg);
        
        if(avg > a && avg > b && avg > c){
            System.out.println("avg is higher than a , b , c ");
        }
        else{
            if(avg > a && avg > b){
                System.out.println("avg is higher than a, b");
            }
            else if(avg > a && avg > c){
               System.out.println("avg is higher than a, c"); 
            }
            else if(avg > b && avg > c){
                System.out.println("avg is higher than b, c");    
            }
            else if(avg > a){
                System.out.println("avg is just higher than a");
            }
            else if(avg >b){
                System.out.println("avg is just higher than b");
            }
            else if(avg > c){
                System.out.println("avg is just higher than c");
            }
        }
        
       
    }
    
}
