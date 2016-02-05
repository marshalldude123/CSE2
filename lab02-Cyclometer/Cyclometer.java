// Marshall Stallings
// 2/5/16
// Cyclometer Java Program
// Program will print number of minutes and counts for each trip
// Also will print distance in miles and distance for two trips combines

public class Cyclometer {
    // Main method for java program
    public static void main(String[] args){
        int secsTrip1 = 480; // Time for first trip
        int secsTrip2 = 3220; //Time for second trip
        int countsTrip1 = 1561; // Counts for first trip
        int countsTrip2 = 9037; // Counts for second trip
        //
        // Store constants and create variables
        double wheelDiameter = 27.0; // Constant for calculations
        double PI = 3.14159; // Constant for calculations
        int feetPerMile = 5280; // Constant for calculations
        int inchesPerFoot = 12; // Constant for calculations
        int secondsPerMinute = 60; // Constant for calculations
        double distanceTrip1, distanceTrip2, totalDistance; // Creating variable to store data
        //
        // Print out Minutes and counts
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
        //
        // Calculate distance values
        distanceTrip1 = countsTrip1 * wheelDiameter * PI; // Distance in inches
        distanceTrip1/= inchesPerFoot * feetPerMile; // Converts inches to miles
        // Do same caculation for trip 2 in one step
        distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile; // Distance in miles for trip 2
        totalDistance = distanceTrip1 + distanceTrip2; // Gives total distance traveled
        //
        // Print out distances
        System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
        System.out.println("The total distnace was " + totalDistance + " miles.");
        
    } // Main method end
} // Class end