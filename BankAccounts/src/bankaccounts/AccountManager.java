/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounts;

/**
 *
 * @author NehNe
 */
public class AccountManager {
    
    private double balance;
    
    public AccountManager (double deposit)
    {
        balance = deposit;
    }
    
    public AccountManager ()
    {
        balance = 0.00;
    }
    
    public boolean withdraw (double amount)
    {
        boolean allowed;
        if (balance >= amount)
        {
            allowed = true;
            balance -= amount;
        }
        
        else
        {
            allowed = false;
        }
        
        return (allowed);
    }
    
    public void deposit (double amount)
    {
        balance += amount;
    }
    
    public double returnBalance ()
    {
        return (balance);
    }
    
    public void setBalance (double amount)
    {
        balance = amount;
    }
    
    @Override
    public String toString ()
    {
        return ("Balance is $" + balance + ".");
    }
}
