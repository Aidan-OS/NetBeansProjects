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
public class StringReview4 {
    
    public static void question4 (String [] args)
    {
        String sentence = "Your life is much better when you are actually living it.";
        System.out.println ("Enter a sentence: " + sentence);
        sentence = sentence.toUpperCase ();
        System.out.println ();
        
        int a = 0, e = 0 , i = 0, o = 0, u = 0;
        
        System.out.println ("VOWEL          FREQUENCY");
        
        for (int t = 0; t < sentence.length (); t++)
        {
            switch (sentence.charAt (t))
            {
                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println ("A              " + a);
        System.out.println ("E              " + e);
        System.out.println ("I              " + i);
        System.out.println ("O              " + o);
        System.out.println ("U              " + u);
        
        
    }
    
}
