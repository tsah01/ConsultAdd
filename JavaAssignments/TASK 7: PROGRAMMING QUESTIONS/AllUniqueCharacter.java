/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7;

import java.util.Scanner;

/**
 * Task:Program to find if String has all Unique Characters?  
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: AllUniqueCharacter.java
 * Compile: javac AllUniqueCharacter.java
 * Run: java AllUniqueCharacter
 */

public class AllUniqueCharacter {

   
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        System.out.println("The given string is: " + input);

        boolean unique = true;

        for (int i = 0; i < input.length(); i++) {

            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(i) == input.charAt(j)) {
                    unique = false; //it is a matching character not a unique

                }
            }

        }
        if (unique) { // if it is a non repeated character
            System.out.println("String has all unique character ");

        } else {
            System.out.println("String has duplicate character ");

        }
    }

}
