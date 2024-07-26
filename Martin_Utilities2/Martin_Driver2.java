
/**
 * METHOD TESTER 2. WE ARE TESTED MORE COMPLICATED METHODS. SAME AS LAB 7 JUST REVAMPED.
 * TIME TO COMPLETE : 4 HOURS
 * THE RUBRIC WAS CONFUSING FOR THE MOST PART. OTHER THAN THAT IT WAS STRAIGHT FORWARD. 
 *
 * HUNTER MARTIN
 * 11-8-23
 */
import java.util.Scanner ;
import java.util.Arrays;

public class Martin_Driver2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        //DECLARATIONS
        int menu = -1 ;
        int x ;
        int y ;
        double X ;
        double Y ;
        
        
        System.out.println("*** WELCOME TO METHOD TESTER PT.2 ***") ;
        while(menu!= 0) {
            Martin_Utilities2.printMenu2() ;
            menu = input.nextInt();
        switch (menu) {
            case 0 :
                System.out.println("Thank you for using my program!!") ;
                break; 
            
            case 1: 
                System.out.println("MAX OF TWO INTEGERS") ;
                System.out.print("Please enter an integer. ") ;
                x = input.nextInt() ;
                System.out.print("Please enter an another integer. ") ;
                y = input.nextInt() ;
                int MaxOfInts = Martin_Utilities2.max(x,y) ;
                System.out.println("THE MAXIMUM OF THE TWO INTEGERS IS:");
                System.out.println(MaxOfInts) ;
                break;
            
            case 2: 
                System.out.println("MAX OF TWO DOUBLES") ;
                System.out.print("Please enter a double. ");
                X = input.nextDouble();
                System.out.print("Please enter an another double. ") ;
                Y = input.nextDouble();
                double MaxOfDoubles = Martin_Utilities2.max(X,Y) ;
                System.out.println("THE MAXIMUM OF THE TWO DOUBLES IS:") ;
                System.out.println(MaxOfDoubles) ;
                break ;
                
            case 3:
                System.out.println("GETSTRING PROMPT") ;
                String prompt ;
                prompt = "What is your favorite color? " ;
                String getString = Martin_Utilities2.getString(prompt) ;
                System.out.println(getString);
                break;
                
            case 4:
                System.out.println("GETTING POSTIVE DOUBLE PROMPT") ;
                String prompt2; 
                prompt2 = "How much money do you have in your pocket? " ;
                double getString2 = Martin_Utilities2.getPosDouble(prompt2) ;
                System.out.println(getString2) ;
                break ;
                
            case 5:
                System.out.println("GETTING POSITIVE INT PROMPT") ;
                String prompt3 ;
                prompt3 = "How many siblings do you have? " ;
                int getString3 = Martin_Utilities2.getPosInt(prompt3) ;
                System.out.println(getString3) ;
                break ;
                
            case 6: 
                System.out.println("PRINTING A FORMATTED ARRAY");
                int size ;
                System.out.print("Please enter a size of your array. ");
                size = input.nextInt();
                int nums[] = new int[size] ;
                nums = Martin_Utilities2.fillingArray(size) ;
                Martin_Utilities2.printFormattedArray(nums) ;
                break;
            
            case 7: 
                System.out.println("GENERATING A RANDOM NUMBER. ") ;
                System.out.print("Please enter a higher bound. ");
                int max = input.nextInt() ;
                System.out.print("Please enter a lower bound. ") ;
                int low = input.nextInt();
                int randomNum = Martin_Utilities2.generateRandom(max,low) ;
                System.out.println(randomNum);
                break ;
            
            case 8: 
                System.out.println("CREATING AN ARRAY WITH RANDOM NUMBERS. ") ;
                System.out.print("Please enter a size of your array. ") ;
                int size2 = input.nextInt() ;
                int[] randomArray = Martin_Utilities2.createArray(size2) ;
                for (int i = 0 ; i < size2 ; i++) {
                    System.out.print(randomArray[i] + " , ") ;
                }
                System.out.println();
                break;
               
            case 9:
                System.out.println("SELECTION SORT TIME! ") ;
                System.out.print("Please enter a size of your array. ");
                int size3 = input.nextInt(); 
                int[] filledArray = Martin_Utilities2.fillingArray(size3) ;
                Martin_Utilities2.selectionSort(filledArray) ;
                System.out.println();
                break;
            
            case 10: 
                System.out.println("BINARY SEARCH TIME! ") ;
                System.out.print("Please enter a size of your array. ");
                int size4 = input.nextInt();
                int[] filledArray2 = Martin_Utilities2.fillingArray(size4) ;
                System.out.print("Please enter a desired number you want to find in your array. ") ;
                int key = input.nextInt() ;
                Martin_Utilities2.selectionSort(filledArray2) ;
                int result = Martin_Utilities2.binarySearch(key,filledArray2) ;
                System.out.print("The desired number was found at index " + result) ;
                System.out.println();
                break;
                
                
            } 
        }
    }
}

/**
 * *** WELCOME TO METHOD TESTER PT.2 ***
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
1
MAX OF TWO INTEGERS
Please enter an integer. 2
Please enter an another integer. 1
THE MAXIMUM OF THE TWO INTEGERS IS:
2
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
2
MAX OF TWO DOUBLES
Please enter a double. 1.1
Please enter an another double. 1.2
THE MAXIMUM OF THE TWO DOUBLES IS:
1.2
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
3
GETSTRING PROMPT
What is your favorite color?  
Invalid input. Please enter a valid string.blue
blue
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
4
GETTING POSTIVE DOUBLE PROMPT
How much money do you have in your pocket? -2
Invalid input. Please enter a valid double.1.3
1.3
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
5
GETTING POSITIVE INT PROMPT
How many siblings do you have? -4
Invalid input. Please enter a valid integer.9
9
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
6
PRINTING A FORMATTED ARRAY
Please enter a size of your array. 11
Enter a number. 1
Enter a number. 2
Enter a number. 3
Enter a number. 4
Enter a number. 5
Enter a number. 6
Enter a number. 7
Enter a number. 8
Enter a number. 9
Enter a number. 10
Enter a number. 11
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
11, ---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
7
GENERATING A RANDOM NUMBER. 
Please enter a higher bound. 97
Please enter a lower bound. 3
76
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
8
CREATING AN ARRAY WITH RANDOM NUMBERS. 
Please enter a size of your array. 7
8 , 29 , 80 , 72 , 85 , 92 , 82 , 
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
9
SELECTION SORT TIME! 
Please enter a size of your array. 3
Enter a number. 4
Enter a number. 2
Enter a number. 1
The array unsorted is the following: [4, 2, 1]
The array sorted is the following: [1, 2, 4]

---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
10
BINARY SEARCH TIME! 
Please enter a size of your array. 4
Enter a number. 245
Enter a number. 32
Enter a number. 2
Enter a number. -3
Please enter a desired number you want to find in your array. 245
The array unsorted is the following: [245, 32, 2, -3]
The array sorted is the following: [-3, 2, 32, 245]
The desired number was found at index 3
---------------------
0. Quit
1. max(int x, int y)
2. max(double x, double y)
3. getString(String prompt)
4. getPosDouble(String prompt)
5. getPosInt(String prompt)
6. printFormattedArr(int[] arr) 
7. generateRandom(int max, int min) 
8. createArray(int size) 
9. selectionSort(int[] nums)
10. binarySearch(int key,int[] nums)
0
Thank you for using my program!!

 */
