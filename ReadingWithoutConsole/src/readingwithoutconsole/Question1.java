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
public class Question1 {
    public static void q1 (String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        String one;
        String two;
        
        System.out.print ("Enter the first sentence: ");
        one = br.readLine ();
        System.out.println ();
        
        System.out.print ("Enter the second sentence: ");
        two = br.readLine ();
        System.out.println ();
        
        if (one.equals (two) )
        {
            System.out.println ("These sentences are the same.");
        }
        
        else
        {
            System.out.println ("These sentences are different.");
        }
    }
    
}
