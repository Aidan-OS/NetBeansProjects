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
public class ArrayPractice {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        // TODO code application logic here
        
        int [] numbers = new int [5];
        String [] [] students = new String [5] [3];
        
        System.out.println ("Question 1A");
        numbers = Question1.q1a (args);
        System.out.println ();
        
        System.out.println ("Question 1B");
        Question1.q1b (numbers);
        System.out.println ();
        
        System.out.println ("Question 1C");
        Question1.q1c (numbers);
        System.out.println ();
        
        System.out.println ("Question 2A");
        students = Question2.q2a (args);
        System.out.println ();
        
        System.out.println ("Question 2B");
        Question2.q2b (students);
        System.out.println ();
        
        
    }
    
}
