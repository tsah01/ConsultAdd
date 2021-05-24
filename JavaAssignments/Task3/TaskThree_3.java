/*
 * TASK: Write a JAVA program that takes user input from 1 to 12 for months, and 
         display number of days of a particular month. 
         (Shows “Invalid Details“ if incorrect month number will be provided).
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;


public class TaskThree_3 {

   
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number(from 1 to 12) for months to display a"
                + " \nnumber of days of a particular month: ");
        int number = scan.nextInt();
        int count =0;
        System.out.println("=====================================");
        
        if(number >= 1 && number <= 12){
            switch(number){
                case 1 : System.out.println("There are 31 days in a month of January." );
                            for(int i = 1 ; i<= 31 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 2 : System.out.println("There are 28 days in a month of February." );
                            for(int i = 1 ; i<= 28 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 3 : System.out.println("There are 31 days in a month of March." );
                            for(int i = 1 ; i<= 31 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 4 : System.out.println("There are 30 days in a month of April." );
                            for(int i = 1 ; i<= 30 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 5 : System.out.println("There are 31 days in a month of May." );
                            for(int i = 1 ; i<= 31 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " ); 
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 6 : System.out.println("There are 30 days in a month of June." );
                            for(int i = 1 ; i<= 30 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 7 : System.out.println("There are 31 days in a month of July." );
                            for(int i = 1 ; i<= 31 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 8 : System.out.println("There are 31 days in a month of August." );
                            for(int i = 1 ; i<= 31 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 9 : System.out.println("There are 30 days in a month of September." );
                            for(int i = 1 ; i<= 30 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " ); 
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 10 : System.out.println("There are 31 days in a month of October." );
                                for(int i = 1 ; i<= 31 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 11 : System.out.println("There are 30 days in a month of November." );
                            for(int i = 1 ; i<= 30 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " );
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
                case 12 : System.out.println("There are 31 days in a month of December." );
                            for(int i = 1 ; i<= 31 ; i++){
                                System.out.print(i + "\t " );
                                count++;
                                if(count == 7){
                                  System.out.println(" " ); 
                                  System.out.println(" " );
                                  count = 0;
                                }
                            }
                break;
                
            }
            
            
        }
        else{
            System.out.println("You have provided invalid number for a particular month !!");
        }
    }
    
}
