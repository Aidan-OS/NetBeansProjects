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
public class Question3 {
    
    public static void q3 (String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        int num1, num2, sumenter, sumact;
        
        System.out.print ("Please enter the first number: ");
        num1 = Integer.parseInt (br.readLine () );
        
        System.out.print ("\nPlease enter the second number: ");
        num2 = Integer.parseInt (br.readLine () );
        
        System.out.print ("\nPlease enter the sum of the last two numbers: ");
        sumenter = Integer.parseInt (br.readLine () );
        System.out.println ();
        
        sumact = num1 + num2;
        
        if (sumact == sumenter)
        {
            System.out.println ("You are correct!");
        }
        
        else
        {
            System.out.println ("You are incorrect...");
        }
    }
    
}
