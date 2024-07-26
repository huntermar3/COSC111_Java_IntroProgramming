
/**
 * BANK ACCOUNT APPLICATION. FINAL EXAM COSC 111 PROF. TRACY. CREATES AN OBJECT (BANK ACC) AND STORES IN ARRAY. HAS FUNCTIONS THAT WITHDRAW,
 * DEPOSIT, AND PRESENTS DATA. THIS PROJECT DEMONSTRATES OBJECT ORIENTED PROGRAMMING AND OVERALL EVERYTHING WE LEARNED.
 * DEFINITELY BY FAR THE "HARDEST" LAB I'VE EVER DONE. 
 * 
 * NOTE TO SELF: I GOT VERY COCKY THINKING I KNEW MORE BUT I DIDNT. THERE IS SO MUCH TO OOP THAN I WILL EVER KNOW.
 * TIME TO COMPLETE: HOURS I LOST TRACK, TOOK MANY BREAKS 
 *
 * HUNTER MARTIN
 * 12-5-23
 */
import java.util.Scanner; 

public class BankAccountData_Martin
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        //declarations
        int menu = -1 ;
        BankAccount_Martin[] accounts = new BankAccount_Martin[11] ;

        while(menu != 0) {
            Menu() ;
            menu = input.nextInt() ;
            switch(menu) {
                case 0: 
                    System.out.print("Thank you for using my program!! ") ;
                    break;

                case 1: 
                    System.out.println("Creating a new account! ") ;

                    //type of account from input
                    String accountType = makingAccountMenu() ;
                    double intialAmount = intialAmount() ;

                    //creates new bankaccount object
                    BankAccount_Martin newAccount = new BankAccount_Martin();

                    newAccount.setAccountType(accountType) ;

                    //the reason I used deposit because default is 0 anyways
                    newAccount.deposit(intialAmount) ;
                    storeAccount(accounts,newAccount) ;
                    break ;

                case 2: 
                    System.out.println("Depositing $!!! ");
                    System.out.print("What account are we doing today? ");
                    int accountNum = input.nextInt();

                    // check if the accountNum is within the correct range. (note will be simliar for withdrawing)
                    if (accountNum >= 0 && accountNum < accounts.length && accounts[accountNum] != null) {
                        System.out.println("Current balance before deposit: $" + accounts[accountNum].getBalance());

                        System.out.print("How much $ are we depositing? ");
                        double depositAmount = input.nextDouble();

                        //check to make sure you can not deposit negative money
                        while(depositAmount <= 0) {
                            System.out.println("Error you can not enter negative money" );
                            System.out.print("Please enter a valid money amount. ") ;
                            depositAmount = input.nextDouble() ;
                        }

                        // Deposit into the whatever account user said
                        accounts[accountNum].deposit(depositAmount);

                        //update the user 
                        System.out.println("Deposit successful! Updated balance: $" + accounts[accountNum].getBalance());
                    } else {
                        System.out.println("Invalid account number. Out of range!");
                    }
                    break;

                case 3:
                    System.out.println("Withdrawing $!!! ") ;
                    System.out.print("What account are we doing today? ") ;
                    accountNum = input.nextInt(); 

                    // another check to see if the actual Account number is in the correct range. 
                    if(accountNum >= 0 && accountNum < accounts.length && accounts[accountNum] != null) {
                        System.out.println("Current balance before the withdraw: $" + accounts[accountNum].getBalance()) ;

                        System.out.print("How much $ are we withdrawing? ") ;
                        double withdrawAmount = input.nextDouble() ;

                        //check to make sure you can not withdraw a negative amount
                        while(withdrawAmount <= 0) {
                            System.out.println("Error you can not withdraw negative money") ;
                            System.out.print("Please enter a valid money amount. ") ;
                            withdrawAmount = input.nextDouble() ;
                        }
                        //withdraw $ from whatever account user said
                        accounts[accountNum].withdraw(withdrawAmount) ;

                        //update the user but only if the balance was greater than zero. No negatives 
                        if(accounts[accountNum].getBalance() > 0) {
                            System.out.print("Updated balance: $" + accounts[accountNum].getBalance()) ;
                        } else {
                            System.out.println("Invalid account number. Out of range!" ) ;
                        }

                    }
                    break;

                case 4:
                    //presentating data to user
                    System.out.println("Account Information! " ) ;
                    System.out.print("Which account are we summarizing today? ") ;
                    accountNum = input.nextInt() ;

                    //if user inputs a num that DNE 
                    if(accountNum >= 0 && accountNum < accounts.length) {
                        if(accounts[accountNum] != null){
                            System.out.print(accounts[accountNum].toString()) ;
                        }
                        else {
                            System.out.print("Error. That account doesnt not exist.") ;
                        }
                    }
                    break;
            }
        }
    }

    // methods for the program , add more as I go through project    
    public static void Menu()  {
        System.out.println("\n================ MENU =========================") ;
        System.out.println("1. Create New Account. ") ;
        System.out.println("2. Deposit $ ") ;
        System.out.println("3. Withdraw $ ") ;
        System.out.println("4. Display Account Information. ");
        System.out.println("0. Exit ") ;
    }

    public static String makingAccountMenu() {
        Scanner input = new Scanner(System.in) ;
        System.out.print("\nWhat type of account are you making? Are you making a Savings or Checking") ;
        String AccountType = input.next() ;
        return AccountType ;

    }

    public static double intialAmount(){
        Scanner input = new Scanner(System.in) ;
        System.out.print("How much money are we going to set the account to? ") ;
        double moneyInAccount = input.nextDouble() ;
        return moneyInAccount ;
    }

    public static void storeAccount(BankAccount_Martin[] accounts, BankAccount_Martin account) {
        // Find the first available slot in the array and store the account. I was getting very frustrated at this point but someone helped.
        for (int i= 1; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("Account # " + account.getAccountNum() + " created successfully!");
                return;
            }
        }
        System.out.println("Error: Cannot create more accounts. Array is full.");
    }

}
