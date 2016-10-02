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
public class Rectangle {
    
    private int length;
    private int width;
    
    public Rectangle (int w, int l)
    {
        length = l;
        width = w;
    }
    
    public int getLength ()
    {
        return (length);
    }
    
    public int getWidth ()
    {
        return (width);
    }
    
    public int area ()
    {
        return (length * width);
    }
    
    public int perimeter ()
    {
        return ( (length * 2) + (width * 2) );
    }
    
    @Override
    public String toString ()
    {
        return ("The length is: " + length + "m and the width is: " + width + "m");
    }
    
}
