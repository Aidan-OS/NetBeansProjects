/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiveproblemset;

/**
 *
 * @author NehNe
 */
public class RecursiveProblemset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] data = new int [10];
        
        for (int i = 0; i < data.length - 1; i++)
        {
            data [i] = i;
        }
        
        System.out.println (highestNumber (data, 0, 0));
        
        System.out.println (binaryDecimalInteger (12, ""));
        
        backwardsString ("hello", 0);
        System.out.println ();
        
        String word = "racecar";
        System.out.println (findPalindrome (word, false, 0, word.length () - 1));
        
        
        
    }
    
    public static int highestNumber (int [] data, int n, int at)
    {
        if (at != data.length-1)
        {
            n = highestNumber (data, n + 1, at + 1);
        }
        
        if (n < at)
        {
            n = at;
        }
        
        return n;
          
    }
    
    public static String binaryDecimalInteger (int value, String decimal)
    {
        if (value != 1)
        {
            decimal += binaryDecimalInteger (value / 2, decimal);
        }
        
        if (value % 2 == 0)
        {
            return (decimal + "0");
        }
        
        else
        {
            return (decimal + "1");
        }
        
    }
    
    public static void backwardsString (String word,int pointer)
    {
        if (pointer != word.length () - 1)
        {
            backwardsString (word, pointer + 1);
        }
        
        System.out.print (word.charAt (pointer));
    }
    
    public static boolean findPalindrome (String word, boolean isPalindrome, int start, int end)
    {
        word = word.toLowerCase ();
        if (word.charAt (start) == word.charAt (end) )
        {
            if (start == end)
            {
                isPalindrome = true;
            }
            else
            {
                isPalindrome = findPalindrome (word, isPalindrome, start + 1, end - 1);
            }
        }
        return isPalindrome;
    }
}
