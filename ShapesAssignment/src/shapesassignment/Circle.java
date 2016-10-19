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
public class Circle extends Shapes
{
    protected double radius;
    
    /**
     *
     * @param color
     * @param fill
     * @param radius
     */
    public Circle (Color color, boolean fill, double radius)
    {
        super (color, fill);
        this.radius = radius;
    }
    
    /**
     *
     * @param radius
     */
    public void setRadius (double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius ()
    {
        return (radius);
    }
    
    @Override
    public double getPerimeter ()
    {
        return (Math.PI * (radius * 2) );
    }
    
    @Override
    public double getArea ()
    {
        return (Math.PI * (radius * radius) );
    }
    
    @Override
    public String toString ()
    {
        return ("Radius: " + radius);
    }
}
