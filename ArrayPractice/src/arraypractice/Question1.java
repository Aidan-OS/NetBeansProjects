/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class Question1 {

    /**
     *
     * @param args
     * @return
     * @throws IOException
     */
    public static int [] q1a (String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        int [] numbers = new int [5];
        
        System.out.print ("Please enter five numbers: ");
        numbers [0] = Integer.parseInt (br.readLine () );
        numbers [1] = Integer.parseInt (br.readLine () );
        numbers [2] = Integer.parseInt (br.readLine () );
        numbers [3] = Integer.parseInt (br.readLine () );
        numbers [4] = Integer.parseInt (br.readLine () );
        
        System.out.println();
        
        for (int i = 4; i >= 0; i--)
        {
            System.out.println (numbers [i]);
        }
        
        return (numbers);
        
    }
    
    public static void q1b (int [] numbers) throws IOException
    {
        int sum = 0;
        
        for (int i = 0; i < 5; i++)
        {
            sum += numbers [i];
        }
        
        System.out.println ("The sum of all the numbers in the array is: " + sum);
    }
    
    public static void q1c (int [] numbers) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        
        int search;
        
        System.out.print ("Please enter a number, and I will search for it in the array: ");
        search = Integer.parseInt (br.readLine () );
        
        boolean found = false;
        
        for (int i = 0; i < 5; i++)
        {
            if (search == numbers [i])
            {
                found = true;
                
                break;
            }
        }
        
        if (found)
        {
            System.out.println ("The number you entered is in the array!");
        }
        
        else
        {
            System.out.println ("The number you entered is not in the array...");
        }
        
    }
    
}
