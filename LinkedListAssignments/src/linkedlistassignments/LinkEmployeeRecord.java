package linkedlistassignments;


// The "LinkEmployeeRecord" class.
public class LinkEmployeeRecord
{
    private String name;
    private int empNum;
    private double hourlyRate, hoursWorked;
    private LinkEmployeeRecord nextEmployeeRecord;

    // Constructor.
    public LinkEmployeeRecord (String name, int empNum, double hourlyRate, double hoursWorked)
    {
	this.name = name;
	this.empNum = empNum;
	this.hourlyRate = hourlyRate;
	this.hoursWorked = hoursWorked;
	nextEmployeeRecord = null;

    } // EmployeeRecord constructor


    // These methods are used to manipulate a linked list

    public LinkEmployeeRecord getNext ()
    {
	return nextEmployeeRecord;
    }


    public void setNext (LinkEmployeeRecord nextEmployeeRecord)
    {
	this.nextEmployeeRecord = nextEmployeeRecord;
    }




    // Method to change name.
    public void setName (String newName)
    {
	name = newName;
    } // setName method


    // Method to get name.
    public String getName ()
    {
	return name;
    } // getName method


    // Method to change empNum.
    public void setEmpNum (int emp)
    {
	empNum = emp;
    } // setEmpNum method


    // Method to get empNum.
    public int getEmpNum ()
    {
	return empNum;
    } // getEmpNum method


    // Method to change empNum.
    public void setHourlyRate (double hourly)
    {
	hourlyRate = hourly;
    } // setHourlyRate method


    // Method to get hourlyRate.
    public double getHourlyRate ()
    {
	return hourlyRate;
    } // getHourlyRate method


    // Method to change hoursWorked.
    public void setHoursWorked (double worked)
    {
	hoursWorked = worked;
    } // setHoursWorked method


    // Method to get empNum.
    public double getHoursWorked ()
    {
	return hoursWorked;
    } // getHoursWorked method
    
    @Override
    public String toString ()
    {
        return ("Name: " + name + "\nEmployee Number: " + empNum + "\nHourly Rate: " + hourlyRate + "\nHours Worked: " + hoursWorked);
    }
} /* EmployeeRecord class */
