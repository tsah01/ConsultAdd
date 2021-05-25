/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;

/**
 *
 * @author sah
 */
public class TaskThree_10 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int numRows = scan.nextInt();
        int numberOne = 1;
        int spaces = numRows;
        //iterate through number of lines
        for(int i =0; i <numRows; i++){
            //inner for loop for spaces
            for(int s =1; s<= spaces; s++){
                System.out.print(" ");
                
            }
            //re initialize numberOne to one
            numberOne= 1;
            //monitoring how many numbers of times printing a number
            for(int j =0; j<= i; j++){
                System.out.print(numberOne + " ");
                //formula for calculating the next number
                numberOne = numberOne * (i-j)/(j+1);
            }
            //decrement the spaces
            spaces--;
            System.out.println();
            
        }
    }
    
}
