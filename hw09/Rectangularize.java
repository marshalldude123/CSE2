// Marshall Stallings
// 3/29/16
// hw09
// This program will generate a triagnle based on the user input
import java.util.Scanner; // Import scanner
public class Rectangularize{
    // Firs method using int
    public static void rectangle(int userInput){
        // Int variables
        int count2 = 1;
        String print = "%";
        // Determines line
        for (int counter1 = 1; counter1 <= userInput; counter1++){
            // Print out line
            while (count2<=userInput){
                System.out.print(print);
                count2++;
            }// End of print while
            // Reset counter2
            count2 = 1;
            System.out.println();
        }// End of line for
    }// End of int method
    public static void rectangle(String userInput){
        // Get length of word
        int wordLength = userInput.length();
        // Print out word based on number of letters in word
        for(int counter1 = 1; counter1 <= wordLength; counter1 ++){
            System.out.println(userInput);
        }
    }// End of string method
    public static void main(String[] args){
        // Create Scanner
        Scanner myScanner = new Scanner(System.in);
        // Ask for input
        System.out.print("Enter a number or a word: ");
        // Save input into a string
        String userInput = myScanner.nextLine();
        // Create variable to check if string
        int f = 0;
        // This was the only I could figure out how to check if input was a number or string
        // Save chars into an array
        char[] chars = userInput.toCharArray();
        // Check each letter individually
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                // if input is a number set f to 1
                f = 1;
            }// End of if statement
        }// End of for loop
        // Check to see if it is a number of not
        if(f == 1){
            // Convert string to number
            int userInput2 = Integer.parseInt( userInput );
            // Print
            System.out.println("Output:");
            rectangle(userInput2);
            }// End of if
        else{
            // Since not a number just print
            System.out.println("Output:");
            rectangle(userInput);
        }// End of else        
    }// End of main method
}// End of class