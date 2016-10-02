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
public class UseCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter counter = new Counter ();
        
        for (int i = 0; i < ( (int) (Math.random () * (100) + 1) ); i++)
        {
            counter.increment();
        }
        
        System.out.println ("Counter's vaule is: " + counter.getCounter() );
        
        for (int i = 0; i < ( (int) (Math.random () * (100) + 1) ); i++)
        {
            counter.decrement();
        }
        
        System.out.println ("Counter's value is now: " + counter.getCounter() );
    }
    
}
