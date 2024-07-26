
/**
 * SAME CONCEPT AS BUDGETING APP PART 1 JUST REVAMPED WITH IF(S) AND BOOLEAN VARIABLE
 *
 * HUNTER MARTIN
 * 9-14-23
 */
import java.util.Scanner ;
public class Martin_Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        String category1 , category2, category3 ;
        //DECLARATIONS
        int totalincome ;
        double percentage1 , percentage2, percentage3, savings , amount1 , amount2, amount3 ;
        boolean moneyleft ;
        
        //INTRO, NAME OF CATEGORIES
        totalincome = (int)(Math.random() * (3000 - 1500)) + 1500 ;
        System.out.println("*** WELCOME BACK TO BUDGETING *** ");
        System.out.println("\nBefore we begin you have " + totalincome + " dollars this paycheck to pay your needs. " ) ;
        System.out.print("\nWhat is your first category?") ;
        category1 = input.next() ;
        System.out.print("\nWhat is your second category?") ;
        category2 = input.next() ;
        System.out.print("\nWhat is your third category?");
        category3 = input.next();
        
        //PERCENTAGES FOR EACH CATEGORY
        System.out.print("\nWhat percentage (in decimal) would you like to pay towards: " + category1 ) ;
        percentage1 = input.nextDouble() ;
        System.out.print("\nWhat percentage (in decimal) would you like to pay towards: " + category2) ;
        percentage2 = input.nextDouble() ;
        System.out.print("\nWhat percentage (in decimal) would you like to pay towards: " + category3) ;
        percentage3 = input.nextDouble() ;
        
        //CALCULATIONS 
        amount1 = (totalincome * percentage1) ;
        amount2 = (totalincome * percentage2) ;
        amount3 = (totalincome * percentage3) ;
        savings = (totalincome - (amount1 + amount2 + amount3)) ;
        
        //CHECK IF PERCENTAGES OVER 100
        if (percentage1 + percentage2 + percentage3 > 1) {
            System.out.println("The total percentage is over 100%") ; }
        else { 
            System.out.println("For " + category1 + " you have spent " + amount1 + " dollars. ") ;
            System.out.println("For " + category2 + " you have spent " + amount2 + " dollars. ") ;
            System.out.println("For " + category3 + " you have spent " + amount3 + " dollars. ") ;  
            moneyleft = (totalincome > (amount1 + amount2 + amount3)) ;
            if (moneyleft) {
                System.out.println("\nCongrats you were able to save " + savings + " this paycheck" ) ;
            }
            else{
                System.out.println("Sorry man you are out of money.") ;
            }
        } System.out.println("*** THANK YOU FOR USING MY APPLICATION COME AGAIN!! ***") ;
    }
             }
             
/** 
 * ** WELCOME BACK TO BUDGETING *** 

Before we begin you have 1653 dollars this paycheck to pay your needs. 

What is your first category?food

What is your second category?rent

What is your third category?entertainment

What percentage (in decimal) would you like to pay towards: food.23

What percentage (in decimal) would you like to pay towards: rent.32

What percentage (in decimal) would you like to pay towards: entertainment.23
For food you have spent 380.19 dollars. 
For rent you have spent 528.96 dollars. 
For entertainment you have spent 380.19 dollars. 

Congrats you were able to save 363.65999999999985 this paycheck
*** THANK YOU FOR USING MY APPLICATION COME AGAIN!! ***
*** 
*** 
*** 
*** *** WELCOME BACK TO BUDGETING *** 

Before we begin you have 1579 dollars this paycheck to pay your needs. 

What is your first category?food

What is your second category?rent

What is your third category?entertainment

What percentage (in decimal) would you like to pay towards: food.5

What percentage (in decimal) would you like to pay towards: rent.3

What percentage (in decimal) would you like to pay towards: entertainment.4
The total percentage is over 100%
*** THANK YOU FOR USING MY APPLICATION COME AGAIN!! ***
*** 
*** 
*** *** WELCOME BACK TO BUDGETING *** 

Before we begin you have 2076 dollars this paycheck to pay your needs. 

What is your first category?food

What is your second category?rent

What is your third category?entertainment

What percentage (in decimal) would you like to pay towards: food.2

What percentage (in decimal) would you like to pay towards: rent.2

What percentage (in decimal) would you like to pay towards: entertainment.6
For food you have spent 415.20000000000005 dollars. 
For rent you have spent 415.20000000000005 dollars. 
For entertainment you have spent 1245.6 dollars. 
Sorry man you are out of money.
*** THANK YOU FOR USING MY APPLICATION COME AGAIN!! ***
*** 
 */

