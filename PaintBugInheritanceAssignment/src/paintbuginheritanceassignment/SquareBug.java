/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbuginheritanceassignment;
import hsa.*;
import java.awt.*;
/**
 *
 * @author NehNe
 */
public class SquareBug extends PaintBug{
    
    public SquareBug ()
    {
        super ();
    }
    
    public SquareBug (Color color)
    {
        super (color);
    }
    
    public SquareBug (double startX, double startY)
    {
        super (startX, startY);
    }
    
    public SquareBug (double startX, double startY, Color color)
    {
        super (startX, startY, color);
    }
    
    public SquareBug (double startX, double startY, double startDirection, Color color)
    {
        super (startX, startY, startDirection, color);
    }
    
    public SquareBug (int startX, int startY)
    {
        super (startX, startY);
    }
    
    public SquareBug (int startX, int startY, Color color)
    {
        super (startX, startY, color);
    }
    
    public void drawSquare (double distance)
    {
        move (distance);
        turnLeft (90.0);
        move (distance);
        turnLeft (90.0);
        move (distance);
        turnLeft (90.0);
        move (distance);
        turnLeft (90.0);
    }
    
}
