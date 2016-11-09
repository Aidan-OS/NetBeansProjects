/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songdatabase;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class SongDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
	// TODO code application logic here
	BufferedReader fr = new BufferedReader (new FileReader ("Songs.txt"));
	
	String [] [] songList = new String [20] [2];
	
	for (int i = 0; i < songList.length; i++)
	{
	    for (int j = 0; j < 2; j++)
	    {
		songList [i] [j] = fr.readLine().toLowerCase();
	    }
	    
	}
	fr.close ();
	
	bubbleSort2DStringArray (songList);
	
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	System.out.print ("Please enter an artist to search for: ");
	String artist = br.readLine ();
	artist = artist.toLowerCase();
        
        boolean through = false;
        boolean through2 = false;
	
	int location = twoDArraySearch (songList, artist);
	
	if (songList [location] [1].equals (songList [location + 1] [1]))
	{
            through = true;
	    System.out.println ("The artist \"" + artist + "\" has the songs:");
	    int k = 0;
	    while (songList [location] [1].equals (songList [location + k] [1]) )
	    {
		System.out.println (songList [location + k] [0]);
		k++;
	    }
	}
        
        if (location != 0)
        {
            if (songList [location] [1].equals (songList [location - 1] [1]) )
            {
                int k;
                through2 = true;
            
                if (through)
                {
                    k = 1;
                }
            
                else
                {
                    System.out.println ("The artist \"" + artist + "\" has the songs:");
                    k = 0;
                }
                while (songList [location] [1].equals (songList [location - k] [1]) )
                {
                    System.out.println (songList [location - k] [0]);
                    k++;
                }
	
                System.out.println ("in this database.");
            }
        }
        
	else if (location != -1)
	{
	    System.out.println ("The artist \"" + artist + "\" has the song " + songList [location] [0] + " in this database");
	}
	
	else
	{
	    System.out.println ("This Artist is not in the database");
	}
        
        if (through2 = false)
        {
            System.out.println ("in this database.");
        }
	
        /*
        System.out.println ();
	for (int i = 0; i < 20; i++)
	{
	    for (int j = 0; j < 2; j++)
	    {
		System.out.print (songList [i] [j] + " ");
	    }
	    System.out.println ();
	    
	}*/
	
	
    }
    
    public static void bubbleSort2DStringArray (String data [] [])
    {
	boolean switched = true;
	String temp;
	
	while (switched)
	{
	    switched = false;
	    for (int i = 0; i < data.length - 1; i++)
	    {
		if (data [i] [1].compareTo (data [i + 1] [1]) > 0 )
		{
		    switched = true;
		    
		    temp = data [i] [0];
		    data [i] [0] = data [i+1] [0];
		    data [i+1] [0] = temp;
		
		    temp = data [i] [1];
		    data [i] [1] = data [i+1] [1];
		    data [i+1][1] = temp;
		}
	    }
	    
	}
    }
    
    public static int twoDArraySearch (String data [] [], String key)
    {
	int bottom = data.length - 1;
	int top = 0;
	int middle;
	
	while (true)
	{
	    if (top > bottom)
	    {
		return -1;
	    }
	    
	    middle = (top + bottom) / 2;
	    
	    if (key.compareTo (data [middle] [1]) < 0)
	    {
		bottom = middle - 1;
	    }
	    
	    else if (key.compareTo (data [middle] [1]) > 0)
	    {
		top = middle + 1;
	    }
	    
	    else 
	    {
		return (middle);
	    }
	}
    }
    
}
