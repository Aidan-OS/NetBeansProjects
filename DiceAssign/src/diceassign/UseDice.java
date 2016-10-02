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
public class UseDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dice dice = new Dice ();
                
        System.out.println (dice.toString() );
        
        dice.roll();
        
        System.out.println ("Die 1: " + dice.getFirst() );
        System.out.println ("Die 2: " + dice.getSecond() );
        
        dice.roll ();
        
        System.out.println (dice.toString () );
        
    }
    
}
