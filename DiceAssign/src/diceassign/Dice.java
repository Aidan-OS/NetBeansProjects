/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceassign;

/**
 *
 * @author NehNe
 */
public class Dice {
    
    private int die1, die2;
    
    public Dice ()
    {
        die1 = (int) (Math.random () * 6) + 1;
        die2 = (int) (Math.random () * 6) + 1;
    }
    
    public void roll ()
    {
        die1 = (int) (Math.random () * 6) + 1;
        die2 = (int) (Math.random () * 6) + 1;
    }
    
    public int getFirst ()
    {
        return (die1);
    }
    
    public int getSecond ()
    {
        return (die2);
    }
    
    @Override
    public String toString ()
    {
        return ("The value of Die 1 is : " + die1 + " and the vaule of Die 2 is : " + die2 + ".");
    }
    
}
