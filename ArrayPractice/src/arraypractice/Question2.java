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
public class Question2 {
    
    public static String [] [] q2a (String [] args) throws IOException
    {
        String [] [] students = new String [3] [5];
        
        students [0] [0] = "Taylor";
        students [0] [1] = "Victor";
        students [0] [2] = "Mike";
        students [0] [3] = "Chris";
        students [0] [4] = "Josh";
        
        students [1] [0] = "Alex";
        students [1] [1] = "Justin";
        students [1] [2] = "David";
        students [1] [3] = "Nick";
        students [1] [4] = "Matt";
        
        students [2] [0] = "Sonny";
        students [2] [1] = "Shawn";
        students [2] [2] = "Adam";
        students [2] [3] = "Leonor";
        students [2] [4] = "Sebastian";
        
        for (int i = 0; i < 3; i++)
        {
            for (int t = 0; t < 5; t++)
            {
                System.out.print (students [i] [t] + " ");
            }
            
            System.out.println ();
        }
        
        return (students);
    }
    
    public static void q2b (String [] [] students) throws IOException
    {
        int row, col;
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        
        System.out.print ("Please enter a row number: ");
        row = Integer.parseInt (br.readLine () );
        
        System.out.print ("Please enter a column number: ");
        col = Integer.parseInt (br.readLine () );
        
        System.out.println ("The student in that location is named: " + students [row - 1] [col - 1] );
    }
    
}
