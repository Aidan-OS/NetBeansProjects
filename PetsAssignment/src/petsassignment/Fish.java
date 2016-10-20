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
    
    protected double gillEfficiency;
    protected Color scaleColor;
    
    public Fish (int numOfLegs, boolean hotBlooded, boolean isItAcceptableToEatThisPetInTodaysSociety, double gillEfficiency, Color scaleColor)
    {
        super (numOfLegs, hotBlooded, isItAcceptableToEatThisPetInTodaysSociety);
        this.gillEfficiency = gillEfficiency;
        this.scaleColor = scaleColor;
    }
    
    public void setGillEfficiency (double gillEfficiency)
    {
        this.gillEfficiency = gillEfficiency;
    }
    
    public void setScaleColor (Color scaleColor)
    {
        this.scaleColor = scaleColor;
    }
    
    public double getGillEfficiency ()
    {
        return (gillEfficiency);
    }
    
    public Color getScaleColor ()
    {
        return (scaleColor);
    }
    
    @Override
    public String toString ()
    {
        return ("Number of Legs: " + numOfLegs + "\nHot Blooded: " + hotBlooded + "\nIs It Acceptable To Eat This Pet In Todays Society: " + isItAcceptableToEatThisPetInTodaysSociety + "\nGill Efficiency: " + gillEfficiency + "%\nScale Color: " + scaleColor);
    }
    
}
