
/**
 * Write a description of class Martin_Utilities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Martin_Utilities
{
    public static int add(int x, int y) {
        int result ; 
        result = (x + y) ;
        return result; 
    }

    public static int add(int x ,int y, int z){
        int result ;
        result = (x + y + z) ; 
        return result ;
    }

    public static double add(double x , double y) {
        double result ;
        result = (x + y );
        return result ;
    }
    
    public static double add(double x , double y , double z) {
        double result ;
        result = (x + y + z) ;
        return result ;
    }
    
    public static void printHR() {
        System.out.println("-----------") ;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " , ") ;
        }
    }
    
    public static void printArray(String[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " , ") ;
        }
    }
    
    public static void swap(int n1, int n2) {
        System.out.println("Before the swap n1 was " + n1 + " and n2 was " + n2) ;
        int temp ; 
        temp = n2 ; 
        n2 = n1 ;
        n1 = temp ;  
        System.out.println("After the swap n1 is " + n1 + " and n2 is " + n2) ;
        }
    
    public static void printMenu() { 
        printHR() ;
        System.out.println("0. Quit") ;
        System.out.println("1. add(int x, int y)") ;
        System.out.println("2. add(int x , int y, int z)") ;
        System.out.println("3. add(double x , double y)") ;
        System.out.println("4. add(double x, double y , double z)") ;
        System.out.println("5. printArray(int[] arr)") ;
        System.out.println("6. printArray(String[] arr)") ;
        System.out.println("7. swap(int n1, int n2)") ;
        System.out.println() ;
    }
}



