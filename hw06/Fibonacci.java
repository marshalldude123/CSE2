// Marshall Stallings
// 3/6/16
// hw06
// This program will create a custom fibonacci sequence
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        // Create scanner
        Scanner myScanner = new Scanner( System.in );
        // Create variables
        int count= 3;
        int variable1 = 0;
        int variable2= 0;
        int length = 0;
        int nextNumber = 0;
        // Check first variable
        while (variable1 <=0){
            System.out.print("Please enter the first number in the sequence: ");
            // Make sure input is an integer
            if (myScanner.hasNextInt()){
                variable1 = myScanner.nextInt();
                // Make sure input is positive
                if (variable1 <=0){
                    System.out.println("Please insert a positive integer.");
                }// End of if nested
            }// End of if
            else {
                String trash = myScanner.next();
                System.out.println("Please enter a positive integer.");
            }// End of else
        }// End of while
        while (variable2 <=0){
            System.out.print("Please enter the second number in the sequence: ");
            // Make sure input is an integer
            if (myScanner.hasNextInt()){
                variable2 = myScanner.nextInt();
                // Make sure input is positive
                if (variable2 <=0){
                    System.out.println("Please insert a positive integer.");
                }// End of if nested
            }// End of if
            else {
                String trash = myScanner.next();
                System.out.println("Please enter a positive integer.");
            }// End of else
        }// End of while
        while (length <=0){
            System.out.print("Please enter the length of the sequence: ");
            // Make sure input is an integer
            if (myScanner.hasNextInt()){
                length = myScanner.nextInt();
                // Make sure input is positive
                if (length <=0){
                    System.out.println("Please insert a positive integer.");
                }// End of if nested
            }// End of if
            else {
                String trash = myScanner.next();
                System.out.println("Please enter a positive integer.");
            }// End of else
        }// End of while
        System.out.println("The numbers are: ");
        // Print out first two numbers
        System.out.print(variable1 + ", " + variable2 + ", ");
        // Calculate next numbers
        while (count <= length){
            nextNumber = variable1 + variable2;
            variable1 = variable2;
            variable2 = nextNumber;
            // Print out next numbers
            System.out.print(nextNumber);
            // Add comma
            if(count < length){
                System.out.print(", ");
            }// End of if
            // Add period to last number
            else {
                System.out.print(".");
            }// End of else
            // Increment counter
            count++;
        }// End of sequence while
        System.out.println();
    }// End of main method
}// End of class