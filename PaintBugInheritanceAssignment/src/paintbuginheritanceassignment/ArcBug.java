/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbuginheritanceassignment;

import java.awt.Color;
import hsa.*;

/**
 *
 * @author NehNe
 */
public class ArcBug extends PaintBug {
    
    public ArcBug ()
    {
        super ();
    }
    
    public ArcBug (Color color)
    {
        super (color);
    }
    
    public ArcBug (double startX, double startY)
    {
        super (startX, startY);
    }
    
    public ArcBug (double startX, double startY, Color color)
    {
        super (startX, startY, color);
    }
    
    public ArcBug (double startX, double startY, double startDirection, Color color)
    {
        super (startX, startY, startDirection, color);
    }
    
    public ArcBug (int startX, int startY)
    {
        super (startX, startY);
    }
    
    public ArcBug (int startX, int startY, Color color)
    {
        super (startX, startY, color);
    }
    
    public void drawArc (double distance, double angle)
    {
        move (distance);
        turnLeft (angle);
    }
}
