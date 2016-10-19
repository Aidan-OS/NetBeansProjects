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
    
    protected double runSpeed;
    protected String furType;
    
    public Cat (int numOfLegs, boolean hotBlooded, double runSpeed, String furType)
    {
        super (numOfLegs, hotBlooded);
        this.runSpeed = runSpeed;
        this.furType = furType;
    }
    
    public void setRunSpeed (double runSpeed)
    {
        this.runSpeed = runSpeed;
    }
    
    public void setFurType (String furType)
    {
        this.furType = furType;
    }
    
    public double getRunSpeed ()
    {
        return (runSpeed);
    }
    
    public String getFurType ()
    {
        return (furType);
    }
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded + "Run Speed: " + runSpeed + "\nFur Type: " + furType);
    }
    
}
