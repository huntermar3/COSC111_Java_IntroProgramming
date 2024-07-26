
/**
 * collect input from user w/ income.
 * make 3 categories to budget, and % of total income for each category
 * any money left goes to the savings 
 *
 * Hunter Martin
 * 9-6-23
 */
import java.util.Scanner ;
public class Martin_Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Scanner stringScanner = new Scanner(System.in) ;
        
        // declarations
        int monthly_income ;
        double percentage1, percentage2, percentage3, categorybud1, categorybud2, categorybud3 , savings, remainingamount ;
        String category1 , category2 , category3 ; 
        
        System.out.println("***** WELCOME TO BUDGET CALCULATOR *****") ;
        
        System.out.print("\n How much money did you earn this month?") ;
        monthly_income = input.nextInt() ;
        
        // asking for category and % of their money they want to use. 3 times 
        System.out.print("What is the first category you want to split your income into? ") ;
        category1 = stringScanner.next() ;
        System.out.print("\n What percentage of your income would you like to budget for (in decimal) " + category1 ) ;
        percentage1 = input.nextDouble() ; 
        
        System.out.print("\n What is the second category you want to split your income into? ") ;
        category2 = stringScanner.next();
        System.out.print("\n What percentage of your income would you like to budget for? (in decimal) " + category2 ) ;
        percentage2 = input.nextDouble() ;
        
        System.out.print("\n What is the third category you want to split your income into? ") ;
        category3 = stringScanner.next();
        System.out.print("\n What percentage of your income would you like to budget for (in decimal) " + category3 );
        percentage3 = input.nextDouble();
        
        //Results 
        System.out.println("**** Monthly Budget ****");
        categorybud1 = monthly_income * percentage1 ;
        System.out.printf(category1 + ": $" + categorybud1 + "\n") ;
        categorybud2 = monthly_income * percentage2 ; 
        System.out.printf(category2 + ": $" + categorybud2 + "\n") ;
        categorybud3 = monthly_income * percentage3 ;
        System.out.printf(category3 + ": $" + categorybud3 + "\n") ;
        
        remainingamount = (categorybud1 + categorybud2 + categorybud3 ) ;
        savings = (monthly_income - remainingamount) ; 
        
        System.out.println("You have $" + savings + " remaining ") ; 
        System.out.println("**** THANK YOU FOR USING MY PROGRAM ****") ;
        
        
    }
}

/** 
 * ***** WELCOME TO BUDGET CALCULATOR *****

 How much money did you earn this month?7230
What is the first category you want to split your income into? RENT

 What percentage of your income would you like to budget for (in decimal) RENT.50

 What is the second category you want to split your income into? FOOD

 What percentage of your income would you like to budget for? (in decimal) FOOD.25

 What is the third category you want to split your income into? ENTERTAINMENT

 What percentage of your income would you like to budget for (in decimal) ENTERTAINMENT.10
**** Monthly Budget ****
RENT: $3615.0
FOOD: $1807.5
ENTERTAINMENT: $723.0
You have $1084.5 remaining 
**** THANK YOU FOR USING MY PROGRAM ****
 */
    
