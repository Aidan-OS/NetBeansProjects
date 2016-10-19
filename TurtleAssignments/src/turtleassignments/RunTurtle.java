/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtleassignments;

import hsa.*;
import java.awt.*;
/**
 *
 * @author NehNe
 */
public class RunTurtle {
    
    static Console c = new Console ();
    static Turtle t = new Turtle (c);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 100; i++)
        {
            int r = (int) (Math.random () * (250) + 1);
            int g = (int) (Math.random () * (250) + 1);
            int b = (int) (Math.random () * (250) + 1);
            
            int s = (int) (Math.random () * (30) + 1);
            
            Color randomC = new Color (r, g, b);
            
            int x = (int) (Math.random () * (620));
            int y = (int) (Math.random () * (470));
                    
            square (x, y, s, randomC);
            
            delay (100 - (i) );
            
            
        }
        
        c.clear ();
        
        for (int i = 0; i < 20; i++)
        {
            int r = (int) (Math.random () * (250) + 1);
            int g = (int) (Math.random () * (250) + 1);
            int b = (int) (Math.random () * (250) + 1);
            
            int s = (int) (Math.random () * (30) + 10);
            
            Color randomC = new Color (r, g, b);
            
            int x = (int) (Math.random () * (620));
            int y = (int) (Math.random () * (470));
            
            drawMoon (x, y, s, randomC);
            
            delay (100 - (i) );
        }
        
        c.clear ();
        
        t.setColor (Color.BLACK);
        
        int size = 500;
        int numberOfHouses = 5;
        
        for (int row = 500; row >= size; row -= size)
        {
            size = (int) (size / 2.0);
            for (int col = 0; col < (numberOfHouses * size); col += size)
            {
                drawHouse (col, row, size);
            }
            
            if (size == 0)
            {
                break;
            }
            
            numberOfHouses = numberOfHouses * 2;
        }
        
        delay (3000);
        
        c.clear ();
        
        FatTurtle turtle1 = new FatTurtle (c);
        FatTurtle turtle2 = new FatTurtle (c);
        FatTurtle turtle3 = new FatTurtle (c);
        
        turtle1.setColor (Color.RED);
        turtle2.setColor (Color.BLUE);
        turtle3.setColor (Color.YELLOW);
        
        turtle1.setLineWidth (5);
        turtle2.setLineWidth (5);
        turtle3.setLineWidth (5);
        
        for (int i = 0; i < 25; i++)
        {
            for (int p = 0; p < 3; p++)
            {
                int angle = (int) (Math.random () * (3) + 1);
                switch (angle)
                {
                    case 1: 
                    {
                        switch (p)
                        {
                            case 0:
                            {
                                turtle1.setAngle (0);
                                break;
                            }
                            
                            case 1: 
                            {
                                turtle2.setAngle (0);
                                break;
                            }
                            
                            case 2:
                            {
                                turtle3.setAngle (0);
                                break;
                            }
                        }
                        break;
                    }
                    
                    case 2:
                    {
                        switch (p)
                        {
                            case 0:
                            {
                                turtle1.setAngle (90);
                                break;
                            }
                            
                            case 1: 
                            {
                                turtle2.setAngle (90);
                                break;
                            }
                            
                            case 2:
                            {
                                turtle3.setAngle (90);
                                break;
                            }
                        }
                        break;
                    }
                    
                    case 3:
                    {
                        switch (p)
                        {
                            case 0:
                            {
                                turtle1.setAngle (180);
                                break;
                            }
                            
                            case 1: 
                            {
                                turtle2.setAngle (180);
                                break;
                            }
                            
                            case 2:
                            {
                                turtle3.setAngle (180);
                                break;
                            }
                        }
                        break;
                    }
                    
                    case 4:
                    {
                        switch (p)
                        {
                            case 0:
                            {
                                turtle1.setAngle (270);
                                break;
                            }
                            
                            case 1: 
                            {
                                turtle2.setAngle (270);
                                break;
                            }
                            
                            case 2:
                            {
                                turtle3.setAngle (270);
                                break;
                            }
                        }
                        break;
                    }
                }
            
            }
            
            turtle1.move (5);
            turtle2.move (5);
            turtle3.move (5);
            
            delay (100);
        }
        
        delay (3000);
        c.clear ();
        
        TurtleDash dash = new TurtleDash (c);
        
        dash.setColor (Color.BLUE);
        
        for (int i = 0; i < 4; i++)
        {
            dash.move (c.getHeight () / 4);
            dash.turnLeft (90);
        }
    }
    
    public static void square (int x, int y, int s, Color color)
    {
        t.setPosition (x, y);
        t.setAngle (0);
        t.setColor (color);
        for (int i = 0; i < 4; i++)
        {
            t.move (s);
            t.turnRight (90);
        }
    }
    
    
   public static void drawMoon (int x, int y, int s, Color color)
    {
        t.setPosition (x, y);
        t.setColor (color);
        
        for (int i = 1; i <= 36; i++)
        {
            for (int p = 0; p < 4; p++)
            {
                t.move (s);
                t.turnRight (90);
            }
            t.turnRight (10);
            t.setPosition (x, y);
        }
    }
   
   public static void drawHouse (int x, int y, int s)
   {
       t.setPosition (x + (s/2), y );
       t.setAngle (-45);
       int half = s/2;
       int quarter = s/4;
       
       int roof = (int) Math.sqrt ( (half * half) + (half * half) );
       
       t.move (roof);
       
       t.setAngle (270);
       t.move (s);
       
       t.setAngle (180);
       t.move (s);
       
       t.setAngle (90);
       t.move (s);
       
       t.setAngle (45);
       t.move (roof);
       
       t.setPosition (x + (half - (quarter / 2) ), y + (s - quarter ) );
       t.setAngle (0);
       t.move (quarter);
       
       t.setAngle (270);
       t.move (quarter);
       
       t.setAngle (180);
       t.move (quarter);
       
       t.setAngle (90);
       t.move (quarter);
       
   }
   
   public static void delay (int millisecs)
    {
        try
        {
            Thread.currentThread ().sleep (millisecs);
        }
        
        catch (InterruptedException e)
        {   
        }
    }
    
}
