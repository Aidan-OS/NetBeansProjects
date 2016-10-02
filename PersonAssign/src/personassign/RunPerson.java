/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personassign;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class RunPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        
        System.out.println ("Please enter the name and a rating of 0 - 5 on the topics of books, movies, and sports");
        Person person1 = new Person (br.readLine (), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ) );
        
        System.out.println ();
        
        System.out.println ("Please enter the name of a second person and a rating of 0 - 5 on the topics of books, movies, and sports");
        Person person2 = new Person (br.readLine (), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ) );
        
        System.out.println ();
        
        System.out.println ("Please enter the name of a third person and a rating of 0 - 5 on the topics of books, movies, and sports");
        Person person3 = new Person (br.readLine (), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ) );
        
        System.out.println ();
        
        System.out.println ("Please enter the name of a fourth person and a rating of 0 - 5 on the topics of books, movies, and sports");
        Person person4 = new Person (br.readLine (), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ), Integer.parseInt (br.readLine () ) );
        
        System.out.println ();
        
        //PERSON 1
        System.out.println (person1.getName() + " compatibility");
        System.out.println (person2.getName() + " " + person1.compatibility(person2) );
        System.out.println (person3.getName() + " " + person1.compatibility(person3) );
        System.out.println (person4.getName() + " " + person1.compatibility(person4) );
        
        System.out.println ();
        
        //PERSON 2
        System.out.println (person2.getName() + " compatibility");
        System.out.println (person1.getName() + " " + person2.compatibility(person1) );
        System.out.println (person3.getName() + " " + person2.compatibility(person3) );
        System.out.println (person4.getName() + " " + person2.compatibility(person4) );
        
        System.out.println ();
        
        //PERSON 3
        System.out.println (person3.getName() + " compatibility");
        System.out.println (person1.getName() + " " + person3.compatibility(person1) );
        System.out.println (person2.getName() + " " + person3.compatibility(person2) );
        System.out.println (person4.getName() + " " + person3.compatibility(person4) );
        
        System.out.println ();
        
        //PERSON 4
        System.out.println (person4.getName() + " compatibility");
        System.out.println (person1.getName() + " " + person4.compatibility(person1) );
        System.out.println (person2.getName() + " " + person4.compatibility(person2) );
        System.out.println (person3.getName() + " " + person4.compatibility(person3) );
        
    }
    
}
