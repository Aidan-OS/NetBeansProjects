/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesassignment;
import java.awt.*;

/**
 *
 * @author NehNe
 */
public class UseShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c = new Circle (Color.RED, true, 5);
        Triangle t = new Triangle (Color.BLUE, false, 5, 3, 6, 6);
        Square s = new Square (Color.YELLOW, true, 10, 20);
        
        System.out.println (c.toString ());
        System.out.println (t.toString ());
        System.out.println (s.toString ());
        
    }
    
}
