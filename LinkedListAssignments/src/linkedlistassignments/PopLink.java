/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistassignments;

/**
 *
 * @author NehNe
 */
public class PopLink {
    
    protected PopCity top;

    // start a null list

    public PopLink ()
    {
	top = null;
    }


    // add a LinkEmployeeRecord object to the end of the list

    public void addNode (PopCity city)
    {
	if (top == null)
	{
	    top = city;
	}
	else
	{
	    PopCity current = null;
	    current = top;
            
	    while (current.getNextPopCity () != null)
	    {
		current = current.getNextPopCity ();
	    }
	    current.setNextPopCity (city);
	}
    }


    // display the linked list

    public void showList ()
    {
	if (top == null)
	{
	    System.out.println ("Empty list ");
	}
	else
	{
	    System.out.println ("The current list:");

	    PopCity current;
	    current = top;

	    while (current.getNextPopCity () != null)
	    {
		System.out.println (current.getName () + " " + current.getPopulation ());
		current = current.getNextPopCity ();
	    }
	    System.out.println (current.getName () + " " + current.getPopulation ());
	    System.out.println ("*******");
	}
    }
    
    public PopCity getNode (String key)
    {
        PopCity current = null;
        current = top;
        do
        { 
            if (key.equals (current.getName()))
            {
                break;
            }
            
            current = current.getNextPopCity();
            
        }while (current != null);
        
        return (current);
    }
    
    public void deleteNode (String key)
    {
        PopCity current = null;
        current = top;
        int cityNumber = 0;//Tracks which one in the list the program is at
        
        do
        {
            if (key.equals (current.getName()))
            {
                if (current.getNextPopCity () == null)//Deleting the last in the List
                {
                    current = top;
                    for (int i = 0; i < cityNumber - 1; i++)
                    {
                        current = current.getNextPopCity();
                    }
                    current.setNextPopCity (null);
                }
                
                else if (current == top)//Deleting the first in the List
                {
                    top = current.getNextPopCity();
                }
                
                else//Deleting anything else in the list
                {
                    PopCity beforeCurrentRecord = top;
                    
                    for (int i = 0; i < cityNumber - 1; i++)
                    {
                        beforeCurrentRecord = beforeCurrentRecord.getNextPopCity ();
                    }
                    
                    PopCity afterCurrentRecord = top;
                    
                    for (int i = 0; i < cityNumber + 1; i++)
                    {
                        afterCurrentRecord = afterCurrentRecord.getNextPopCity ();
                    }
                    
                    beforeCurrentRecord.setNextPopCity (afterCurrentRecord);
                }
                break;
            }
            cityNumber ++;
            current = current.getNextPopCity ();
        }while (current != null);
    }
}
