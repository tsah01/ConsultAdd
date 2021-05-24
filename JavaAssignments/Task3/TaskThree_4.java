/*
 * TASK: Write a JAVA program that takes one integer input n from the user, 
            and display all the no, print sum of n natural numbers.? 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;


public class TaskThree_4 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scan.nextInt();
        int sum =0;
        int count=0;// to split a line
         
        for(int i =1; i<= number; i++){
            sum += i; // sum = sum+i
            System.out.print(i + "\t " );
            count++;
                if(count == 10){// break the line
                    System.out.println(" " );
                    System.out.println(" " );
                    count = 0;            
                }
                                
        }
        System.out.println("The sum of " + number + " natural numbers are: " + sum );
        
    }
    
}
