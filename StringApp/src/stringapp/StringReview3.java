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
public class StringReview3 {
    
    public static void question3 (String [] args)
    {
        String word = "SCHMETTERLING";
        String pattern = "TER";
        System.out.println ("Your word is: " + word);
        System.out.println ("The patter to search for is: " + pattern);
        
        int patternstart;
        patternstart = word.indexOf (pattern);
        
        if (patternstart == -1)
        {
            System.out.println ("The pattern \"" + pattern + "\" is not in the word \"" + word + "\".");
        }
        
        else
        {
            System.out.println ("The pattern \"" + pattern + "\" starts at position " + patternstart + ".");
        }
        
    }
    
}
