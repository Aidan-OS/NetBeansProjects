/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecordarray;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class RunEmployeeRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader fr = new BufferedReader (new FileReader ("employees.txt") );
        
        Employee [] emp = new Employee [Integer.parseInt (fr.readLine ()) ]; //First thing in file will be a number saying how many employees
        
        for (int i = 0; i < emp.length; i++)//Brings in employee Info from file
        {
            emp [i] = new Employee (fr.readLine (), Integer.parseInt (fr.readLine () ), Double.parseDouble(fr.readLine ()), Double.parseDouble(fr.readLine ()));
        }
        
        bubbleSortByEmployeeName (emp);
        
        for (int i = 0; i < emp.length - 1; i++)
        {
            System.out.println (emp [i].toString () );
            System.out.println ();
        }
        
        
    }
    
    public static void bubbleSortByEmployeeName (Employee [] data)
    {
	boolean switched = true;
	
	while (switched)
	{
	    switched = false;
	    for (int i = 0; i < data.length - 1; i++)
	    {
                String tempName1 = data [i].getName();
                String tempName2 = data [i+1].getName ();
                
		if (tempName1.compareTo (tempName2) > 0 )
		{
		    switched = true;
		    
		    Employee temp = data [i];
		    data [i] = data [i+1];
		    data [i+1] = temp;
		
		}
	    }
	    
	}
    }
    
}
