
/**
 * EXAM 1 PART 2
 *
 * HUNTER MARTIN
 * PRETTY FUN TO DO. NOT SO BAD
 * TIME TO COMPLETE 20 ISH MINUTES 
 */
import java.util.Scanner ;
public class Martin_Exam {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in) ;
    int randnum ;
    int userInput ;
    int menu ;
    int sum = 0 ;
      
      randnum = (int)(Math.random()*(5-3)+3) +1  ;
      
      
    for (int i = 0 ; i < randnum ; i++) { 
     System.out.print("Enter a number: ") ;
     userInput = input.nextInt() ;
     sum += userInput ;
    if (userInput < 0) { 
        System.out.print("Invalid input.") ;
        userInput=input.nextInt() ;
        sum += userInput ; } }
        
    menu = -1 ;
    while (menu != 0) {
        System.out.println("*** MENU ***") ;
        System.out.println("*** PRESS 1| AVERAGE ***") ;
        System.out.println("*** PRESS 2| SUM ***") ;
        System.out.println("*** PRESS 3| IS THE AVERAGE EVEN ***") ;
        System.out.println("PRESS ZERO IF YOU LIKE TO EXIT") ;
        menu = input.nextInt() ;
    if (menu == 1){
        System.out.println("THE AVERAGE OF YOUR NUMBERS ARE: " + (sum / randnum)) ;
        System.out.print("IF YOU LIKE TO CONTINUE PRESS 2 FOR SUM. PRESS 3 TO SEE IF YOUR AVERAGE IS EVEN. OR PRESS 0 TO EXIT") ;
        menu = input.nextInt() ;}
    if (menu == 2){
        System.out.println("THE SUM OF YOUR NUMBERS ARE: " + sum) ;
        System.out.print("IF YOU LIKE TO CONTINUE PRESS 1 FOR AVERAGE. PRESS 3 TO SEE IF YOUR AVERAGE IS EVEN. OR PRES 0 TO EXIT");
        menu = input.nextInt(); }
    boolean Even = ((sum / randnum) % 2 == 0) ;
    if (menu == 3) {
        if (Even) {
            System.out.println("YOUR AVERAGE OF " + (sum / randnum) + " is even!") ;
            System.out.print("IF YOU LIKE TO CONTINUE PRESS 1 FOR AVERAGE. PRESS 2 FOR SUM. OR PRESS 0 TO EXIT") ;
            menu = input.nextInt() ;}
        else { 
            System.out.println("YOUR AVERAGE OF " + (sum / randnum) + " is odd!") ;
            System.out.print("IF YOU LIKE TO CONTINUE PRESS 1 FOR AVERAGE. PRESS 2 FOR SUM. OR PRESS 0 TO EXIT") ;
            menu = input.nextInt() ;} }
    }
    if (menu == 0) { 
        System.out.println("THANK YOU FOR USING MY PROGRAM FOR THE EXAM!") ;}
}
}
