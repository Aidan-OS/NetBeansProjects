/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesassignment;
import java.awt.*;

/**
 *
 * @author NehNe
 */
public class Triangle extends Shapes{
    
    protected double base;
    protected double height;
    protected double side1;
    protected double side2;
    
    public Triangle (Color color, boolean fill, double base, double height, double side1, double side2)
    {
        super (color, fill);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        
    }
    
    public double getBase ()
    {
        return (base);
    }
    
    public double getHeight ()
    {
        return (height);
    }
    
    public double getSide1 ()
    {
        return (side1);
    }
    
    public double getSide2 ()
    {
        return (side2);
    }
    
    @Override
    public double getArea ()
    {
        return ( (base * height) / 2);
    }
    
    @Override
    public double getPerimeter ()
    {
        return (base + side1 + side2);
    }
    
    public void setBase (double base)
    {
        this.base = base;
    }
    
    public void setHeight (double height)
    {
        this.height = height;
    }
    
    public void setSide1 (double side1)
    {
        this.side1 = side1;
    }
    
    public void setSide2 (double side2)
    {
        this.side2 = side2;
    }
    
    @Override
    public String toString ()
    {
        return ("Base: " + base + "\nHeight: " + height + "\nSide 1: " + side1 + "\nSide 2: " + side2);
    }
    
}
