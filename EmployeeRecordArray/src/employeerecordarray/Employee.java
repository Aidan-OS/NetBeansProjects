/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecordarray;

/**
 *
 * @author NehNe
 */
public class Employee {
    
    private String name;
    private int employeeNumber;
    private double hourlyRate;
    private double hoursWorked;
    
    public Employee (String name, int employeeNumber, double hourlyRate, double hoursWorked)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public void setName (String name)
    {
        this.name = name;
    }
    
    public int getEmployeeNumber ()
    {
        return employeeNumber;
    }
    
    public void setEmployeeNumber (int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
    
    public double getHourlyRate ()
    {
        return hourlyRate;
    }
    
    public void setHourlyRate (double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }
    
    public double getHoursWorked ()
    {
        return hoursWorked;
    }
    
    public void setHoursWorked (double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public String toString ()
    {
        return ("Name: " + name + "\nEmployee Number: " + employeeNumber + "\nHourly Rate: " + hourlyRate + "\nHours Worked: " + hoursWorked);
    }
}
