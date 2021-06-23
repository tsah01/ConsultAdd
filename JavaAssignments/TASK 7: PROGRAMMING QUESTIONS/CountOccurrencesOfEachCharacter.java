package Task7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Task:Program to Count occurrences of each character in a string in java? 
 *
 * @author Tula Sah
 * Date: 9th June, 2021 
 * File name: CountOccurrencesOfEachCharacter.java 
 * Compile: javac CountOccurrencesOfEachCharacter.java
 * Run: java CountOccurrencesOfEachCharacter
 */

public class CountOccurrencesOfEachCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        System.out.println("The given string is: " + input);
        //create a character array of input string
        char[] inputcharacter = input.toCharArray();

        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

        for (int i = 0; i < inputcharacter.length; i++) {
            //if the character present in hashmap then put key and value increased by 1 into the hashmap
            if (hashmap.containsKey(inputcharacter[i])) {
                hashmap.put(inputcharacter[i], hashmap.get(inputcharacter[i]) + 1);
            } else {
                //else  put key and value as 1 into the hashmap
                hashmap.put(inputcharacter[i], 1);
            }
        }
        //printing hashmap
        for (Map.Entry entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times ");
        }

    }

}
