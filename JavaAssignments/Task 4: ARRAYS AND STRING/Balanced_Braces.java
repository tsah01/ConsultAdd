package task4;

import java.util.Scanner;
import java.util.Stack;

/**
 * Task: Write a JAVA program that gives boolean values; true, if the string has 
 *          balanced braces and false, if the string has unbalanced braces: 
 *          For eg,  => “5 co” //output => true 
 *          //valid parenthesis 
 *          {{(  [ ) ] }}  => “[})(” //output => false. 
 * This file is an implementation of above task.
 * @author Tula Sah
 * File name: Balanced_Braces.java
 * Date: 28th May, 2021
 * Compile: javac Balanced_Braces.java
 * Run: java Balanced_Braces
 */

public class Balanced_Braces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = scan.nextLine();

        /* initialize a stack */
        Stack<Character> stack = new Stack<Character>();

        /*First, traverse an input string and pick each character at a time*/
        for (int i = 0; i < input.length(); i++) {
            /* check if a characters are opening braces ex:'(', '{', '['*/
            if (input.charAt(i) == '('
                    || input.charAt(i) == '{'
                    || input.charAt(i) == '[') {
                /* push into the stack */
                stack.push(input.charAt(i));
            } else {

                /* If the stack is not empty and current character is a closing bracket
                    and top character of a stack is  open bracket
                    then pop it */
            }
            if (!stack.isEmpty() && ((input.charAt(i) == ')' && stack.peek() == '(')
                    || (input.charAt(i) == '}' && stack.peek() == '{')
                    || (input.charAt(i) == ']' && stack.peek() == '['))) {
                stack.pop();

            } else {
                stack.push(input.charAt(i));
            }

        }
        /* After complete traversal, if the stack is empty then it is balanced 
            parentheses otherwise it is not balanced */
        if (stack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
