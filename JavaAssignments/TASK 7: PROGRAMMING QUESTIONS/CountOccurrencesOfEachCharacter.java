/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CountOccurrencesOfEachCharacter {

    
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        System.out.println("The given string is: " + input);
        //first filterout how many unique letter is present the user input
        //char[]uniqueCharacter = new char[input.length()];
        Set<Character> uniqueCharacter = new HashSet<>();
        for(int i =0; i<input.length(); i++){
            uniqueCharacter.add(input.charAt(i));
        }
        System.out.println("the unique letters are: " + uniqueCharacter);
        //uniqueCharacter.toArray();
        //now check each character appearance in original input
        int count=0;
        for(int j = 0; j< uniqueCharacter.size(); j++){
            //(int j = 0; j< uniqueCharacter.size(); j++)
            for(int i =0; i< input.length(); i++){
                if(input.charAt(i) == uniqueCharacter.toString().charAt(j)){
                   count++; 
                }
                System.out.println("character " + uniqueCharacter.toString().charAt(j) + " repeated " + count);
            }
            
        }
        
    }
    
}
