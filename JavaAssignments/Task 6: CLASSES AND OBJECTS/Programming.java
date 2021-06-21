/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task6;

import java.util.Scanner;


public class Programming {
    private String str = "I love programming languages";
    
    Programming(){
        str = "I love programming languages";
    }
    Programming(String input){
        str = str.replace("programming languages", input);
        
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Programming programmingObj = new Programming();
        System.out.println("\n " + programmingObj.str);
          
        System.out.print("Enter the string: ");
        String newString = scan.nextLine();
        Programming programmingObj1 = new Programming(newString);
        System.out.print("\n" + programmingObj1.str);
        
        
    }
    
}
