// Marshall Stallings
// 3/11/2016
// lab07
// This program will print out a bowtie using loops
import java.util.Scanner;// Import scanner
public class Bowtie{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);// Create scanner
        int nStar = 0;// Create star variable
        while (nStar <= 0){
            System.out.print("Please enter the number of stars to be printed: ");// Ask for a number
            // Check to see if it is an integer
            if(myScanner.hasNextInt()){
                nStar = myScanner.nextInt();// Store the value
                // Check to make sure value is in range
                if (nStar%2 == 0){
                    nStar = 0;
                    System.out.println("Please enter an odd integer.");
                    break;
                }
                if ((nStar>=3) && (nStar<=33)){
                    
                  int radius = (nStar/2) + 2;

                    for (int i = -radius; i <= radius; i++) {
                        for (int j = -radius; j <= radius; j++) {
                            if (i*i <= j*j) System.out.print(" ");
                            else            System.out.print("*");
                        }
                        System.out.println();
                    }
                
                   
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                       }// End of if with code
                else{
                    nStar = 0;
                    System.out.println("Please enter a number between and including 3 and 33.");// Print error
                }// End of else
            }// End of int checking if
            else {
                String trash = myScanner.next();// Store value so loop will run
                System.out.println("Please enter a positive integer.");// Print error
            }// End of else
        }// End of main while
    }// End of main method
}// End of class