/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtleassignments;
import hsa.Console;

/**
 *
 * @author NehNe
 */
public class TurtleDash extends Turtle
{
    protected boolean dot;
    
    public TurtleDash (Console c)
    {
        super (c);
        dot = true;
    }
    
    @Override
    public void move (int distance)
    {   
        int newx, newy;
	double rAngle = (angle * Math.PI) / 180;
	newx = (int) Math.round (x + Math.cos (rAngle) * distance);
	newy = (int) Math.round (y - Math.sin (rAngle) * distance);
        
        if (showing)
	{
	    c.setColor (clr);
            
            for (int i = 0; i < (distance / 5); i++)
            {
                int dotx = (int) Math.round (x + Math.cos (rAngle) * 5);
                int doty = (int) Math.round (y - Math.sin (rAngle) * 5);
                
                if (dot)
                {
                    c.drawLine (x, y, dotx, doty);
                }
                
                x = dotx;
                y = doty;
                
                dot = !dot;
            }
	    c.drawLine (x, y, newx, newy);
	}
        
	x = newx;
	y = newy;
    }
        
    
    
}
