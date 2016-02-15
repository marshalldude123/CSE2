// Marshall Stallings
// hw03 Convert.java
// 2/14/16
// This prgram will convert meters to inches
import java.util.Scanner;
public class Convert {
    // Main method for program
     public static void main(String[] args){
        // Set up Scanner
        Scanner myScanner = new Scanner(System.in);
        // Ask the user for input
        System.out.print("Enter the distance in meters: ");
        // Ask for user input
        double userMeter = myScanner.nextDouble();
        // Convert meters to inches
        double calculatedInches = (userMeter * 100 ) / 2.54;
        System.out.println(userMeter + " meters is " + calculatedInches + " inches.");
        
    }// End of main method
}// End of class