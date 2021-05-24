/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;

/**
 *
 * @author sah
 */
public class TaskThree_7 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int monthNum = scan.nextInt();
        System.out.print("Input a year: ");
        int year = scan.nextInt();
        int count =0;
            if(monthNum >= 1 && monthNum <= 12){
            switch(monthNum){
                case 1 : System.out.println("January " + year + " has 31 days " );
                break;
                
                case 2 : System.out.println("February " + year + " has 29 days " );
                break;
                
                case 3 : System.out.println("March " + year + " has 31 days " );
                break;
                
                case 4 : System.out.println("April " + year + " has 30 days " );
                break;
                
                case 5 : System.out.println("May " + year + " has 31 days " );
                break;
                
                case 6 : System.out.println("June " + year + " has 30 days " );
                break;
                
                case 7 : System.out.println("July " + year + " has 31 days ");
                break;
                
                case 8 : System.out.println("August " + year + " has 31 days " );
                break;
                
                case 9 : System.out.println("September " + year + " has 30 days ");
                break;
                
                case 10 : System.out.println("October " + year + " has 31 days " );
                break;
                
                case 11 : System.out.println("November " + year + " has 30 days ");
                break;
                
                case 12 : System.out.println("December " + year + " has 31 days " );
                break;
                
            }
            
            
        }
        else{
            System.out.println("You have provided invalid number for a particular month !!");
        }    
    }
    
}
