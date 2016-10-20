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
public class Cat extends Pet{
    
    protected boolean neutered;
    protected String furType;
    
    public Cat (int numOfLegs, boolean hotBlooded, boolean neutered, String furType)
    {
        super (numOfLegs, hotBlooded);
        this.neutered = neutered;
        this.furType = furType;
    }
    
    public void setNeutered (boolean neutered)
    {
        this.neutered = neutered;
    }
    
    public void setFurType (String furType)
    {
        this.furType = furType;
    }
    
    public boolean getNeutered ()
    {
        return (neutered);
    }
    
    public String getFurType ()
    {
        return (furType);
    }
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded + "\nNeutered: " + neutered + "\nFur Type: " + furType);
    }
    
}
