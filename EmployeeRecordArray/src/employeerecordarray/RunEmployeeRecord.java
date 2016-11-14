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
        RandomAccessFile raf = new RandomAccessFile ("employees.bin", "rw");
        
        int numOfEmployees = Integer.parseInt (fr.readLine ());
        
        Employee [] emp = new Employee [numOfEmployees]; //First thing in file will be a number saying how many employees
        
        raf.writeInt (numOfEmployees);
        
        for (int i = 0; i < emp.length; i++)//Brings in employee Info from file
        {
            emp [i] = new Employee (fr.readLine (), Integer.parseInt (fr.readLine () ), Double.parseDouble(fr.readLine ()), Double.parseDouble(fr.readLine ()));
            
            byte [] byteName = new byte [15];
            emp [i].getName ().getBytes(0, (emp [i].getName ().length ()) - 1, byteName, 0);
            
            raf.seek ( (i * 35) + 4);
            
            raf.write (byteName);
            raf.writeInt (emp[i].getEmployeeNumber());
            raf.writeDouble (emp[i].getHourlyRate());
            raf.writeDouble (emp[i].getHoursWorked());
        }
        
        raf.close();
        
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
