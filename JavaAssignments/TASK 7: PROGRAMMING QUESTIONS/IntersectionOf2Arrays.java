package Task7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import com.google.common.collect.Sets;
/**
 * Task:Program to find the intersection of two arrays in java? 
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: IntersectionOf2Arrays.java
 * Compile: javac IntersectionOf2Arrays.java
 * Run: java IntersectionOf2Arrays 
 */

public class IntersectionOf2Arrays {

    public static void main(String[] args) {
        
        int[] number1 = {1,2,3,4,5,6};
        int[] number2 = {1,2,3,7,8,9};
        
        System.out.print("Intersection of two arrays is: ");
        for(int i =0; i<number1.length; i++){
            for(int j =0; j<number2.length; j++){
                if(number1[i] == number2[j] ||number1[i] != number2[j] )
                    System.out.print(number1[i] + " ");
                break;
            }
        }
       
        /* 
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
     
        //using set
        // now adding all elements of set2 into the set1, since it is  a set it will remove the duplicate elements
        set1.addAll(set2);
        System.out.println("The union of set1 and set2 is: " + set1);// union of set1 and set1

        //intersection of set1 and set2
        set1.retainAll(set2);
        System.out.println("The intersection of set1 and set2 is: " + set1);// intersectoion of set1 and set1

        //difference of set1 and set2
        set1.removeAll(set2);
        System.out.println("The difference of set1 and set2 is: " + set1);// difference of set1 and set1

        //using Guava library
       Set<Integer> union = Sets.union(set1, set2);
       Set<Integer> intersection = Sets.intersection(set1, set2);
       Set<Integer> difference = Sets.difference(set1, set2);
       System.out.println("The union of sets is: " + union);
       System.out.println("The intersection of set1 and set2 is: " + intersection);
       System.out.println("The difference of set1 and set2 is: " + difference);
         */
    }

}
