// Marshall Stallings
// hw07
// 3/22/16
// This program will print out a twist
import java.util.Scanner; // Import Scanner
public class Twisty{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);// Create scanner
        // Initialize variables
        int length = 0;
        int width = 0;
        int count = 0;
        boolean accept = false;
        // Ask for length
        System.out.print("Input desired length: ");
        // Create loop to keep asking if input is wrong
        while (!accept){
            // Check to see if input is a number
            if(myScanner.hasNextInt() ){
                if (length <= 80){
                // Save variable
                length = myScanner.nextInt();
                System.out.print("Input desired width: ");
                if(myScanner.hasNextInt() ){
                    if (width < length){
                        // save varable and end while loop
                         width = myScanner.nextInt();
                        accept = true;
                    }
                        else{
                            // Reset loop since width doesn't work
                            accept = false;
                            width = 0;
                            System.out.println("Error width must be less than or equal to 80.");
                            System.out.print("Please re-enter length: ");
                        }
                    }
                    else{
                        // Reset loop since length doesn't work
                        accept = false;
                        length = 0;
                        System.out.println("Error length must be smaller than length.");
                        System.out.print("Please re-enter length: ");
                    }
                }
                else{
                    // Get rid of width since it isn't a number
                    String trash = myScanner.next();
                    System.out.println("Please enter an integer.");
                    System.out.print("Please re-enter desired length: ");
                }
            }
            else{
                // Get rid of length since it isn't a number
                String trash = myScanner.next();
                System.out.println("Please enter an integer.");
                System.out.print("Please enter desired length: ");
            }
        }
        // Create loops to begin printing twist
        // Determines how tall twist is
        for(int i = 0; i<width; i++){
            // Determines how long the twist is
            for(int j = 0; j<length; j++){
                // Print each line
                int rem = j/width;
                int mod = j%width;
                    // Check to see if it is even
                    if (mod == i){
                        if (rem%2 == 0){
                        System.out.print("#");
                    }
                   // Check to see if it is odd 
                    if (rem%2 == 1){
                        System.out.print("\\");
                    }
                } 
                // Begin printing upward part of twist
                else if (mod == (width - 1 - i)){
                    // Check to see if even
                    if (rem%2 == 0){
                        System.out.print("/");
                    }
                    // Check to see if odd
                    if (rem%2 == 1){
                        System.out.print("#");
                    }
                }
                // This is to print out the spaces in bewtween
                else {
                    System.out.print(" ");
                }
            }
            // Move to next line
            System.out.println();
        }
    }// End of main method
}// End of class