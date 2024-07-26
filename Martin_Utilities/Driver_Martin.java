
/**
 * TESTING METHODS IN UTILITIES. OVERLOADING METHODS AND PRINT MENU
 * TIME TO COMPLETE: 2 AND A HALF HOURS
 * 
 *
 * HUNTER MARTIN
 * 11-1-23
 */
import java.util.Scanner; 
public class Driver_Martin
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = -1 ;
        int x ;
        int y; 
        int z; 
        int size;
        double a ; 
        double b;
        double c; 
        
        System.out.println("*** WELCOME TO METHOD TESTER! ***") ;
        while (menu != 0){
            Martin_Utilities.printMenu();
            menu = input.nextInt();
        switch (menu) {
            case 0: 
                System.out.println("Thank you for using my program!") ;
                break ;
                
            case 1: 
            System.out.println("ADDING 2 INTEGERS") ;
            System.out.print("Please enter an int. ") ;
            x = input.nextInt() ;
            System.out.print("Please enter an another int. ") ;
            y = input.nextInt(); 
            int addInt2 = Martin_Utilities.add(x ,y) ;
            System.out.println(addInt2) ;
            break;
            
            case 2: 
            System.out.println("ADDING 3 INTEGERS") ;
            System.out.print("Please enter an int. ") ;
            x = input.nextInt();
            System.out.print("Please enter an another int. ") ;
            y = input.nextInt() ;
            System.out.print("Please enter an another int. ") ;
            z = input.nextInt();
            int addInt3 = Martin_Utilities.add(x , y ,z) ;
            System.out.println(addInt3) ;
            System.out.println();
            break;
            
            case 3:
            System.out.println("ADDING 2 DOUBLES") ;
            System.out.print("Please enter a double. ") ;
            a = input.nextDouble() ;
            System.out.print("Please enter an another double. ");
            b = input.nextDouble();
            double addDouble2 = Martin_Utilities.add(a , b) ;
            System.out.println(addDouble2) ;
            System.out.println(); 
            break;
            
            case 4:
            System.out.println("ADDING 3 DOUBLES") ;
            System.out.print("Please enter a double. ");
            a = input.nextDouble() ;
            System.out.print("Please enter an another double. ") ;
            b = input.nextDouble();
            System.out.print("Please enter an another double. ") ;
            c = input.nextDouble();
            double addDouble3 = Martin_Utilities.add(a , b, c) ;
            System.out.println(addDouble3) ;
            System.out.println();
            break ;
            
            case 5:
            System.out.print("Please enter a size for your array ") ;
            size = input.nextInt();
            int[] arr = new int[size] ;
            for (int i = 0 ; i < size ; i++) {
                arr[i] = input.nextInt();
            }
            Martin_Utilities.printArray(arr) ;
            System.out.println();
            break;
            
            case 6:
            System.out.print("Please enter a size of your array ") ;
            size = input.nextInt();
            input.nextLine();
            String[] StringArr = new String[size] ;
            for (int i = 0 ; i < size ; i++) {
                StringArr[i] = input.nextLine();
            }
            Martin_Utilities.printArray(StringArr) ;
            System.out.println();
            break;
            
            case 7:
            System.out.print("Enter your first number. ") ;
            x = input.nextInt();
            System.out.print("Enter your second number. ") ;
            y = input.nextInt();
            Martin_Utilities.swap( x , y) ;
            System.out.println();
            break;
        }
        
    }
}
}
/**
 * *** WELCOME TO METHOD TESTER! ***
-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

1
ADDING 2 INTEGERS
Please enter an int. 1
Please enter an another int. 2
3
-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

2
ADDING 3 INTEGERS
Please enter an int. 1
Please enter an another int. 2
Please enter an another int. 3
6

-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

3
ADDING 2 DOUBLES
Please enter a double. 1.2
Please enter an another double. 1.1
2.3

-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

4
ADDING 3 DOUBLES
Please enter a double. 3.2
Please enter an another double. 3.1
Please enter an another double. 2.3
8.600000000000001

-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

5
Please enter a size for your array 3
1
2
3
1 , 2 , 3 , 
-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

6
Please enter a size of your array 3
hunter
martin
tracy
hunter , martin , tracy , 
-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

7
Enter your first number. 3
Enter your second number. 2
Before the swap n1 was 3 and n2 was 2
After the swap n1 is 2 and n2 is 3

-----------
0. Quit
1. add(int x, int y)
2. add(int x , int y, int z)
3. add(double x , double y)
4. add(double x, double y , double z)
5. printArray(int[] arr)
6. printArray(String[] arr)
7. swap(int n1, int n2)

0
Thank you for using my program!
 */
