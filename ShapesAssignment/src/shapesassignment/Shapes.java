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
public class Shapes {
    
    protected Color color;
    protected boolean fill;
    
    public Shapes (Color color, boolean fill)
    { 
        this.fill = fill;
        this.color = color;
    }
    
    public void setColor (Color color)
    {
        this.color = color;
    }
    
    public Color getColor ()
    {
        return (color);
    }
    
    public void setFill (boolean fill)
    {
        this.fill = fill;
    }
    
    public boolean getFill ()
    {
        return (fill);
    }
    
    public double getArea ()
    {
        return (-1);
    }
    
    public double getPerimeter ()
    {
        return (-1);
    }
}
