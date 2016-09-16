/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingwithoutconsole;
import java.io.*;
/**
 *
 * @author NehNe
 */
public class Question4 {
    public static void q4 (String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        int num1, num2, num3, num4, num5, high;
        
        System.out.print ("Enter number 1: ");
        num1 = Integer.parseInt (br.readLine () );
        
        high = num1;
        
        System.out.print ("\nEnter number 2: ");
        num2 = Integer.parseInt (br.readLine () );
        
        if (num2 > high)
        {
            high = num2;
        }
        
        System.out.print ("\nEnter number 3: ");
        num3 = Integer.parseInt (br.readLine () );
        
        if (num3 > high)
        {
            high = num3;
        }
        
        System.out.print ("\nEnter number 4: ");
        num4 = Integer.parseInt (br.readLine () );
        
        if (num4 > high)
        {
            high = num4;
        }
        
        System.out.print ("\nEnter number 5: ");
        num5 = Integer.parseInt (br.readLine () );
        
        if (num5 > high)
        {
            high = num5;
        }
        
        System.out.println ("The highest input number is: " + high);
    }
    
}
