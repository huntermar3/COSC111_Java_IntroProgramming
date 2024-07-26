
/**
 * ALL THE METHODS USED FOR THE DRIVER!
 * 
 *
 * HUNTER MARTIN
 * 11-8-23
 */
import java.util.Scanner ;
import java.util.Arrays ;
public class Martin_Utilities2
{
    public static void printHR() {
        System.out.println("---------------------") ;
    }

    public static void printMenu2() {
        printHR() ;
        System.out.println("0. Quit") ;
        System.out.println("1. max(int x, int y)") ;
        System.out.println("2. max(double x, double y)") ;
        System.out.println("3. getString(String prompt)");
        System.out.println("4. getPosDouble(String prompt)");
        System.out.println("5. getPosInt(String prompt)");
        System.out.println("6. printFormattedArr(int[] arr) ") ;
        System.out.println("7. generateRandom(int max, int min) ");
        System.out.println("8. createArray(int size) ") ;
        System.out.println("9. selectionSort(int[] nums)");
        System.out.println("10. binarySearch(int key,int[] nums)");
    }

    public static int max(int x, int y) {
        int max ;
        max = Math.max(x,y) ;
        return max; 
    }

    public static double max(double x, double y) {
        double max;
        max = Math.max(x,y) ;
        return max; 
    }

    public static String getString(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt) ;
        String str = input.nextLine();
        while(str.equals(" ")){
            System.out.print("Invalid input. Please enter a valid string.") ;
            str = input.nextLine(); 
            break;
        }
        return str ;
    }

    public static double getPosDouble(String prompt) {
        Scanner input = new Scanner(System.in) ;
        System.out.print(prompt) ;
        double stringDouble ;
        stringDouble = input.nextDouble();
        while(stringDouble < 0) {
            System.out.print("Invalid input. Please enter a valid double.") ;
            stringDouble = input.nextDouble() ;
        }
        return stringDouble ;
    }

    public static int getPosInt(String prompt) {
        Scanner input = new Scanner(System.in) ;
        System.out.print(prompt) ;
        int stringInt;
        stringInt = input.nextInt();
        while(stringInt < 0) {
            System.out.print("Invalid input. Please enter a valid integer.") ;
            stringInt = input.nextInt();
        }
        return stringInt ;
    }

    public static void printFormattedArray(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + ", ");
            if((i+1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int generateRandom(int max, int min) {
        int random ;
        random = (int)(Math.random() * (max - min)) + min ;
        return random ;
    }

    public static int[] createArray(int size) {
        int random ;
        int [] arr ;
        arr = new int[size] ;
        for (int i = 0 ; i < size ; i++) {
            random = (int)(Math.random() * (100 - 1)) + 1 ;
            arr[i] = random ;
        }
        return arr;
    }
    
    public static int[] fillingArray(int size)  {
        Scanner input = new Scanner(System.in) ;
        int[] arr ;
        arr = new int[size] ;
        for (int i= 0 ; i < size ; i++) {
            System.out.print("Enter a number. ") ;
            arr[i] = input.nextInt();
        }
        return arr ;
    }
    
    public static void selectionSort(int[] nums) {
        System.out.println("The array unsorted is the following: " + Arrays.toString(nums)) ;
        int currentMin ; 
        int currentMinIndex ;
        for(int i = 0 ; i < nums.length ; i++) {
            currentMin = nums[i] ;
            currentMinIndex = i ;
            for(int j = i + 1 ; j < nums.length ; j++) {
                if(currentMin > nums[j]) {
                    currentMin = nums[j] ;
                    currentMinIndex = j ;
                }
            }
                if(currentMinIndex != i) {
                    int temp = nums[currentMinIndex] ;
                    nums[currentMinIndex] = nums[i] ;
                    nums[i] = temp ;
                }
        }
        System.out.println("The array sorted is the following: " + Arrays.toString(nums)) ;
    }

    public static int binarySearch(int key, int[] nums) {
        int low = 0 ;
        int high = (nums.length - 1) ; 
        while(low <= high) {
            int mid = (low + high) / 2 ;
            if (key < nums[mid]) {
                high = mid - 1 ;
            }
            else if(key == nums[mid]) {
                return mid ;
            }
            else {
                low = mid + 1;
            }
        }
        return -1 ;
    }
}

