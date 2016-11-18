/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecords;
import java.io.*;
/**
 *
 * @author NehNe
 */
public class UseStudentRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        StudentRecord [] students = new StudentRecord [26];
        RandomAccessFile raf = new RandomAccessFile ("StudentRecord.bin", "rw");
        
        for (int i = 0; i < students.length; i++)
        {
            int [] mark = new int [4];
            for (int j = 0; j < 4; j++)
            {
                mark [j] = (int) (Math.random () * 100);
            }
            
            String name = (char) (65 + i) + "";
            
            students [i] = new StudentRecord (name, mark, -1.0);
            
            byte [] nameBytes = new byte [16];
            students [i].getName().getBytes(0, name.length(), nameBytes, 0);
            
            raf.seek (i * 40);
            
            raf.write (nameBytes);
            raf.writeInt (students [i].getMark() [0]);
            raf.writeInt (students [i].getMark() [1]);
            raf.writeInt (students [i].getMark() [2]);
            raf.writeInt (students [i].getMark() [3]);
            raf.writeDouble (students [i].getAverage());
        }
        
        for (int i = 0; i < 26; i++)
        {
            raf.seek ((i*40) + 16);
            
            int prepAverage = 0;
            
            for (int j = 0; j < 4; j++)
            {
                prepAverage += raf.readInt ();
            }
            
            double average = prepAverage / 4.0;
            
            raf.seek ((i*40) + 32);
                    
            raf.writeDouble (average);  
        }
        
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.print ("Please eneter the name you wish to search for: ");
        String choice = br.readLine ();
        choice = choice.toUpperCase ();
        
        boolean found = false;
        
        for (int i = 0; i < 26; i++)
        {
            raf.seek (i * 40);
            byte [] byteName = new byte [16];
            raf.read(byteName);
            
            String name = new String (byteName, 0);
            name = name.toUpperCase();
            name = name.trim();
            
            if (name.equals (choice))
            {
                found = true;
                break;
            }
        }
        
        if (found)
        {
            System.out.println ("Mark 1: " + raf.readInt ());
            System.out.println ("Mark 2: " + raf.readInt ());
            System.out.println ("Mark 3: " + raf.readInt ());
            System.out.println ("Mark 4: " + raf.readInt ());
            System.out.println ("Average: " + raf.readDouble ());
        }
        
        else
        {
            System.out.println ("This student is not in the database.");
        }
    }
    
}
