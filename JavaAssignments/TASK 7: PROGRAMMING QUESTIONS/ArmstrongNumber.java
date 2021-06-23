package Task7;

import java.util.Scanner;
/**
 * Task:Program to check the number is Armstrong number?  
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: ArmstrongNumber.java
 * Compile: javac ArmstrongNumber.java
 * Run: java ArmstrongNumber
 */

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int inputnum = scan.nextInt();
        System.out.println("The given string is: " + inputnum);

        //first count the number of digits
        int number = inputnum;
        int countDigit = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            countDigit += 1;
            number = number / 10;

        }
        System.out.println("There are " + countDigit + " digits ");
        //now implementing the armstrong digit logic
        //eg. 123 = 1^3 + 2^3 +3^3 = 1+8+27 = 36, now, 123 != 36 so it is not  a armstrong number
        int number1 = inputnum;
        int result = 0;
        int remainder1;

        while (number1 > 0) {
            remainder = number1 % 10;
            result += Math.pow(remainder, countDigit);
            number1 = number1 / 10;

        }
        //check if input number is equals to the result then it is an armstrong number
        if (inputnum == result) {
            System.out.println("It is an Armstrong number ");
        } else {
            System.out.println("It is not an Armstrong number ");
        }

    }

}
