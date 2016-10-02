/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personassign;

/**
 *
 * @author NehNe
 */
public class Person {
    
    private String name;
    private int books;
    private int movies;
    private int sports;
    
    public Person (String initName, int initBooks, int initMovies, int initSports)
    {
        name = initName;
        books = initBooks;
        movies = initMovies;
        sports = initSports;
    }
    
    public String getName ()
    {
        return (name);
    }
    
    public int getBooks ()
    {
        return (books);
    }
    
    public int getMovies ()
    {
        return (movies);
    }
    
    public int getSports ()
    {
        return (sports);
    }
    
    public int compatibility (Person person1)
    {
        int compatibilityFactor = 0;
        //BOOKS
        if (person1.getBooks () > books)
        {
            compatibilityFactor += (person1.getBooks () - books);
        }
        
        else
        {
            compatibilityFactor += (books - person1.getBooks () );
        }
        //MOVIES
        if (person1.getMovies () > movies)
        {
            compatibilityFactor += (person1.getMovies () - movies);
        }
        
        else
        {
            compatibilityFactor += (movies - person1.getMovies () );
        }
        //SPORTS
        if (person1.getSports () > sports)
        {
            compatibilityFactor += (person1.getSports () - sports);
        }
        
        else
        {
            compatibilityFactor += (sports - person1.getSports () );
        }
        
        
       if (compatibilityFactor <= 3)
       {
           return (1);
       }
       
       else if (compatibilityFactor < 6)
       {
           return (2);
       }
       
       else if (compatibilityFactor < 9)
       {
           return (3);
       }
       
       else
       {
           return (4);
       }
        
    }
    
    @Override
    public String toString ()
    {
        return ("The persons name is " + name + "and their intrest ratings are " + books + "," + movies + "," + sports + ".");
    }
}
