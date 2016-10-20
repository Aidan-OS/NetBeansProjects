/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsassignment;

/**
 *
 * @author NehNe
 */
public class Dog extends Pet{
    
    protected boolean neutered;
    protected double barkVolume;
    
    public Dog (int numOfLegs, boolean hotBlooded, boolean isItAcceptableToEatThisPetInTodaysSociety, boolean neutered, double barkVolume)
    {
        super (numOfLegs, hotBlooded, isItAcceptableToEatThisPetInTodaysSociety);
        this.neutered = neutered;
        this.barkVolume = barkVolume;
    }
    
    public void setNeutered (boolean neutered)
    {
        this.neutered = neutered;
    }
    
    public void setBarkVolume (double barkVolume)
    {
        this.barkVolume = barkVolume;
    }
    
    public boolean getNeutered ()
    {
        return (neutered);
    }
    
    public double getBarkVolume ()
    {
        return (barkVolume);
    }
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded + "\nIs It Acceptable To Eat This Pet In Todays Society: " + isItAcceptableToEatThisPetInTodaysSociety + "\nNeutered: " + neutered + "\nBark Volume: " + barkVolume);
    }
    
}
