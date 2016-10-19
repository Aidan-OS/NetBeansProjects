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
    
    public Pet (int numOfLegs, boolean hotBlooded)
    {
        this.numOfLegs = numOfLegs;
        this.hotBlooded = hotBlooded;
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
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded);
    }
}
