// Marshall Stallings
// hw07
// 3/22/16
// This program will print out triangles using different loops
import java.util.Scanner; // Import scanner
public class Triangles{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in); // Create scanner
        // Initalize variables
        int value;
        int k = 1;
        int m;
        boolean accept = false;
        // Ask for number
        System.out.print("Please enter a number between and including 5 & 30: ");
        // Create loop to ask if number doesn't work
        while (!accept){
            // Check to see if input is a number
            if (myScanner.hasNextInt()){
                // Save value and end loop
                value = myScanner.nextInt();
                accept = true;
                // Make sure value is within range
                if (value >= 5 && value <= 30){
                // Create for loop
                System.out.println("For loop: ");
                // Print out increasing numbers
                for (int i = 1; i <= value; i++){
                    // Print out doubles
                    for(int j = (value - 1); j >=(value - i); j--){
                        System.out.print(i);
                    }
                    // Move to next line
                    System.out.println();
                }
                // Print out decreasing numbers
                for(int i = 1; i <= value; i++){
                    // Print out doubles
                    for(int j = 1; j <=(value - i); j++){
                        System.out.print(value - i);
                    }
                    // Move to next line
                    System.out.println();
                }
                // Create while loop
                System.out.println("While loop: ");
                // Print out increasing numbers
                while (k <= value){
                    // Set m
                    m = (value - 1);
                    // Print out double
                    while (m >= (value - k)){
                        System.out.print(k);
                        m--;
                    }
                    // Move to next line
                    System.out.println();
                    k++;
                }
                // Reset k
                k = 1;
                // Print out decreasing numbers
                while (k <= value){
                    // Reset m
                    m = 1;
                    // Print out double
                    while(m <= (value - k)){
                        System.out.print(value - k);
                        m++;
                    }
                    // Move to next line
                    System.out.println();
                    k++;
                }
                // Create do-while loop
                System.out.println("Do-while: ");
                // Reset k
                k=1;
                // Print out increasing numbers
                do{
                    // Reset m
                    m = (value - 1);
                    // Print out double
                    do{
                       System.out.print(k);
                        m--; 
                    }while (m >= (value - k));
                    // Move to next line
                    System.out.println();
                    k++;
                }while( k <= value);
                // Reset k
                k = 1;
                // Print out increasing number
                do{
                    // Reset m
                    m = 1;
                    // Print out double
                    do{
                        System.out.print(value - k);
                        m++;
                    }while (m <= (value-k));
                    // Move to next line
                    System.out.println();
                    k++;
                }while(k < value);
                }
                else{
                    // Reset loop and value due to it not working
                    value = 0;
                    accept = false;
                    System.out.println("Please enter a value between and including 5 & 30.");
                    System.out.print("Please re-enter a number: ");
                }
            }
            else{
                // Get rid of input since it isn't a number
                String trash = myScanner.next();
                System.out.println("Please enter an integer.");
                System.out.print("Please enter a number between and including 5 & 30: ");
            }
        }
    }// End of main method
}// End of class