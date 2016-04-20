// Marshall Stallings
//4/16/16
// hw12
// This program will create a user input array, search through that array using linear search
import java.util.Scanner; // Import scanner
public class CSE2Linear{
    // Create search method
     public static void linearSearch(int[] array, int input){
         // Create some variables
        int reached = 0;
        int count = 1;
        int length = array.length;
        // check each memeber of the array
        for (int i = 0; i<length; i++){
            // Create a way for computer to jump out of the loop once the value is found
            if(array[i]==input){
                reached = 1;
                break;
            }// End of maxValue if
            // Keep track of how many members it searched through
            count++;
        }// End of for loop to go through the array
        // Printing stuff depending if value was found or not
        if(reached == 1){
            System.out.println("The number " + input + " was found in " + count + " iterations.");
        }
        else{
            System.out.println("The number " + input + " was not found.");
        }
    }// End of linear search method
    // Create scrambling method
    public static int[] scramble(int[] array){
        // GO through each member
        for (int i=0; i<array.length; i++) {
	        //create a random number
	        int ranNum = (int) (array.length * Math.random() );
	        //swap the values of the array with the generated one
        	int temp = array[ranNum];
	        array[ranNum] = array[i];
	        array[i] = temp;
        }// End of for loop
        return array;
    }// End of scramble method

    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);// Create scanner
        // Initialize variables
        boolean correct = false;
        int value = 0;
        int[] array1 = new int[15];// Create random number array
        // Create array
        for(int i = 0; i<15; i++){
            correct = false;
            System.out.print("Please enter a value: "); // Ask for value
            // Create loop to coninuously ask for values if input is wrong
            while(!correct){
                // Make sure input is an int
                if(myScanner.hasNextInt()){
                    // Assign the input to a varaible
                    value = myScanner.nextInt();
                    // See if variable isn't within the bounds
                    if(value<0 || value > 100){
                        // Reset value
                        value = 0;
                        // Tell the error and ask for another input
                        System.out.println("Please enter a number between and including 0 and 100.");
                        System.out.print("Please re-enter a value: ");
                    }
                    // See if value is smaller than previous input
                    if (i>0 && value < array1[i - 1]){
                        // Reset balue
                        value = 0;
                        // Tell the error and ask for another input
                        System.out.println("Please make sure the previous value is less than the next value.");
                        System.out.print("Please re-enter a value: ");
                    }
                    // If everything is correct assign the value to the array and end loop
                    else {
                        array1[i] = value;
                        correct = true;
                    }
                }
                // What to do if input isn't an int
                else{
                    String trash = myScanner.next();
                    System.out.print("Please enter an int.");
                }
            }
        }
        // Print out array
        System.out.println("Here are the values you entered: ");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        // Ask for a value to search for
        System.out.println("Please enter a number to be searched for: ");
        int key = myScanner.nextInt();
        // Call searcing method
        linearSearch(array1, key);
        // Scramble the array
        array1 = scramble(array1);
        // Print scrambled array
        System.out.println("The scrambled array is: ");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        // Ask for a value to search for
        System.out.println("Please enter a number to be searched for: ");
        key = myScanner.nextInt();
        // Call search method
        linearSearch(array1, key);
    }// End of main method
}// End of class