/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportassign;

/**
 *
 * @author NehNe
 */
public class Airplane {
    
    private double x;
    private double y;
    
    public Airplane (double initx, double inity)
    {
        x = initx;
        y = inity;
    }
    
    public void fly (double angle, double distance)
    {
        x += Math.cos (Math.toRadians (angle) ) * distance;
        y -= Math.sin (Math.toRadians (angle) ) * distance;
    }
    
    public double getX ()
    {
        return (x);
    }
    
    public double getY ()
    {
        return (y);
    }
    
    public double distanceBetween (Airplane plane)
    {
        double changeInX;
        double changeInY;
        double distance;
        
        changeInX = x - (plane.getX () );
        changeInY = y - (plane.getY () );
        
        if (changeInX < 0)
        {
            changeInX = changeInX * (-1);
        }
        
        if (changeInY < 0)
        {
            changeInY = changeInY * (-1);
        }
        
        distance = Math.sqrt ( (changeInX * changeInX) + (changeInY * changeInY) );
        
        return (distance);
    }
    
}
