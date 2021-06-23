package Task7;

import java.util.Scanner;
/**
 * Task:Program to find the first non-repeated character in the String
 *
 * @author Tula Sah
 * Date: 9th June, 2021 
 * File name: FirstNonRepeatedCharacter.java 
 * Compile: javac FirstNonRepeatedCharacter.java
 * Run: java FirstNonRepeatedCharacter
 */


public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        System.out.println("The given string is: " + input);
        

        for (int i = 0; i < input.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(i) == input.charAt(j)) {
                    unique = false; //it is a matching character not a unique
                    break;
                }
            }
            if (unique) { // if it is a non repeated character
                System.out.println("The first non repeated character in String is: " + input.charAt(i));
                break;
            }
        }

    }

}
