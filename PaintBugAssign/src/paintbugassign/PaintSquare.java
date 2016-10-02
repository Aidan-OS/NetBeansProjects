/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbugassign;
import hsa.PaintBug;
import java.awt.*;

/**
 *
 * @author NehNe
 */
public class PaintSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaintBug paintbug = new PaintBug (150.0, 150.0, 90.0, Color.RED);
        paintbug.move (100.0);
        paintbug.setDirection (0.0);
        paintbug.move (100.0);
        paintbug.setDirection (270.0);
        paintbug.move (100.0);
        paintbug.setDirection (180.0);
        paintbug.move (100.0);
        paintbug.setDirection (45.0);
        paintbug.move (141.4213562373095);
        paintbug.setDirection(180);
        paintbug.move (100.0);
        paintbug.setDirection (315.0);
        paintbug.move (141.4213562373095);
    }
    
}
