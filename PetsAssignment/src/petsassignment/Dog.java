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
    
    protected double runSpeed;
    protected double barkVolume;
    
    public Dog (int numOfLegs, boolean hotBlooded, double runSpeed, double barkVolume)
    {
        super (numOfLegs, hotBlooded);
        this.runSpeed = runSpeed;
        this.barkVolume = barkVolume;
    }
    
    public void setRunSpeed (double runSpeed)
    {
        this.runSpeed = runSpeed;
    }
    
    public void setBarkVolume (double barkVolume)
    {
        this.barkVolume = barkVolume;
    }
    
    public double getRunSpeed ()
    {
        return (runSpeed);
    }
    
    public double getBarkVolume ()
    {
        return (barkVolume);
    }
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded + "Running Speed: " + runSpeed + "\nBark Volume: " + barkVolume);
    }
    
}
