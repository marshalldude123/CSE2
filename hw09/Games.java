// Marshall Stallings
// 3/29/16
// hw09
// This program will be a game where the user chooses between 3 games and then plays that game
import java.util.Random; // Import random
import java.util.Scanner; // Import scanner
public class Games{
    public static String guessTheBox(int input){
        // Initialize variables
        String box1 = "Sorry you didn't win.";
        String box2 = "Sorry you didn't win.";
        String box3 = "Sorry you didn't win.";
        String answer = "";
        // Create random generator
        Random randomGenerator = new Random();
        // Generate random number for each box
        int randomNumber = randomGenerator.nextInt(3);
        // Asign prize to box
        switch(randomNumber){
            case 0:
                box1 = "You won!!";
            break;
            case 1:
                box2 = "You won!!";
            break;
            case 2:
                box3 = "You won!!";
            break;
        } // End of assignment switch
        // Check to see what box user chooses
        switch(input){
            case 1:
                answer = box1;
            break;
            case 2:
                answer = box2;
            break;
            case 3:
                answer = box3;
            break;
        } // End of user choice switch
        // Return answer
        return answer;
    }// End of guessTheBox game
    public static String spinTheWheel(String userColor, int userNumber){
        // Create variables
        String answer = "";
        String number = "";
        String color = "";
        String winner = "You won!!";
        String loser = "Sorry you lost.";
        // Create random generator
        Random randomGenerator = new Random();
        // Generator a random number
        int randomNumber = randomGenerator.nextInt(5);
        // Assign value to number based off of random number
        switch(randomNumber){
            case 0:
                number = "1";
            break;
            case 1:
                number = "2";
            break;
            case 2:
                number = "3";
            break;
            case 3:
                number = "4";
            break;
            case 4:
                number = "5";
            break;
        }// End of number switch
        // Generator a random number for color
        int randomColor = randomGenerator.nextInt(2);
        // Assign the color based on random number
        switch(randomColor){
            case 0:
                color = "red";
            break;
            case 1:
                color = "black";
            break;
        }// End of color switch
        // Create answer
        answer = color + number;
        // Check what user inputed
        if ((userColor + userNumber) == answer){
            // Return winner
            return winner;
        }// End of winner if
        else{
            // Return winner
            return loser;
        }// End of loser else
    }// End of spinTheWheel game
    // Couldn't figure out how to do it using substring so this is what I did
    public static String wordScramble(String input){
        String answer = "";
        // if the user enters a single letter
        if(input.length() <= 1){
            answer = input;
            return answer;
        }// End of single letter if
        // Get range of word
        int halfWord = (input.length()) / 2;
        // Scramble first half of word
        String firstHalf = wordScramble(input.substring(0,halfWord));
        // Scramble second half of word
        String secondHalf = wordScramble(input.substring(halfWord));
        // Print out different scramble versions based on random number
        if (Math.random() > 0.5) {
            answer = firstHalf + secondHalf;
            return answer;
        }
        else {
            answer = secondHalf + firstHalf;
            return answer;
        }
        
    }// End of scrambler method
    public static void main(String[] args){
        String guessTheBox = "guessTheBox";
        String spinTheWheel = "spinTheWheel";
        String scrambler = "scrambler";
        // Create boolean for while loop
        boolean accept = false;
        // Create Scanner
        Scanner myScanner = new Scanner(System.in);
        // Welcome the user to the game
        System.out.println("Welcome to Marshall's fun house.");
        while (!accept){
        // Ask for what game they want to play
            System.out.print("Please enter the game you would like to play: ");
            String gameType = myScanner.nextLine();
            // Check to see what game
            if (gameType.equals(guessTheBox)){
                // Create boolean for while
                boolean correct = false;
                // Explain the game
                System.out.println("In this game you will choose bewtween 3 boxes and one of the boxes will have a prize in it.");
                while (!correct){
                    // Ask for user input
                    System.out.print("Please guess your box number: ");
                    // Store the number
                    int boxNumber = myScanner.nextInt();
                        // Check to see if it is in range
                        if(boxNumber == 1 || boxNumber == 2 || boxNumber == 3){
                            String gameResult = guessTheBox(boxNumber);
                            System.out.println(gameResult);
                            accept = true;
                            correct = true;
                        }// End of calling if
                        else{
                            correct = false;
                            boxNumber = 0;
                            System.out.println("Please enter 1, 2, or 3 for the box you choose.");
                        }
                }// End of guessTheBox while
            }// If statement for guessTheBox
            else if (gameType.equals(spinTheWheel)){
                // Create variables for different inputs
                String black = "black";
                String red = "red";
                String Black = "Black";
                String Red = "Red";
                // Create while boolean
                boolean correct = false;
                System.out.println("In this game you will choose either red or black and a number between 1 and 5. Based on what you choose you could win a prize.");
                while(!correct){
                    // Ask for color
                    System.out.print("Please enter your color choice: ");
                    // Save color choice
                    String userColor = myScanner.nextLine();
                    if(userColor.equals(black) || userColor.equals(Black) || userColor.equals(red) || userColor.equals(Red)){
                        // Create second loop for number input
                        boolean correct2 = false;
                        while(!correct2){
                            // Set end first while
                            correct = true;
                            // Ask for number
                            System.out.print("Please enter your number choice: ");
                            // Save number choice
                            int userNumber = myScanner.nextInt();
                            if(userNumber == 1 || userNumber == 2 || userNumber == 3 || userNumber == 4 || userNumber == 5){
                                String gameResult = spinTheWheel(userColor, userNumber);
                                System.out.println(gameResult);
                                correct2 = true;
                                accept = true;
                            }// End of number if
                            else{
                                userNumber = 0;
                                correct2 = false;
                                System.out.println("Please enter a number between 1 and 5.");
                            }// End of number else
                        }// End of number while
                    }// End of color if
                    else{
                        userColor = null;
                        correct = false;
                        System.out.println("Please enter either red or black.");
                    }// End of color else
                }// End of spinTheWheel while
                
                
            }// If statement for spinTheWHeel
            else if (gameType.equals(scrambler)){
                // Create boolean for checking while
                boolean correct = false;
                String userWord = "";
                // Explain the game
                System.out.println("In the game you will enter a word to be scrambled.");
                while(!correct){
                    // Ask for word
                    System.out.print("Please enter a word to be scrambled: ");
                    // Save word
                    userWord = myScanner.nextLine();
                    // This was the only way I could figure out how to check to see if a input was a word
                    // convert the word to an array
                    char[] chars = userWord.toCharArray();
                    // Create another boolean so not to get kicked out of the while loop
                    boolean f = false;
                    // Check each letter individually
                    for (char c : chars) {
                        if(!Character.isLetter(c)) {
                            f = true;
                        }// End of if statement
                    }// End of for loop
                    // if it is a word then it will end the while loop
                    if(!f){
                        correct = true;
                    }// End of if
                    f=false;
                }// End of checking while in scrambler
                String result = wordScramble(userWord);
                // print answer
                System.out.println(result);
                // End loop
                accept = true;
            }// If statement for wordScrambler
            
            else{
            gameType = null;
            System.out.println("Please choose from guessTheBox, spinTheWheel, or scrambler.");
            
            }// End of else 
        }// End of asking while
        
    }// End of main method
}// End of class