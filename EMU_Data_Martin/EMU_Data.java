
/**
 * CREATE AN OBJECT CALLED STUDENT. REPORTS DATA FROM EVERYTHING
 *
 * HUNTER MARTIN
 * 11-20-23
 */
import java.util.Scanner ;
public class EMU_Data
{
    public static void main(String[] args) {
    //declarations
    String firstName ;
    String lastName ;
    Scanner input = new Scanner(System.in) ;

    int option = -1 ;
    EMU_Student student = new EMU_Student() ;

    System.out.println("WELCOME TO OOP!!") ;
    while (option != 0) {
        MenuScreen();
        option = input.nextInt();
        switch(option) {
            case 0:
                System.out.println("Thank you for using OOP");
                break;
            
            case 1:
                System.out.println(student.getFirstName()) ;
                System.out.println(student.getLastName()) ;
                break;
            
            case 2:
                System.out.print(student.getEID()) ;
                break;
            
            case 3: 
                System.out.print(student.getGPA()) ;
                break;
            
            case 4:
                System.out.print(student.getCredits()) ;
                break;
            
            case 5:
                System.out.print("How many credits did you take this semester? ") ;
                int additHours = input.nextInt();
                student.setCredits(additHours);
                System.out.print(student.getCredits()) ;
                break ;
            
            case 6:
                System.out.print("LETS VIEW EVERYTHING!!!") ;
                System.out.println(student.getFirstName()) ;
                System.out.println(student.getLastName()) ;
                System.out.println(student.getEID()) ;
                System.out.println(student.getGPA()) ;
                System.out.println(student.getCredits()) ;
                System.out.println(student.getCredits()) ;
                System.out.println(student.getNumOfStudents()) ;
                break ;
        }
    }
}
   
 public static void MenuScreen() {
        System.out.println("\n0. Quit") ;
        System.out.println("1. Display name") ;
        System.out.println("2. Display EID") ;
        System.out.println("3. Display GPA") ;
        System.out.println("4. Display credits") ;
        System.out.println("5. Add credits") ;
        System.out.println("6. View all details");
    }
}

/**
 * What is your first name? hunter
What is your last name? martin
WELCOME TO OOP!!

0. Quit
1. Display name
2. Display EID
3. Display GPA
4. Display credits
5. Add credits
6. View all details
1
hunter
martin

0. Quit
1. Display name
2. Display EID
3. Display GPA
4. Display credits
5. Add credits
6. View all details
2
E00 1
0. Quit
1. Display name
2. Display EID
3. Display GPA
4. Display credits
5. Add credits
6. View all details
3
4.0
0. Quit
1. Display name
2. Display EID
3. Display GPA
4. Display credits
5. Add credits
6. View all details
4
0
0. Quit
1. Display name
2. Display EID
3. Display GPA
4. Display credits
5. Add credits
6. View all details
5
How many credits did you take this semester? 12
12
0. Quit
1. Display name
2. Display EID
3. Display GPA
4. Display credits
5. Add credits
6. View all details
6
LETS VIEW EVERYTHING!!!hunter
martin
E00 1
4.0
12
12
1

0. Quit
1. Display name
2. Display EID
3. Display GPA
4. Display credits
5. Add credits
6. View all details
0
Thank you for using OOP
 */
