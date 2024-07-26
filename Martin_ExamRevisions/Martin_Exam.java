
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Martin_Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randnum;
        int userInput;
        int menu;
        int sum = 0;

        randnum = (int) (Math.random() * (5 - 3) + 3) + 1;

        for (int i = 0; i < randnum; i++) {
            System.out.print("Enter a number: ");
            userInput = input.nextInt();
            sum += userInput;
            if (userInput < 0) {
                System.out.print("Invalid input.");
                userInput = input.nextInt();
            }
        }

        menu = -1;
        while (menu != 0) {
            System.out.println("*** MENU ***");
            System.out.println("*** PRESS 1| AVERAGE ***");
            System.out.println("*** PRESS 2| SUM ***");
            System.out.println("*** PRESS 3| IS THE AVERAGE EVEN ***");
            System.out.println("PRESS ZERO IF YOU LIKE TO EXIT");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("THE AVERAGE OF YOUR NUMBERS ARE: " + (sum / randnum));
                    break;
                case 2:
                    System.out.println("THE SUM OF YOUR NUMBERS ARE: " + sum);
                    break;
                case 3:
                    boolean Even = ((sum / randnum) % 2 == 0);
                    if (Even) {
                        System.out.println("YOUR AVERAGE OF " + (sum / randnum) + " is even!");
                    } else {
                        System.out.println("YOUR AVERAGE OF " + (sum / randnum) + " is odd!");
                    }
                    break;
                case 0:
                    System.out.println("THANK YOU FOR USING MY PROGRAM FOR THE EXAM!");
                    break;
                default:
                    System.out.println("Invalid menu option. Please try again.");
            }
        }
    }
}
