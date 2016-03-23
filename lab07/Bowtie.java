// Marshall Stallings
// 3/11/2016
// lab07
// This program will print out a bowtie using loops
import java.util.Scanner;// Import scanner
public class Bowtie{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);// Create scanner
        int nStar = 0;// Create star variable
        int i;
        int j;
        int m = 1;
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
                    
                    
                    
                    
                    
                    
                    
                    for(i = 1; i<=nStar; i+=2){
                        for(j = 0; j<(nStar-i); j++){
                            System.out.print("*");
                        }// End of printing for
                        System.out.println();
                        
                        while(m>=1){
                            System.out.print(" ");
                            m--;
                        }
                        switch (i){
                            case 1:
                                m +=2;
                                break;
                            case 3:
                                m +=3;
                                break;
                            case 5:
                                m +=4;
                                break;
                            case 7:
                                m +=5;
                                break;
                            case 9:
                                m +=6;
                                break;
                            case 11:
                                m +=7;
                                break;
                            case 13:
                                m +=8;
                                break;
                            case 15:
                                m +=9;
                                break;
                            case 17:
                                m +=10;
                                break;
                            case 19:
                                m +=11;
                                break;
                            case 21:
                                m +=12;
                                break;
                            case 23:
                                m +=13;
                                break;
                            case 25:
                                m +=14;
                                break;
                            case 27:
                                m +=15;
                                break;
                            case 29:
                                m +=15;
                                break;
                            case 31:
                                m +=17;
                                break;
                            case 33:
                                m +=18;
                                break;
                        }
                    }// End of Bowtie for
                   for(i=1; i<=nStar; i+=2){
                       for(j=nStar; j>=(nStar-i); j--){
                           System.out.print("*");
                       }
                       System.out.println();
                       while(m<=1){
                            System.out.print(" ");
                            m++;
                        }
                        switch (i){
                            case 1:
                                m +=2;
                                break;
                            case 3:
                                m +=3;
                                break;
                            case 5:
                                m +=4;
                                break;
                            case 7:
                                m +=5;
                                break;
                            case 9:
                                m +=6;
                                break;
                            case 11:
                                m +=7;
                                break;
                            case 13:
                                m +=8;
                                break;
                            case 15:
                                m +=9;
                                break;
                            case 17:
                                m +=10;
                                break;
                            case 19:
                                m +=11;
                                break;
                            case 21:
                                m +=12;
                                break;
                            case 23:
                                m +=13;
                                break;
                            case 25:
                                m +=14;
                                break;
                            case 27:
                                m +=15;
                                break;
                            case 29:
                                m +=15;
                                break;
                            case 31:
                                m +=17;
                                break;
                            case 33:
                                m +=18;
                                break;
                        }
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