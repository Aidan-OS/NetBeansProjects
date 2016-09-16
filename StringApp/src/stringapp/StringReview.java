/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringapp;

/**
 *
 * @author NehNe
 */
public class StringReview {
    public static void problem1 (String [] args)
    {
        String word = "hello";
        
        System.out.println ("The word is: " + word + "\nThe first letter is: " + word.substring (0,1).toUpperCase ());
        
    }
    
    public static void problem2 (String [] args)
    {
        String sentence = "I love to eat pasta";
        System.out.println ("The sentence is: " + sentence);
        int numofspace = 0;
        int lastpoint;
        boolean nospaces = true;
        
        lastpoint = sentence.indexOf(" ");
        
        while (lastpoint != -1)
        {
            nospaces = false;
            numofspace++;
            sentence = sentence.substring (lastpoint + 1);
            lastpoint = sentence.indexOf (" ");   
        }
        
        if (nospaces)
        {
            System.out.println ("This input has no spaces.");
        }
        
        else
        {
            System.out.println ("There are " + numofspace + " spaces.");
        }
        
    }
    
    public static void problem3 (String [] args)
    {
        String sentence = "Hello World!";
        System.out.println (sentence.toUpperCase() );
    }
    
    public static void problem4 (String [] args)
    {
        String original = "canada";
        String flipped = "";
        
        for (int i = original.length () - 1; i >= 0; i--)
        {
            flipped += original.charAt (i);
        }
        
        System.out.println (original + " has become: " + flipped);
    }
    
}
