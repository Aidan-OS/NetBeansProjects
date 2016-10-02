/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carassign;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class RunCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
        
        System.out.println ("Please input the MPG of your car and then the initial amount of fuel in your car.");
        
        Car myCar = new Car ((Double.parseDouble (br.readLine ()) ), (Double.parseDouble (br.readLine ()) ) );
        
        boolean quit = false;
        String input;
        
        do
        {
            System.out.println ("What do you want to do with your car? You can Travel, Add Fuel or Quit.");
            input = br.readLine ();
            input = input.toUpperCase();
            
            if (input.equals ("TRAVEL") )
            {
                System.out.print ("Enter how many miles you want to travel: ");
                if (myCar.travel (Double.parseDouble (br.readLine () ) ) )
                {
                    System.out.println ("You cannot travel that far!");
                }
                
                else
                {
                    System.out.println ("You travel the selected distance");
                }
            }
            
            else if (input.equals ("ADD FUEL" ))
            {
                System.out.print ("Enter how much fuel you want to add: ");
                myCar.addFuel (Double.parseDouble (br.readLine () ) );
            }
            
            else if (input.equals("QUIT"))
            {
                quit = true;
            }
            
            else
            {
                System.out.println ("Please enter either Travel, Add Fuel, or Quit");
            }
            
        } while (quit == false);
        
    }
    
}
