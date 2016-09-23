/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class HelpingBIlly {
    
    public static void billyhelp () throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int highest = -1;
    
        System.out.println ("Please enter 5 numbers:");
    
        for (int i = 0; i < 5; i++)
        {
            int input = Integer.parseInt (br.readLine ());
            if (input > highest)
            {
                highest = input;
            }
        }
        
        System.out.println ("The highest number entered is: " + highest);
        
        System.out.println ();
        
        String [][] arr2D = new String [4][2];
        for (int i = 0; i < arr2D.length; i++)
        {
            for (int j = 0; j < arr2D [1].length; j++)
            {
                arr2D [i] [j] = "(" + i + "," + j + ")";
                System.out.print (arr2D [i] [j]);
            }
            System.out.println ();
        }
        
        
        
        
    }
    
}
