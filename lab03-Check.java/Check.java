// Marshall Stallings
// lab03-Check.java
// 2/12/16
//
// This program will get the original cost of a check, percentage tip, 
// and how many ways to split the check
import java.util.Scanner;
public class Check {
    // Main method for the program
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        // To get the original cost of the bill
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        // Create a variable for the bill
        double checkCost = myScanner.nextDouble();
        // Ask for the tip
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the for xx): ");
        // Create a variable for the tip
        double tipPercent = myScanner.nextDouble();
        // Convert the percent to a decimal
        tipPercent /= 100;
        // Ask how many people there are
        System.out.print("Enter the number of people who went out to dinner: ");
        // Create a variable for the number of people
        int numPeople = myScanner.nextInt();
        //
        // Print out output
        //
        // Create variables for total cost and cost per person
        double totalCost;
        double costPerPerson;
        // Whole dollar amount and for storing digits to the right
        // of the decimal point for the cost
        int dollars; 
        int dimes;
        int pennies;
        // Calculate the total cost
        totalCost = checkCost * (1 + tipPercent);
        // Calculate price per person
        costPerPerson = totalCost / numPeople;
        // Get whole amount, dropping decimal fraction
        dollars = (int) costPerPerson;
        // Dime amount
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes = (int) (costPerPerson * 10) % 10;
        // Penny amount
        pennies = (int) (costPerPerson * 100) % 10;
        //Print out cost per each person
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    } // End of main method
} // End of class