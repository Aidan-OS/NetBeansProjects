/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbuginheritanceassignment;
import java.awt.*;
import hsa.*;

/**
 *
 * @author NehNe
 */
public class UseSquareBug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SquareBug bug1 = new SquareBug (100.0, 100.0, 0.0, Color.RED);
        SquareBug bug2 = new SquareBug (125.0, 75.0, 0.0, Color.BLUE);
        
        bug1.drawSquare (100);
        bug2.drawSquare (50);
    }
    
}
