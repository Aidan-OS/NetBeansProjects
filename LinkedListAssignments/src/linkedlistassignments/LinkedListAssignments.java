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
public class LinkedListAssignments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        LinkList list = new LinkList();
       
        LinkEmployeeRecord lpr1 = new LinkEmployeeRecord ("Bob", 1212, 10,30);
        LinkEmployeeRecord lpr2 = new LinkEmployeeRecord ("Anna", 7777,12, 40);
        LinkEmployeeRecord lpr3 = new LinkEmployeeRecord ("Peter", 6565,20,45);
        LinkEmployeeRecord lpr4 = new LinkEmployeeRecord ("Gina", 1234,50,35);
       
        // add nodes
       
        list.addNode(lpr1);
        list.addNode(lpr2);
        list.addNode(lpr3);
       
        list.showList();
       
        // add another node and then print list again
        list.addNode(lpr4);
        list.showList();
        
        System.out.println ();
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.print ("Enter a name you wish to search for: ");
        String key = br.readLine ();
        
        LinkEmployeeRecord foundRecord = list.getNode (key);
        
        if (foundRecord == null)
        {
            System.out.println ("This name is not in the list of records.");
        }
        
        else
        {
            System.out.println (foundRecord.toString());
        }
        
        System.out.println ();
        
        System.out.print ("Please enter the name of the employee you wish to remove: ");
        
        String delete = br.readLine ();
        list.deleteNode (delete);
        
        System.out.println ();
        
        list.showList ();
    }
    
}
