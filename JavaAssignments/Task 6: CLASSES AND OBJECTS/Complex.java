package Task6;

import java.util.Scanner;
/**
 * Task:Print the sum, difference and product of two complex numbers by creating
 * a class named 'Complex' with separate methods for each operation whose real 
 * and imaginary parts are entered by user.
 * 
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 5th June, 2021
 * File name: Complex.java
 * Compile: javac Complex.java
 * Run: java Complex
 */

public class Complex {

    private long num1;
    private long num2;

    //default constructor
    Complex() {
        this.num1 = 0;
        this.num2 = 0;
    }

    //overloaded constructor
    Complex(long a, long b) {
        this.num1 = a;
        this.num2 = b;
    }

    //setter method for sum
    public void setSum(long a, long b) {
        this.num1 = a;
        this.num2 = b;

    }

    //getter method for sum
    public long getSum() {
        return this.num1 + this.num2;
    }

    //setter method for difference
    public void setDifference(long number1, long number2) {
        this.num1 = number1;
        this.num2 = number2;
    }

    //getter method for difference
    private long getDifference() {
        return (this.num1 - this.num2);
    }

    //setter method for product
    public void setProduct(long number1, long number2) {
        this.num1 = number1;
        this.num2 = number2;
    }

    //getter method for product
    private long getProduct() {
        return (this.num1 * this.num2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first long number: ");
        long first = scan.nextLong();
        System.out.print("Enter your second long number: ");
        long second = scan.nextLong();

        Complex obj = new Complex(first, second);

        System.out.println("The sum of " + obj.num1 + " and " + obj.num2 + " is: " + obj.getSum());
        System.out.println("The difference of " + obj.num1 + " and " + obj.num2 + " is: " + obj.getDifference());
        System.out.println("The product of " + obj.num1 + " and " + obj.num2 + " is: " + obj.getProduct());

    }

}
