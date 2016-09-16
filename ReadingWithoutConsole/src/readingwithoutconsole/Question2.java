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
public class Question2 {
    public static void q2 (String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        String sentence;
        
        int numa = 0;
        
        System.out.print ("Please input a sentence: ");
        sentence = br.readLine ();
        System.out.println ();
        
        sentence = sentence.toUpperCase ();
        
        //Check if first word starts with a
        if (sentence.charAt (0) == 'A')
        {
            numa++;
        }
        
        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.charAt (i) == ' ')
            {
                if (sentence.charAt (i + 1) == 'A')
                {
                    numa++;
                }
            }
        }
        
        if (numa == 0)
        {
            System.out.println ("There are no words that start with 'a' in this sentence.");
        }
        
        else
        {
            System.out.println ("There are " + numa + " words that start with 'a' in this sentence.");
        }
        
    }
}
