/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsassignment;
import java.awt.*;

/**
 *
 * @author NehNe
 */
public class UsePet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat c = new Cat (4, true, false, "Long");
        Fish f = new Fish (0, false, 98.5, Color.PINK);
        Dog d = new Dog (4, true, true, 5.6);
        
        System.out.println ("Cat");
        System.out.println (c.toString () );
        
        System.out.println ("\nFish");
        System.out.println (f.toString () );
        
        System.out.println ("\nDog");
        System.out.println (d.toString () );
    }
    
}
