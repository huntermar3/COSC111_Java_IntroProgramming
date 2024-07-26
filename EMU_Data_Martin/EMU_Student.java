
/**
 * Write a description of class EMU_Data here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EMU_Student
{
   //instance variables (attributes of an EMU student
   
private String firstName ;
private String lastName ;
private String EID ;
private int credits ;
private double GPA ;
static int numStudents = 0;


//default constructor
public EMU_Student() {
    Scanner input = new Scanner(System.in) ;
    numStudents++ ; 
    System.out.print("What is your first name? ");
    this.firstName = input.next();
    System.out.print("What is your last name? ") ;
    this.lastName = input.next();
    this.EID ="E00 " + numStudents ;
    this.credits = 0 ;
    this.GPA  = 4.0 ;
}

//args constructor
public EMU_Student(String firstName , String lastName, String EID , int credits, double GPA) {
    this.firstName = firstName ;
    this.lastName = lastName ;
    this.EID = EID ;
    this.credits = credits ;
    this.GPA = GPA ;
}


//getters for private data
public String getEID() {
    return this.EID ;
}

public int getCredits() {
    return this.credits ;
}

public double getGPA() {
    return this.GPA ;
}

public String getFirstName() {
    return this.firstName ;
}

public String getLastName() {
    return this.lastName ;
}

public static int getNumOfStudents() {
    return numStudents;
}


//setters for data that can be changed 
public void setCredits(int additonalHours) {
    this.credits += additonalHours;
}

public void setGPA(double newGPA) {
    this.GPA = newGPA ;
}

public void setFirstName(String newFirstName) {
    this.firstName = newFirstName ;
}

public void setLastName(String newLastName) {
    this.lastName = newLastName ;
}
}
