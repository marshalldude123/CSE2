// Marshall Stallings
// Lab06
// 3/4/16
// This program will print out a twist based on a certian length
import java.util.Scanner;
public class TwistGenerator{
    public static void main(String[] args){
        // Create scanner
        int count = 0;
        int length = 0;
        Scanner myScanner = new Scanner( System.in );
        while (length <=0){
        System.out.print("Please insert a positive length: ");
        // Check to see if value is an int
        if (myScanner.hasNextInt()){
            // Save length
            length = myScanner.nextInt();
            // Print out top line
            while (count < (length/3)){
                System.out.print("\\");
                System.out.print(" /");
                count++;
            }// End of while inside 1
            // Print out partial twist if needed
            switch (length%3){
                case 1:
                    System.out.print("\\");
                    break;
                case 2:
                    System.out.print("\\ ");
                     break;
            }// End of switch 1
            // Reset count
           count = 0;
           // Print on new line
           System.out.println("");
           // Print middle part for twist
            while (count < (length/3)){
                System.out.print(" X ");
                count++;
            }// End of while inside 2
            // Print out partial twist if needed
              switch (length%3){
                case 1:
                    System.out.print(" ");
                    break;
                case 2:
                    System.out.print(" X");
                    break;
            }// End of switch 2
            // Reset count
            count = 0;
            // Print on new line
            System.out.println("");
            // Print bottom part of twist
            while (count < (length/3)){
                System.out.print("/");
                System.out.print(" \\");
                count++;
            }// End of while inside 3
            // Print out partial twist if needed
              switch (length%3){
                case 1:
                    System.out.print("/");
                    break;
                case 2:
                    System.out.print("/ ");
                    break;
            }// End of switch 3
            // Move command prompt to next line
            System.out.println("");
        }// End of if 
        // Tell user their error
        else {
            String trash = myScanner.next();
            System.out.println("Please insert an integer.");
        }// End of else
        }// end of while outside
    }// End of main method
}// End of class