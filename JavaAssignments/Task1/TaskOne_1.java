package Task1;
/**
 * Task one: Swap two numbers using third variable as result name and 
 * do the same task without using any third variable.
 * This file is an implementation of task one.
 * @author Tula Sah
 * File name: TaskOne_1.java
 * Date: 19th May, 2021
 * Compile: javac TaskOne_1.java
 * Run: java TaskOne_1
 */
public class TaskOne_1 {

  
    public static void main(String[] args) {
        System.out.println ("swaping two values with using any third variable");
        int temp =0;
        int a = 4;
        int b = 5; 
        
        //swaping the values
        temp = a;
        a = b;
        b= temp;
      
        System.out.println("The value of a is : " + a  );
        System.out.println("The value of b is : " + b  );
        
        System.out.println ("\nswaping two values without using any third variable");
        int c = 7;
        int d = 8;
        
        //swaping the values
        c =  c+d;// c=15
        d = c-d; //d= (15-8) =7 
        c = c-d; // c= (15 -7) = 8 
        
        System.out.println("The value of c is : " + c  );
        System.out.println("The value of d is : " + d  );
        
        
        
    }
    
}
