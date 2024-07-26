
/**
 * PROMPT THE USER TO ENTER HOW MANY THINGS IN ARRAY. RUNS THROUGH A LOOP TO SEE HOW MANY VOWELS
 * TIME TO COMPLETE: 2 HOURS 45 MINS
 * NOTE TO SELF : FOREACH LOOPS ARE ONLY USED TO GO THROUGH AN ARRAY, KINDA POINTLESS. ADDING A COUNTER AT THE END MADE THIS ASSIGNMENT TAKE A LOT
 * LONGER. TRY TO BREAK DOWN SHIT INTO SMALLER TASKS.
 *
 * HUNTER MARTIN
 * 10-4-23
 */
import java.util.Scanner ;
public class Martin_Lab5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        //declarations
        int size, totalvowels, total_A, total_E, total_I, total_O , total_U ;
        char h ; 

        //we are seeing how many strings we are putting into the array. 
        System.out.println("*** Welcome to Vowel Counter! ***") ;
        System.out.print("Enter how many words you are doing today : " ) ;
        size = input.nextInt() ;
        String[] words = new String[size] ; 

        //we are filling the array with strings. 
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter a word " + (i+1) +  " : " ) ;
            words[i] = input.next() ; 
        }

        //initial to zero
        total_A = 0;
        total_E = 0;
        total_I = 0;
        total_O = 0;
        total_U = 0;
        
        // declarations
        int[] a_Counts = new int[size];
        int[] e_Counts = new int[size];
        int[] i_Counts = new int[size];
        int[] o_Counts = new int[size];
        int[] u_Counts = new int[size];
        
        //transversing the array
        for (int i = 0 ; i < size ; i++) {
            String word = words[i] ; 
            for (int j = 0; j < word.length(); j++) {
                 h = Character.toLowerCase(word.charAt(j));
                switch (h) {
                    case 'a':
                        a_Counts[i]++;
                        total_A++;
                        break;
                    case 'e':
                        e_Counts[i]++;
                        total_E++;
                        break;
                    case 'i':
                        i_Counts[i]++;
                        total_I++;
                        break;
                    case 'o':
                        o_Counts[i]++;
                        total_O++;
                        break;
                    case 'u':
                        u_Counts[i]++;
                        total_U++;
                        break;
                    default:
                }
            }
        }

        // Print the count of vowels for each word
        for (int i = 0; i < size; i++) {
            System.out.println("Vowels in '" + words[i] + "': "+ "A=" + a_Counts[i] + ", " + "E=" + e_Counts[i] + ", "  + "I=" + i_Counts[i] + ", "+ "O=" + o_Counts[i] + ", "+ "U=" + u_Counts[i]);
        }

        // Print the total counts for vowels
        totalvowels =  (total_A + total_E + total_I + total_O + total_U ) ;
        System.out.println("Total As: " + total_A);
        System.out.println("Total Es: " + total_E);
        System.out.println("Total Is: " + total_I);
        System.out.println("Total Os: " + total_O);
        System.out.println("Total Us: " + total_U);
        System.out.println("Total vowels: " + totalvowels) ;
        System.out.println("*** THANK YOU FOR USING MY PROGRAM! ***") ;
    }
}

/**
 * *** Welcome to Vowel Counter! ***
Enter how many words you are doing today : 3
Enter a word 1 : hello
Enter a word 2 : breeki
Enter a word 3 : bird
Vowels in 'hello': A=0, E=1, I=0, O=1, U=0
Vowels in 'breeki': A=0, E=2, I=1, O=0, U=0
Vowels in 'bird': A=0, E=0, I=1, O=0, U=0
Total As: 0
Total Es: 3
Total Is: 2
Total Os: 1
Total Us: 0
Total vowels: 6
*** THANK YOU FOR USING MY PROGRAM! ***
 */
