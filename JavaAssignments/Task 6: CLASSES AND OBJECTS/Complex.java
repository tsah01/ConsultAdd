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

    private long RealNum1;
    private long ImaginaryNum2;

    //default constructor
    Complex() {
        this. RealNum1 = 0;
        this.ImaginaryNum2 = 0;
    }

    //overloaded constructor
    Complex(long a, long b) {
        this.RealNum1 = a;
        this.ImaginaryNum2 = b;
    }
  
private Complex sum(Complex obj){
    long real = this.RealNum1 + obj.RealNum1;
    long imaginary = this.ImaginaryNum2 + obj.ImaginaryNum2;
    return new Complex(real, imaginary);
            
}
    //getter method for difference
    private Complex Difference(Complex obj) {
        long real = this.RealNum1 - obj.RealNum1;
        long imaginary = this.ImaginaryNum2 - obj.ImaginaryNum2;
        return new Complex(real, imaginary);
    }


    //getter method for product
    private Complex Product(Complex obj) {
        long real = this.RealNum1 * obj.RealNum1;
        long imaginary = this.ImaginaryNum2 * obj.ImaginaryNum2;
        return new Complex(real, imaginary);
    }
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first real number: ");
        long real1 = scan.nextLong();
        System.out.print("Enter your first imaginary number: ");
        long imaginary1 = scan.nextLong();
        System.out.println();
        System.out.print("Enter your second real number: ");
        long real2 = scan.nextLong();
        System.out.print("Enter your second imaginary number: ");
        long imaginary2 = scan.nextLong();

        Complex obj1 = new Complex(real1, imaginary1);
        Complex obj2 = new Complex(real2, imaginary2);
        
        Complex sumObj = obj1.sum(obj2);
        Complex diffObj = obj1.Difference(obj2);
        Complex productObj = obj1.Product(obj2);
        
        System.out.print("Enter your option \n(enter 'sum' for addition, 'diff' for difference "
                + " or 'product' for multiplication): ");
        String option = scan.next();
        
        switch(option){
            case "sum":
                System.out.println("The sum is: " + sumObj.RealNum1 
                        + " + " + sumObj.ImaginaryNum2 + "i" );
            break;
            
            case "diff": 
                System.out.println("The difference is: " + diffObj.RealNum1 
                        + " + " + diffObj.ImaginaryNum2 + "i" );
            break;
            
            case "product":
                System.out.println("The product is: " + productObj.RealNum1 
                        + " + " + productObj.ImaginaryNum2 + "i" );
                break;
            
        }

  
    }

}
