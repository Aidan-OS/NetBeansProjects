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
public class Pet {
    
    protected int numOfLegs;
    protected boolean hotBlooded;
    protected boolean isItAcceptableToEatThisPetInTodaysSociety;
    
    public Pet (int numOfLegs, boolean hotBlooded, boolean isItAcceptableToEatThisPetInTodaysSociety)
    {
        this.numOfLegs = numOfLegs;
        this.hotBlooded = hotBlooded;
        this.isItAcceptableToEatThisPetInTodaysSociety = isItAcceptableToEatThisPetInTodaysSociety;
    }
    
    public void setLegs (int numOfLegs)
    {
        this.numOfLegs = numOfLegs;
    }
    
    public void setHotBlooded (boolean hotBlooded)
    {
        this.hotBlooded = hotBlooded;
    }
    
    public int getLegs ()
    {
        return (numOfLegs);
    }
    
    public boolean getHotBlooded ()
    {
        return (hotBlooded);
    }
    
    public void setIsItAcceptableToEatThisPetInTodaysSociety (boolean isItAcceptableToEatThisPetInTodaysSociety)
    {
        this.isItAcceptableToEatThisPetInTodaysSociety = isItAcceptableToEatThisPetInTodaysSociety;
    }
    
    public boolean getIsItAcceptableToEatThisPetInTodaysSociety ()
    {
        return (isItAcceptableToEatThisPetInTodaysSociety);
    }
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded + "\nIs It Acceptable To Eat This Pet In Todays Society: " + isItAcceptableToEatThisPetInTodaysSociety);
    }
}
