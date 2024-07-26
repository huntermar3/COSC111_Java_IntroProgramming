
/**
 * GETTERS AND SETTERS FOR BANK ACCOUNT FINAL PROJECT
 *
 * HUNTER MARTIN
 * 12-12-23
 */
import java.util.Scanner ;
public class BankAccount_Martin
{
    //instance variables
    private String type; 
    private double balance ;
    private int accountNum ;
    private static int nextAccountNum = 1;
    
    public BankAccount_Martin() {
        this.balance = 0 ;
        this.accountNum = nextAccountNum++ ;
    }
    
    
    //getters for private data which is all variables
    public String getType() {
        return this.type ;
    }
    
    public double getBalance() {
        return this.balance ;
    }
    
    public int getAccountNum() {
        return this.accountNum ;
    }
    
    
    //setters for the data that can be changed which in this case AccType and balance
    public void setAccountType(String newType) {
        this.type = newType ;
    }
    
    
    //setBalance alternative (withdraw and deposit) 
    public void deposit(double moneyComingIn) {
        this.balance += moneyComingIn ;
    }
    
    public void withdraw(double moneyComingOut) {
        if(moneyComingOut > 0 && moneyComingOut <= this.balance) {
            this.balance -= moneyComingOut;
        }
        else {
            System.out.println("Error. You do not have enough $") ;
        }
    
    }
    
    public String toString() {
        String output = "" ;
        output += "\nAccount Type: " + this.type ;
        output += "\nBalance: $" + this.balance ;
        return output;
    }
}
