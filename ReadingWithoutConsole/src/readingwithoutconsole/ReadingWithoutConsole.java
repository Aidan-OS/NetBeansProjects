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
public class ReadingWithoutConsole {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main (String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println ("Question One");
        Question1.q1 (args);
        System.out.println ();
        
        System.out.println ("Question Two");
        Question2.q2 (args);
        System.out.println ();
        
        System.out.println ("Question Three");
        Question3.q3 (args);
        System.out.println ();
        
        System.out.println ("Question Four");
        Question4.q4 (args);
        System.out.println ();
    }
    
}
