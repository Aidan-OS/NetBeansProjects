/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleassign;

/**
 *
 * @author NehNe
 */
public class UseRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rect = new Rectangle (100, 50);
        
        System.out.println ("The area of the rectangle is: " + rect.area() + "m^2");
        System.out.println ("The perimeter of the rectangle is: " + rect.perimeter() + "m" );
        System.out.println (rect.toString () );
    }
    
}
