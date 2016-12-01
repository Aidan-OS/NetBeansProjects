/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistassignments;
import java.io.*;
/**
 *
 * @author NehNe
 */
public class UsePopCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        BufferedReader fr = new BufferedReader (new FileReader ("city.txt"));
        
        PopCity pc;
        PopLink list = new PopLink ();
        
        for (int i = 0; i < 25; i++)
        {
            pc = new PopCity (fr.readLine (), Double.parseDouble (fr.readLine () ) );
            list.addNode (pc);
        }
        
        list.showList ();
        System.out.println ();
        
        pc = new PopCity ("Oakville(ON)", 100.1);
        list.addNode (pc);
        
        list.showList ();
        System.out.println ();
        
        pc = list.getNode ("Calgary(AB)");
        System.out.println (pc.toString ());
        System.out.println ();
        
        list.deleteNode ("Sudbury(ON)");
        
        list.showList ();
        
        list.sortListByPop ();
        
        System.out.println ("THIS IS THE SORTED LIST");
        list.showList ();
        
    }
    
}
