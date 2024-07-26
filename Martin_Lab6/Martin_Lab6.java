
/**
 * FILLING ARRAY WITH 5 INTEGERS. SORT ARRAY WITH SELECTION SORT ALG. THEN FIND DESIRED NUM IN THE SORTED ARRAY USING BINARY SEARCH. ONCE FOUND 
 * UPDATE THE USER TO TELL THEM WHICH INDEX IT IS AT.
 * TIME TO COMPLETE : ROUGHLY A HOUR IN CLASS, BUT MADE A DRAFT LAST NIGHT W/ PSEUDO
 * NOTE TO SELF: TRY TO LEARN IT FIRST ON YOUTUBE, THEN AS A LAST RESORT LOOK AT NOTES.
 *
 * HUNTER MARTIN
 * 10-25-23
 */
import java.util.Scanner ;
import java.util.Arrays ; 
public class Martin_Lab6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int size = 5;
        int[] array = new int[size] ;       //declarations
        int num ;
        
        // lets fill an array with 5 int inside and check if its negative
        for(int i = 0 ; i < size ; i++) {
            System.out.print("Enter a value, that is greater than 0 ") ;
            array[i] = input.nextInt() ;
        while(array[i] < 0) {
            System.out.print("Invalid input, enter a value greater than 0. ") ;
            array[i] = input.nextInt() ; } 
        }
    //lets print the unsorted array
    System.out.println("The array unsorted is the following: " + Arrays.toString(array)) ;
        
    //selection sort
    for(int i = 0 ; i < array.length ; i++) {
        int currentMin = array[i] ;
        int currentMinIndex = i ;           //beginning of array and setting the mininum.
    for(int j = i + 1 ; j < array.length ; j++) {
        if(currentMin > array[j]) {
            currentMin = array[j] ;         //checking the next number to the right
            currentMinIndex = j ; }
        }
    if (currentMinIndex != i) {
        int temp = array[currentMinIndex] ;
        array[currentMinIndex] = array[i] ; //flip 
        array[i] = temp ;}
    }
    
    // print the sorted array
    System.out.println("The array sorted is the following: " + Arrays.toString(array)) ;
    
    // binary search
    System.out.print("Enter a value you would like to search for in the array. ") ;
    num = input.nextInt() ;
    
    int low = 0 ;
    int high = (array.length - 1) ;  //declarations
    boolean found = false ; 
    
    while(low <= high) {   
        int mid = (low + high) / 2 ;  //go to the middle of the sorted array
    if(num < array[mid]) {
        high = mid - 1 ;}           //if your desired # you want is less than the middle index, update the end of array to look at the # to the left
    else if(num > array[mid]) {
        low = mid + 1 ; }           //if desired # u want is greater than middle index, update the beginning of array to the # to the right
    else {
        System.out.println(num + " is found at index " + mid) ;
        found = true ;  //break loop if # is found
        break ;}       
}

//if to show if the number is not in the array
if(!found) {
    System.out.println(num + " is not found within the array") ;
}
}
}

/**
 * Enter a value, that is greater than 0 4
Enter a value, that is greater than 0 -2
Invalid input, enter a value greater than 0. 2
Enter a value, that is greater than 0 3
Enter a value, that is greater than 0 1
Enter a value, that is greater than 0 5
The array unsorted is the following: [4, 2, 3, 1, 5]
The array sorted is the following: [1, 2, 3, 4, 5]
Enter a value you would like to search for in the array. 4
4 is found at index 3

Enter a value, that is greater than 0 3
Enter a value, that is greater than 0 5
Enter a value, that is greater than 0 2
Enter a value, that is greater than 0 1
Enter a value, that is greater than 0 6
The array unsorted is the following: [3, 5, 2, 1, 6]
The array sorted is the following: [1, 2, 3, 5, 6]
Enter a value you would like to search for in the array. 7
7 is not found within the array
 */

