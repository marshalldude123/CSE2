// Marshall Stallings
// hw 04
// 2/22/16
// This program will give the RGB colors in hexa decimal form
// Import scanner
import java.util.*;

public class ToHex{
    public static void main(String[] args){
        // initialize all variables
        int redValueRem = 0;
        int greenValueRem = 0;
        int blueValueRem = 0;
        int redValueFull = 0;
        int greenValueFull = 0;
        int blueValueFull = 0;
        int redValue = 0;
        int greenValue = 0;
        int blueValue = 0;
        // Create scanner
        Scanner myScanner = new Scanner( System.in );
        // Ask for RGB values
        System.out.println("Please enter three numbers that represent the RGB values: ");
        // Check to see if values are integers
        try{
        redValue = myScanner.nextInt();
        greenValue = myScanner.nextInt();
        blueValue = myScanner.nextInt();
        //
        // Make sure they are in the range from 0-255
        if (redValue>=0 && redValue<=255 && greenValue>=0 && greenValue<=255 && blueValue>=0 && blueValue<=255){
            // Convert to hex decimal
           redValueFull = redValue/16;
           // Convert to string
           String redString = "" + redValueFull;
           // Do above for other two values
           greenValueFull = greenValue/16;
           String greenString = "" + greenValueFull;
           blueValueFull = blueValue/16;
           String blueString = "" + blueValueFull;
           // Create hexValue to be updated in the future
           String hexValue = redString + greenString + blueString;
           // Do switch statement for exceptions (numbers outside 0-9) for the three values
            switch (redValueFull){
                case 10:
                    redString = "A";
                break;
                case 11:
                    redString = "B";
                break;
                case 12:
                    redString = "C";
                break;
                case 13:
                    redString = "D";
                break;
                case 14:
                    redString = "E";
                break;
                case 15:
                    redString = "F";
                break;
            }// End of red 
            switch (greenValueFull){
                case 10:
                    greenString = "A";
                break;
                case 11:
                    greenString = "B";
                break;
                case 12:
                    greenString = "C";
                break;
                case 13:
                    greenString = "D";
                break;
                case 14:
                    greenString = "E";
                break;
                case 15:
                    greenString = "F";
                break;
            }// End of green
            switch (blueValueFull){
                case 10:
                    blueString = "A";
                break;
                case 11:
                    blueString = "B";
                break;
                case 12:
                    blueString = "C";
                break;
                case 13:
                    blueString = "D";
                break;
                case 14:
                    blueString = "E";
                break;
                case 15:
                    blueString = "F";
                break;
            }// End of blue
            // Update HexValue
            hexValue = redString + greenString + blueString;
            // Modulate values next
            redValueRem = redValue%16;
            // Convert into string
            // Do previous to other two values
            String redStringRem = "" + redValueRem;
            greenValueRem = greenValue%16;
            String greenStringRem = "" + greenValueRem;
            blueValueRem = blueValue%16;
            String blueStringRem = "" + blueValueRem;
            // Update hexValue
            hexValue = redString + redStringRem + greenString + greenStringRem + blueString + blueStringRem;
            // Do switch statement for numbers other than 0-9 for each value
            switch (redValueRem){
                case 10:
                    redStringRem = "A";
                    break;
                case 11:
                    redStringRem = "B";
                break;
                case 12:
                    redStringRem = "C";
                break;
                case 13:
                    redStringRem = "D";
                break;
                case 14:
                    redStringRem = "E";
                break;
                case 15:
                    redStringRem = "F";
                break;
            }// End of red rem
            switch (greenValueRem){
                case 10:
                    greenStringRem = "A";
                break;
                case 11:
                    greenStringRem = "B";
                break;
                case 12:
                    greenStringRem = "C";
                break;
                case 13:
                    greenStringRem = "D";
                break;
                case 14:
                    greenStringRem = "E";
                break;
                case 15:
                    greenStringRem = "F";
                break;
            }// End of green rem
            switch (blueValueRem){
                case 10:
                    blueStringRem = "A";
                break;
                case 11:
                    blueStringRem= "B";
                break;
                case 12:
                    blueStringRem ="C";
                break;
                case 13:
                    blueStringRem = "D";
                break;
                case 14:
                    blueStringRem = "E";
                break;
                case 15:
                    blueStringRem = "F";
                break;
            }// End of blue rem
            //update hexValue
            hexValue = redString + redStringRem + greenString + greenStringRem + blueString + blueStringRem;
            // Print out hex decimal
            System.out.println("The decimal numbers R: "+ redValue + ", G: " + greenValue + ", B: " + blueValue + ", is represented in hexadecimal form as: " + hexValue);
        }// End of if statement
        else {
            System.out.println("Sorry must enter values between 0 and 255.");
        }
        
        }// End of try statement
        catch (InputMismatchException a){
            System.out.println("Sorry, your input must consist of integers.");
            }// End of catch statement
        
    }// End of main method
}// End of class