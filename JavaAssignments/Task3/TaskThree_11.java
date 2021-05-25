/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sah
 */
public class TaskThree_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dm = new DecimalFormat("0.00");

        System.out.print("Enter your fist float number:  ");
        float num1 = scan.nextFloat();

        System.out.print("Enter your second float number:  ");
        float num2 = scan.nextFloat();

        float roundedNum1 = Math.round(num1 * 100); //round into 2 decimal places
        float roundedNum2 = Math.round(num2 * 100);//round into 2 decimal places

        if (roundedNum1 == roundedNum2) {
            System.out.println(dm.format(num1) + " and " + dm.format(num2) + " are  same.");
        } else {
            //just to check
            System.out.println(dm.format(num1) + " and " + dm.format(num2) + " are not same.");
        }
    }

}
