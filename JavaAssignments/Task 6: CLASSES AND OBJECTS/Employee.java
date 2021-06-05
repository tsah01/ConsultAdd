package Task6;

/**
 * Task:Write a program that would print the information (name, year of joining, salary, address) 
 * of three employees by creating a class named 'Employee'. 
 * The output should be as follows:
 *          Name        Year of joining        Address  
 *          Robert            1994                64C- Walls Streat  
 *          Sam               2000                68D- Walls Streat 
 *          John              1999                26B- Walls Streat  
 * 
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 5th June, 2021
 * File name: Employee.java
 * Compile: javac Employee.java
 * Run: java Employee
 */

public class Employee {

    private String name;
    private int yearOfJoining;
    private String address;

    //overloaded constructor
    Employee(String n, int y, String a) {
        this.name = n;
        this.yearOfJoining = y;
        this.address = a;
    }

    // setter method to set an employee name
    public void setName(String giveName) {
        this.name = giveName;
    }

    //getter method to retrieve an employee name
    public String getName() {
        return this.name;
    }

    // setter method to set the joining year of an employee
    public void setJoinYear(int year) {
        this.yearOfJoining = year;
    }

    // getter method to retrieve the joining year of an employee
    public int getJoinYear() {
        return this.yearOfJoining;
    }

    // setter method to set the address of an employee
    public void setAddress(String addr) {
        this.address = addr;
    }

    // getter method to retrieve the address of an employee
    public String getAddress() {
        return this.address;
    }

    public static void main(String[] args) {
        //initializing object one
        Employee obj1 = new Employee("Robert", 1994, "64C- Walls Streat");
        System.out.println();
        System.out.println("Name \tYear of Joining \tAddress");
        System.out.println();
        System.out.println(obj1.name + "\t " + obj1.yearOfJoining + "\t \t" + obj1.address);

        //adding second employee
        obj1.setName("Sam");
        obj1.setJoinYear(2000);
        obj1.setAddress("68D- Walls Streat");
        System.out.println();
        System.out.println(obj1.name + "\t " + obj1.yearOfJoining + "\t \t" + obj1.address);

        //adding third employee
        obj1.setName("john");
        obj1.setJoinYear(1999);
        obj1.setAddress(" 26B- Walls Streat");
        System.out.println();
        System.out.println(obj1.name + "\t " + obj1.yearOfJoining + "\t \t" + obj1.address);
    }

}
