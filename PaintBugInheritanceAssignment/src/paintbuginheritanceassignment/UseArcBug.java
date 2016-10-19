/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbuginheritanceassignment;

import java.awt.Color;

/**
 *
 * @author NehNe
 */
public class UseArcBug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArcBug bug1 = new ArcBug (100.0, 150.0, 0.0, Color.RED);
        
        for (int i = 0; i <= 360; i++)
        {
            bug1.drawArc (1.0, 1.0);
        }
    }
    
}
