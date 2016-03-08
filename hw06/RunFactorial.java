// Marshall Stallings
// 3/6/16
// hw06
// This program will calculate the factorials of numbers
import java.util.Scanner;
public class RunFactorial{
    public static void main(String[] args){
        // Create scanner
        Scanner myScanner = new Scanner( System.in );
        // create variables
        int value = 0;
        int count = 1;
        int answer = 1;
        // Create loop to check input
        while (value <= 0){
            System.out.print("Please insert a value between 9 and 16: ");
            // Check to see if input was a integer
            if (myScanner.hasNextInt()){
                // Store value
                value = myScanner.nextInt();
                // Check to see if input is in the range
                if ((value <= 16) && (value >=9)){
                    // Calculate factorial
                    while (count <= value){
                        answer = answer * count;
                        count++;
                    }// End of while
                    // Print out factorial
                    System.out.println("The factorial of " + value + " is equal to " + answer);
                }// End of if
                // what will print if input isn't in range
                else {
                    // Set value to 0 so while loop will ask for user input again
                    value = 0;
                    System.out.println("Please insert a value between 9 & 16.");
                }// End of else
            }// End of if
            else {
                String trash = myScanner.next();
                System.out.println("Please insert an integer.");
            }// End of else
        }// End of while
    }// End of main method
}// End of class