package Task6;

import java.util.Scanner;

/**
 * Task:Create a class named 'Rectangle' with two data members- length and 
 * breadth and a method to calculate the area which is 'length*breadth'. 
 * he class has three constructors which are : 
 *      1 - having no parameter - values of both length and breadth are assigned zero. 
 *      2 - having two numbers as parameters - the two numbers are assigned as 
 *          length and breadth respectively. 
 *      3 - having one number as parameter - both length and breadth are 
 *          assigned that number.
 * 
 *  Now, create objects of the 'Rectangle' class having none, one and two parameters 
 *  and print their areas. 
 * 
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: Rectangle.java
 * Compile: javac Rectangle.java
 * Run: java Rectangle
 */


public class Rectangle {

    private double lenght;
    private double breadth;

    private double calculateArea() {

        return (lenght * breadth);
    }

    Rectangle() {
        lenght = 0;
        breadth = 0;
    }

    Rectangle(double num) {
        lenght = num;
        breadth = num;
    }

    Rectangle(double len, double bread) {
        lenght = len;
        breadth = bread;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the legth of Rectangle: ");
        double len = scan.nextDouble();
        System.out.print("Enter the breadth of Rectangle: ");
        double bread = scan.nextDouble();

        Rectangle rectangleObj = new Rectangle();
        System.out.println("The area of Rectangle having no parameter is : " + rectangleObj.calculateArea());

        Rectangle rectangleObj1 = new Rectangle(len);
        System.out.println("The area of Rectangle having one parameter is : " + rectangleObj1.calculateArea());

        Rectangle rectangleObj2 = new Rectangle(len, bread);
        System.out.print("The area of Rectangle having two parameter is : " + rectangleObj2.calculateArea());
    }

}
