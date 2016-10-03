/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportassign;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class FindAirport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        
        double portX = (int) (Math.random() * (1000) );
        double portY = (int) (Math.random() * (1000) );
        
        double planeX = (int) (Math.random() * (1000) );
        double planeY = (int) (Math.random() * (1000) );
        
        Airplane airport = new Airplane (portX, portY);
        Airplane plane = new Airplane (planeX, planeY);
        
        boolean in5Miles = false;
        
        System.out.println ("You are a pilot trying to get to an Airport. You may chose your direction (0 being right, 90 being down, 180 being left, and 270 being up)");
        System.out.println ("and your distance that you want to travel. Your goal is to get to the airport.");
        System.out.println ();
        
        do
        {
            double direction;
            double distance;
            
            System.out.println ("You are " + plane.distanceBetween(airport) + " miles from the airport.");
            
            System.out.print ("Direction: ");
            direction = Double.parseDouble (br.readLine () );
            
            System.out.print ("Distance: ");
            distance = Double.parseDouble (br.readLine () );
            
            plane.fly (direction, distance);
            
            if (plane.distanceBetween (airport) <= 5)
            {
                in5Miles = true;
                System.out.println ("You are close enough to the airport to land!");
            }
            
        }while (in5Miles == false);
        
    }
    
}
