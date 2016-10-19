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
public class Square extends Shapes{
    
    protected double width;
    protected double length;
    
    public Square (Color color, boolean fill, double width, double length)
    {
        super (color, fill);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth ()
    {
        return (width);
    }
    
    public double getLength ()
    {
        return (length);
    }
    
    @Override
    public double getPerimeter ()
    {
        return (width + width + length + length);
    }
    
    @Override
    public double getArea ()
    {
        return (length * width);
    }
    
    public void setWidth (double width)
    {
        this.width = width;
    }
    
    public void setLength (double length)
    {
        this.length = length;
    }
    
    @Override
    public String toString ()
    {
        return ("Width: " + width + "\nLength: " + length);
    }
    
}
