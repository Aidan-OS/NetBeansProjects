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
public class PopCity {
    
    protected String name;
    protected double population;
    protected PopCity nextPopCity;
    
    public PopCity (String name, double population)
    {
        this.name = name;
        this.population = population;
        nextPopCity = null;
    }
    
    public PopCity getNextPopCity ()
    {
        return (nextPopCity);
    }
    
    public void setNextPopCity (PopCity nextPopCity)
    {
        this.nextPopCity = nextPopCity;
    }
    
    public String getName ()
    {
        return (name);
    }
    
    public void setName (String name)
    {
        this.name = name;
    }
    
    public double getPopulation ()
    {
        return (population);
    }
    
    public void setPopulation (double population)
    {
        this.population = population;
    }
    
    @Override
    public String toString ()
    {
        return ("City Name: " + name + "\nPopulation: " + population);
    }
}
