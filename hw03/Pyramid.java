// Marshall Stallings
// hw03 Pyramid.java
// 2/14/16
// This program will find the volume inside a pyramid
import java.util.Scanner;
public class Pyramid{
    // Main method for the program
    public static void main(String[] args){
        // Set up user input
        Scanner myScanner = new Scanner(System.in);
        // Ask for user input for length
        System.out.print("The square side of the pyramid is (input length): ");
        // Create variable for user input to be stored
        double userLength = myScanner.nextDouble();
        // Ask for user input for height
        System.out.print("The height of the pyramid is (input height): ");
        // Creat variable for user input to be stored
        double userHeight = myScanner.nextDouble();
        // Calculate volume of the pyramid
        double volume = (userLength * userLength) * (userHeight / 3);
        // Print out data
        System.out.println("The volume inside the pyramid is: " + volume);
        
    }// End of main method
}// End of class