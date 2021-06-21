package Task6;

import java.util.Scanner;
/**
 * Task:Write a program to print the names of students by creating a Student class. 
 *      If no name is passed while creating an object of Student class, 
 *      then the name should be "Unknown", otherwise the name should be equal to 
 *      the String value passed while creating object of Student class. 
 *      (Hint: Overloading concept)  
 * 
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: Student.java
 * Compile: javac Student.java
 * Run: java Student
 */

public class Student {

    private String name;

    Student() {
        this.name = "Unknown";

    }

    Student(String fname) {
        this.name = fname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.next();
        //initializing object one
        Student student1 = new Student();
        System.out.println("Your name is " + student1.getName());
        
        Student student2 = new Student(name);
        System.out.println("Your name is " + student2.getName());

        
    }

}
