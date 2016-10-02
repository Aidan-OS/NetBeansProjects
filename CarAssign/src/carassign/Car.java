/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carassign;

/**
 *
 * @author NehNe
 */
public class Car {
    
    private double mpg;
    private double fuel;
    
    public Car (double entermpg, double initfuel)
    {
        mpg = entermpg;
        fuel = initfuel;
    }
    
    public void addFuel (double input)
    {
        fuel += input;
    }
    
    public boolean travel (double distance)
    {   
        boolean tooFar = false;
        
        if ( (fuel - (distance / mpg) ) < 0 )
        {
            tooFar = true;
        }
        
        else
        {
            fuel = fuel - (distance / mpg);
        }
        
        return (tooFar);
        
    }
    
    @Override
    public String toString ()
    {
        return ("The MPG of the car is " + mpg + " and the current fuel in the car is " + fuel + ".");
    }
    
}
