
package Task6;

import java.util.Scanner;

/**
 * Task:Suppose you have a Saving Box with an initial amount of $50 and you have 
 * to add some more to it. Create a class 'AddAmount' with a data member named 
 * 'amount' with an initial value of $50. Now make two constructors of this 
 * class as follows: 
 *      1 - without any parameter - no amount will be added to the Saving Box 
 *      2 - having a parameter which is the amount that will be added to Saving Box
 * 
 *      Create object of the 'AddAmount' class and display the final amount in Saving
 *      Box. Also, create a method that can display how many transactions are done on the Saving Box.
 * 
 * This file is an implementation of above task.
 * @author Tula Sah
 * Date: 9th June, 2021
 * File name: AddAmount.java
 * Compile: javac AddAmount.java
 * Run: java AddAmount
 */

public class AddAmount {

    private int amount = 50;
    private int saving;

    AddAmount() {
        amount = 50;

    }

    AddAmount(int addAmount) {
        saving = addAmount;
        amount = amount + addAmount;

    }

    private void displayTransaction() {

        System.out.println("The  Transaction amount is " + amount);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AddAmount addAmountObj = new AddAmount();
        System.out.println("Your Final amount(default constructor) in your Saving Box is: " + addAmountObj.amount);
        addAmountObj.displayTransaction();

        System.out.print("Add your amount into your Saving Box: ");
        int amt1 = scan.nextInt();
        
        AddAmount addAmountObj1 = new AddAmount(amt1);
        System.out.println("Your Final amount after adding the " + addAmountObj1.saving
                + " in your Saving Box is: " + addAmountObj1.amount);
        addAmountObj1.displayTransaction();
        
        System.out.print("Add your amount into your Saving Box: ");
        int amt2 = scan.nextInt();
        
        AddAmount addAmountObj2 = new AddAmount(amt2);
        System.out.println("Your Final amount after adding the " + addAmountObj2.saving
                + " in your Saving Box is: " + addAmountObj2.amount);
        addAmountObj2.displayTransaction();

    }

}
