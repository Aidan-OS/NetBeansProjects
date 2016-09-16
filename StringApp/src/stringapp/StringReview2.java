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
public class StringReview2 {
    
    public static void question2 (String [] args)
    {
        String word = "HELLO";
        System.out.println ("Enter a word in all caps: " + word);
        
        boolean novowel = true;
        
        for (int i = 0; i <= word.length (); i++)
        {
            if (word.charAt (i) == 'A' || word.charAt (i) == 'E' || word.charAt (i) == 'I' || word.charAt (i) == 'O' || word.charAt (i) == 'U')
            {
                System.out.println ("The first vowel is " + word.charAt (i) + " and it is at location " + (i + 1) + ".");
                novowel = false;
                break;
            }
        }
        
        if (novowel)
        {
            System.out.println ("There are no vowels in this word.");
        }
    }
    
}
