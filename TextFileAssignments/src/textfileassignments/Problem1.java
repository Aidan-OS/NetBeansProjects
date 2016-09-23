/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfileassignments;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        //////////////////////////////////////////QUESTION 1////////////////////////////////////////
        BufferedReader namesfile = new BufferedReader (new FileReader ("names.txt") );
        
        String [] names = new String [5];
        
        for (int i = 0; i < 5; i++)
        {
            names [i] = namesfile.readLine();
            names [i] = names [i].toUpperCase ();
        }
        namesfile.close ();
        
        //////////////////////////////////////////QUESTION 2////////////////////////////////////////
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println (names [i]);
        }
        namesfile.close ();
        
        System.out.println ();
        
        PrintWriter cities = new PrintWriter (new FileWriter ("cities.txt") );
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        
        System.out.println ("Please enter the names of 5 cities:");
        for (int i = 0; i < 5; i ++)
        {
            cities.println (br.readLine () );
        }
        
        cities.close ();
        
        BufferedReader citiesread = new BufferedReader (new FileReader ("cities.txt") );
        
        System.out.println ();
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println (citiesread.readLine () );
        }
        
        citiesread.close ();
        //////////////////////////////////////////QUESTION 3////////////////////////////////////////
        PrintWriter numbersinput = new PrintWriter (new FileWriter ("numbers.txt") );
        
        System.out.println ("Please enter some numbers. I will stop when you enter 0:");
       
        int inputnumber = 0;
        
        do
        {
            
            inputnumber = Integer.parseInt (br.readLine () );
            
            if (inputnumber != 0)
            {
                numbersinput.println (inputnumber);
            }
            
        }while (inputnumber != 0);
        
        System.out.println ();
        
        
        numbersinput.println ("end");
        numbersinput.close ();
        
        BufferedReader numbersoutput = new BufferedReader (new FileReader ("numbers.txt") );
        
        String outputint;
        boolean fileend = false;
        boolean gonethrough = false;
        
        do
        {
            outputint = numbersoutput.readLine ();
            
            if (outputint.equals ("end") )
            {
                fileend = true;
            }
            
            else
            {
                System.out.print (outputint + " ");
                gonethrough = true;
            }
            
        }while (fileend == false);
        
        if (gonethrough == false)
        {
            System.out.println ("You entered no numbers except 0.");
        }
        
        numbersoutput.close ();
        
    }
    
}
