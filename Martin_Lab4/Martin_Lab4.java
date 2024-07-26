
/**
 * PROGRAM IS RANDOM GUESSING GENERATOR. PROGRAM CREATES A RANDOM NUMBER AND THE USER HAS TO GUESS CORRECTLY.
 * TIME TO COMPLETE: 30 MINS
 *
 * HUNTER MARTIN
 * 9-27-23
 */
import java.util.Scanner ;
public class Martin_Lab4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declarations
        boolean gameinprogress ;
        int guess , randomnum ; 
     
    //introduction 
    System.out.println("*** WELCOME TO NUMBER GUESSER! ***") ;
    randomnum = (int)(Math.random() * 10) + 1 ;
    
    System.out.print("\n Please enter a number from 1 to 10") ;
    gameinprogress = false ; 
    
    //while loop to check if you guessed correctly
    while (gameinprogress == false) {
        guess = input.nextInt() ;
        System.out.println("\n Your guess is incorrect!") ;
    if ( guess > randomnum) {
        System.out.println("\n Your guess was too high") ; }
    if (guess < randomnum) {
        System.out.println("\n Your guess was too low! " ) ; }
    else if (guess == randomnum) {
        System.out.println("You guessed correctly!" ) ;
        gameinprogress = true ; }
    }
    //if the user guessed correctly
    if (gameinprogress) {
        System.out.println("CONGRATS YOU WON THE NUMBER GUESSING GAME!") ;
        System.out.println("The number was " + randomnum) ;}

    }
    }
    
/**
 * *** WELCOME TO NUMBER GUESSER! ***

 Please enter a number from 1 to 103

 Your guess is incorrect!

 Your guess was too high
2

 Your guess is incorrect!

 Your guess was too high
1

 Your guess is incorrect!
You guessed correctly!
CONGRATS YOU WON THE NUMBER GUESSING GAME!
The number was 1
 */
    

