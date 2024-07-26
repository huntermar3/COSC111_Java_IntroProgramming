
/**
 * LAB 3 PASSWORD VALIDATOR
 * PROGRAM READS YOUR PASSWORD AND RUN THROUGH A SWITCH STATEMENT TO CHECK IF THE CRITERIAS ARE MET. 
 * TIME TO COMPLETE: 2 HOURS 10 MINS
 * NOTE TO SELF : DONT ALWAYS THINK FALSE ALL THE TIME. SOMETIMES TRUE CAN WORK OUT BETTER.
 *
 * HUNTER MARTIN 
 * 9-21-23
 */

import java.util.Scanner ; 
public class Martin_Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 
        //declaration of the variables 
        String password , endphase ; 
        boolean passwordlength,condition_1, condition_2, condition_3,condition_4;  ;
        
        //intro the user the criteria of this program
        System.out.println("*** WELCOME TO PASSWORD VALIDATOR! *** ") ;
        System.out.println("\n Your password must meet certain criteria.") ;
        System.out.println("\n 1. The length must be at least 7 and less than 11 characters.") ; 
        System.out.println("\n 2. The password must end in either 'abc' , 'xyz', or '123' .") ;
        System.out.println("\n 3. If the password ends in 'abc', the password must contain an '@'.") ;
        System.out.println("\n 4. if the password ends in 'xyz', the third character has to be a digit.") ;
        System.out.println("\n 5. If the password ends in '123' , the first and second character must be the square root of the third and fourth character.") ;
        System.out.println("\n ***************************************") ;

        System.out.print("\nPlease enter your desired password") ;
        password = input.next() ;

        //PASSWORD LENGTH CONDITION
        passwordlength = (password.length() < 11 && password.length() >= 7) ;
        endphase = password.substring(password.length()-3);
        
        //switch statement to see all the different scenarios. endphase is "abc" / "xyz" / "123"
        switch(endphase) {
            case "abc":
                condition_1 = true ;
                condition_2 = password.contains("@") ;
                condition_3 = true ;
                condition_4 = true ;
                break; 
            case "xyz":
                condition_1 = true ;
                condition_2 = true ;
                condition_3 = Character.isDigit(password.charAt(2));
                condition_4 = true ;
                break;
            case "123":
                condition_1 = true;
                condition_2 = true; 
                condition_3 = true ;
                
                //this took me long time to figure.  f stands for "first letter"
                char f1 = password.charAt(0);
                char f2 = password.charAt(1) ;
                char f3 = password.charAt(2) ;
                char f4 = password.charAt(3) ;
                
                condition_4 = (f1*f1 == f3) && (f2*f2 == f4) ;
                break;
            default: 
                //if user put in random characters, all false 
                condition_1 = false; 
                condition_2 = false; 
                condition_3 = false; 
                condition_4 = false; 
                break; }
        
                if (passwordlength && condition_1 && condition_2 && condition_3 && condition_4) {
                    System.out.println("Your password is valid!!:") ; }
                else { 
                    System.out.println("Your password does not meet my criteria!.") ; }
                    
                System.out.println("***THANK YOU FOR USING MY PROGRAM!!! ***");
            
    
        }
    }
/**
 * *** WELCOME TO PASSWORD VALIDATOR! *** 

 Your password must meet certain criteria.

 1. The length must be at least 7 and less than 11 characters.

 2. The password must end in either 'abc' , 'xyz', or '123' .

 3. If the password ends in 'abc', the password must contain an '@'.

 4. if the password ends in 'xyz', the third character has to be a digit.

 5. If the password ends in '123' , the first and second character must be the square root of the third and fourth character.

 ***************************************

Please enter your desired password$@kt456abc
Your password is valid!!:
***THANK YOU FOR USING MY PROGRAM!!! ***
***
***
***
****** WELCOME TO PASSWORD VALIDATOR! *** 

 Your password must meet certain criteria.

 1. The length must be at least 7 and less than 11 characters.

 2. The password must end in either 'abc' , 'xyz', or '123' .

 3. If the password ends in 'abc', the password must contain an '@'.

 4. if the password ends in 'xyz', the third character has to be a digit.

 5. If the password ends in '123' , the first and second character must be the square root of the third and fourth character.

 ***************************************

Please enter your desired passwordkt23xyz
Your password is valid!!:
***THANK YOU FOR USING MY PROGRAM!!! ***
***
***
***
*****THANK YOU FOR USING MY PROGRAM!!! ***
*** WELCOME TO PASSWORD VALIDATOR! *** 

 Your password must meet certain criteria.

 1. The length must be at least 7 and less than 11 characters.

 2. The password must end in either 'abc' , 'xyz', or '123' .

 3. If the password ends in 'abc', the password must contain an '@'.

 4. if the password ends in 'xyz', the third character has to be a digit.

 5. If the password ends in '123' , the first and second character must be the square root of the third and fourth character.

 ***************************************

Please enter your desired password0416kt123
Your password does not meet my criteria!.
***THANK YOU FOR USING MY PROGRAM!!! ***
*** WELCOME TO PASSWORD VALIDATOR! *** 

 Your password must meet certain criteria.

 1. The length must be at least 7 and less than 11 characters.

 2. The password must end in either 'abc' , 'xyz', or '123' .

 3. If the password ends in 'abc', the password must contain an '@'.

 4. if the password ends in 'xyz', the third character has to be a digit.

 5. If the password ends in '123' , the first and second character must be the square root of the third and fourth character.

 ***************************************

Please enter your desired password2514kt123
Your password does not meet my criteria!.
***THANK YOU FOR USING MY PROGRAM!!! ***
 */

    
