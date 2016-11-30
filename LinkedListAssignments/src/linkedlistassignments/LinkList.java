package linkedlistassignments;

public class LinkList
{
    protected LinkEmployeeRecord top;

    // start a null list

    public LinkList ()
    {
	top = null;
    }


    // add a LinkEmployeeRecord object to the end of the list

    public void addNode (LinkEmployeeRecord lpr)
    {
	if (top == null)
	{
	    top = lpr;
	}
	else
	{
	    LinkEmployeeRecord current = null;
	    current = top;
            
	    while (current.getNext () != null)
	    {
		current = current.getNext ();
	    }
	    current.setNext (lpr);
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

	    LinkEmployeeRecord current;
	    current = top;

	    while (current.getNext () != null)
	    {
		System.out.println (current.getName () + " " + current.getEmpNum ());
		current = current.getNext ();
	    }
	    System.out.println (current.getName () + " " + current.getEmpNum ());
	    System.out.println ("*******");
	}
    }
    
    public LinkEmployeeRecord getNode (String key)
    {
        LinkEmployeeRecord current = null;
        current = top;
        do
        { 
            if (key.equals (current.getName()))
            {
                break;
            }
            
            current = current.getNext();
            
        }while (current != null);
        
        return (current);
    }
    
    public void deleteNode (String key)
    {
        LinkEmployeeRecord current = null;
        current = top;
        int recordNumber = 0;//Tracks which one in the list the program is at
        
        do
        {
            if (key.equals (current.getName()))
            {
                if (current.getNext () == null)//Deleting the last in the List
                {
                    current = top;
                    for (int i = 0; i < recordNumber - 1; i++)
                    {
                        current = current.getNext();
                    }
                    current.setNext (null);
                }
                
                else if (current == top)//Deleting the first in the List
                {
                    top = current.getNext();
                }
                
                else//Deleting anything else in the list
                {
                    for (int i = 0; i < recordNumber - 1; i++)//Finds the record before the one to be removed
                    {
                        current = current.getNext ();
                    }
                    
                    LinkEmployeeRecord oneAfterToBeDeleted = top;
                    
                    for (int i = 0; i <= recordNumber + 1; i++)//Finds Record after one to be removed
                    {
                        oneAfterToBeDeleted = oneAfterToBeDeleted.getNext ();
                    }
                    
                    current.setNext (oneAfterToBeDeleted);//Sets the next for the one before to the one after
                }
                break;
            }
            recordNumber ++;
            current = current.getNext ();
        }while (current != null);
    }
}



