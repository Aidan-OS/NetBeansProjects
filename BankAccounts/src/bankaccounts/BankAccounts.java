/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounts;
import java.io.*;
/**
 *
 * @author NehNe
 */
public class BankAccounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        AccountManager myAccount = new AccountManager ();
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("How much do you want your initial deposit to be?");  ///////DEPOSIT 
        
        myAccount.deposit(Double.parseDouble(br.readLine () ) );
        
        System.out.println ("Your current balance is: $" + myAccount.returnBalance() );////CHECK NUMBER AFTER DEPOSIT
        
        boolean overdraw;
        do
        {    
            System.out.println ("How much money would you like to withdraw?");  ///WITHDRAW
        
            if (myAccount.withdraw (Double.parseDouble (br.readLine () ) ) )
            {
                overdraw = false;
                System.out.println ("Your new balance is: $" + myAccount.returnBalance () );
            }
            
            else
            {
                overdraw = true;
                System.out.println ("You cannot overdraw your account.");
            }
            
            
        }while (overdraw == true);
        
        System.out.println ("There is a bug in the system! You can now change your balance to whatever you want!");
        
        myAccount.setBalance (Double.parseDouble (br.readLine () ) );
        
        System.out.println (myAccount.toString() );
        
        
    }
    
}
