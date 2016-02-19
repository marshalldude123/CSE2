// Marshall Stallings
// lab 04
// 2/19/16
// This program will pick a random card for a deck of cards
public class CardGenerator{
    public static void main(String[] args){
        // Set up variables
        String cardSuit = "";
        String cardType = "";
        // Generate a number between 1 and 13 
        int cardGenerator = (int)(Math.random() * 12) + 1;
        // Divide by 4 and use remainder to decide the suit
        switch (cardGenerator%4){
            case 1:
                cardSuit = "Diamond";
            case 2:
                cardSuit = "Clubs";
                break;
            case 3:
                cardSuit = "Hearts";
                break;
            case 4:
                cardSuit = "Spades";
                break;
        }
        // Divide by 13 and use remainder to decide the number
        switch (cardGenerator%13){
            case 1:
                cardType = "Ace";
                break;
            case 2:
                cardType = "2";
                break;
            case 3:
                cardType = "3";
                break;
            case 4:
                cardType = "4";
                break;
            case 5:
                cardType = "5";
                break;
            case 6:
                cardType = "6";
                break;
            case 7:
                cardType = "7";
                break;
            case 8:
                cardType = "8";
                break;
            case 9:
               cardType = "9";
                break;   
            case 10:
                cardType = "10";
                break;
            case 11:
                cardType = "Jack";
                break;
            case 12:
                cardType = "Queen";
                break;
            case 13:
                cardType = "King";
                break;
        }
        // Print output
    System.out.println("You pick a " + cardType + " of " + cardSuit +".");
     
    }// End of main method
}// End of class