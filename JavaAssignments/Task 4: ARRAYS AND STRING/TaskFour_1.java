package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Task: Write a JAVA program that takes given String of words and return the 
 *          length of the shortest word.          
 * This file is an implementation of above task.
 * @author Tula Sah
 * File name: TaskFour_1.java
 * Date: 28th May, 2021
 * Compile: javac TaskFour_1.java
 * Run: java TaskFour_1
 */

public class TaskFour_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your word(NOTE: ENTER 'done' TO STOP THE LOOP): ");
        String word = scan.next();

        ArrayList<String> arraylist = new ArrayList<>();
        while (!(word.equalsIgnoreCase("DONE"))) {
            arraylist.add(word);
            System.out.print("Enter your word(NOTE: ENTER 'done' TO STOP THE LOOP): ");
            word = scan.next();
        }

        Collections.sort(arraylist);
        /* printing a line */
        System.out.println();
        /* printing arrylist in sorted order*/
        for (String printArray : arraylist) {
            System.out.println("Your words are : " + printArray);
        }

        /* finding the length of sortest word*/
        String sortestWord = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if ((arraylist.get(i).length()) < sortestWord.length()) {
                sortestWord = arraylist.get(i);
            }
        }

        int length = sortestWord.length();
        System.out.print("The length of the shortest word is: " + length);

    }

}
