package Task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task: Write a Java program to add two matrices of the same size.         
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 29th May, 2021
 * File name: TaskFive_4.java
 * Compile: javac TaskFive_4.java
 * Run: java TaskFive_4
 */

public class TaskFive_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creating a 1st matix
        System.out.print("Enter the number of rows for matrix 1: ");
        int rows = scan.nextInt();
        System.out.print("Enter the number of columns for matrix 1: ");
        int columns = scan.nextInt();

        //initializing a two diamentional array size based on the given numbers of rows and columns
        int[][] numberArray = new int[rows][columns];

        //getting the two diamentional array elements from the user
        System.out.println("Enter the two diamentional array elements for matirx 1: ");

        for (int i = 0; i < rows; i++) { // outer loop for rows
            for (int j = 0; j < columns; j++) {// inner loop for columns
                numberArray[i][j] = scan.nextInt();
            }

        }
        // printing two diamentional array(metrix1)
        System.out.println("Your first " + rows + "X" + columns + " metrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numberArray[i][j] + " ");

            }
            System.out.println(); //  a line for rows
        }
        System.out.println();
        // creating a 2nd matrix
        System.out.print("Enter the number of rows for matrix 2: ");
        int row2 = scan.nextInt();
        System.out.print("Enter the number of columns for matrix 2: ");
        int column2 = scan.nextInt();

        //initializing a two diamentional array size based on the given numbers of row2 and column2
        int[][] numberArray2 = new int[row2][column2];

        //getting the two diamentional array elements from the user
        System.out.println("Enter the two diamentional array elements for matirx 2: ");

        for (int i = 0; i < row2; i++) { // outer loop for rows
            for (int j = 0; j < column2; j++) {// inner loop for columns
                numberArray2[i][j] = scan.nextInt();
            }

        }
        
        // printing two diamentional array(metrix2)
        System.out.println("Your second " + row2 + "X" + column2 + " metrix is: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(numberArray2[i][j] + " ");

            }
            System.out.println(); //  a line for rows
        }
        System.out.println();
        // if two metrix are with same size then add them together
        if (rows == row2 && columns == column2) {
            //initialize a new matrix of given rows/row2 and columns/column2 size
            int[][] additionMatrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    additionMatrix[i][j] = numberArray[i][j] + numberArray2[i][j];

                }
            }

            //printing the addition matrix
            System.out.println("The addition of two metrix is: ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(additionMatrix[i][j] + " ");

                }
                System.out.println(); //  a line for rows
            }
        } else {
            System.out.println("Metrix " + rows + "X" + columns + " and " + row2
                    + "X" + column2 + " can't perform addition operation.");
        }
        System.out.println();

    }

}
