package studentrecords;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NehNe
 */
public class StudentRecord {
    
    private String name;
    private int [] mark = new int [4];
    private double average;
    
    public StudentRecord (String name, int [] mark, double average)
    {
        this.name = name;
        this.mark = mark;
        this.average = average;
    }
    
    public void setName (String name)
    {
        this.name = name;
    }
    
    public void setMark (int [] mark)
    {
        this.mark = mark;
    }
    
    public void setAverage (double average)
    {
        this.average = average;
    }
    
    public String getName ()
    {
        return (name);
    }
    
    public int[] getMark ()
    {
        return (mark);
    }
    
    public double getAverage ()
    {
        return (average);
    }

    @Override
    public String toString ()
    {
        return ("Name: " + name + "\nMark 1: " + mark [0] + "\nMark 2: " + mark [1] + "\nMark 3: " + mark [2] + "\nMark 4: " + mark [3] + "\nAverage: " + average);
    }
}
