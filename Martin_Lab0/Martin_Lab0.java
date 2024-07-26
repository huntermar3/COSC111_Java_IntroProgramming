
/**
 * Read in # from user representing quantities of coins 
 * The program will sum all of the change and output result
 * Hunter Martin
 * 8-30-23
 */

import java.util.Scanner ;
public class Martin_Lab0
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int quarters, dimes, nickels , pennies ;
        int TotalChange = 0 ;
        
        System.out.println("****** COIN CALCULATOR ****** ") ; 
        System.out.println();
        System.out.println(" Program by Hunter Martin" ) ;
        System.out.println("This program will add up change in your pocket") ;
        
        //prompt to count quarters 
        System.out.print("Enter the number of quarters: ") ;
        quarters = kb.nextInt() ;
        
        //prompt to count nickels
        System.out.print("Enter the number of nickels: ") ;
        nickels = kb.nextInt();
        
        //prompt to count dimes
        System.out.print("Enter the number of dimes: ") ;
        dimes = kb.nextInt();
        
        //prompt to count pennies
        System.out.print("Enter the number of pennies: ") ;
        pennies = kb.nextInt();
        
        // Calculate worth of the cents
        quarters = quarters * 25 ;
        dimes = dimes * 10 ;
        nickels = nickels * 5 ;
        
        //Compute total change
        TotalChange = quarters + dimes + nickels + pennies ;
        
        //Print ouput to user
        System.out.println();
        System.out.println("The total value of change is: " + TotalChange) ;
        
        
    }
}
/**
 * ****** COIN CALCULATOR ****** 

 Program by Hunter Martin
This program will add up change in your pocket
Enter the number of quarters: 1
Enter the number of nickels: 2
Enter the number of dimes: 1
Enter the number of pennies: 1

The total value of change is: 46
 */