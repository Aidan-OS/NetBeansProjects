/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsassignment;
import java.awt.*;

/**
 *
 * @author NehNe
 */
public class Fish extends Pet{
    
    protected double swimSpeed;
    protected Color scaleColor;
    
    public Fish (int numOfLegs, boolean hotBlooded, double swimSpeed, Color scaleColor)
    {
        super (numOfLegs, hotBlooded);
        this.swimSpeed = swimSpeed;
        this.scaleColor = scaleColor;
    }
    
    public void setSwimSpeed (double swimSpeed)
    {
        this.swimSpeed = swimSpeed;
    }
    
    public void setScaleColor (Color scaleColor)
    {
        this.scaleColor = scaleColor;
    }
    
    public double getSwimSpeed ()
    {
        return (swimSpeed);
    }
    
    public Color getScaleColor ()
    {
        return (scaleColor);
    }
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded + "Swim Speed: " + swimSpeed + "\nScale Color: " + scaleColor);
    }
    
}
