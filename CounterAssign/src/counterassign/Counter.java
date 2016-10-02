/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterassign;

/**
 *
 * @author NehNe
 */
public class Counter {
    
    private int counter;
    
    public Counter ()
    {
        counter = 0;
    }
    
    public void increment ()
    {
        counter ++;
    }
    
    public void decrement ()
    {
        counter --;
    }
    
    public int getCounter ()
    {
        return (counter);
    }
    
    @Override
    public String toString ()
    {
        return ("The curent value of number is " + counter);
    }
    
}
