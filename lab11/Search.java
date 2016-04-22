// Marshall Stallings
// 4/15/16
// Lab 11
// This lab will create two arrays and will search through the arrays using linear and binary search
import java.util.Random;
import java.util.Scanner;
public class Search{
    public static void linearSearch(int[] array){
        int maxValue = 0;
        int minValue = 0;
        int length = array.length;
        for (int i = 0; i<length; i++){
            if(array[i]>maxValue){
                maxValue = array[i];
            }// End of maxValue if
            else if (array[i]<maxValue){
                minValue = array[i];
            }// End of minValue if
        }// End of for loop to go through the array
        System.out.print("The max value for this array is: " + maxValue + " and the min value is: " + minValue + ".");
    }// End of linear search method
    public static void binarySearch(int[] array, int input){
       int lowBound = 0;
       int highBound = 50;
       int upperValue = 0;
       int lowerValue = 0;
       
       while(lowBound <= highBound){
           int middleValue = lowBound + (highBound - lowBound)/2;
           if (array[middleValue]>input){
               highBound = middleValue - 1;
               upperValue = array[middleValue];
           }
           else if (array[middleValue]<input){
              lowBound = middleValue + 1;
              lowerValue = array[middleValue]; 
           }
           else if (array[middleValue] == input){
               System.out.println("The number was found.");
               
           }
           else if (lowBound == highBound){
               System.out.println("The value was not found.");
               System.out.println("The value above the key: " + upperValue);
               System.out.println("The value below the key: " + lowerValue);
               
           }
       }
        
    }
    public static void main(String[] args){
        Random randomNum = new Random();// Create random number generator
        Scanner myScanner = new Scanner(System.in);// Create scanner
        int[] ranArray = new int[50];// Create random number array
        int[] incArray = new int[50];// Create increasin number array
        boolean ordered = false;
        int placeHolder = 0;
        for(int i = 0; i<ranArray.length; i++){
            ranArray[i] = randomNum.nextInt(100);
        }// Fill the array with random numbers;
        for(int i = 0; i<incArray.length;i++){
            incArray[i] = (randomNum.nextInt(100));
        }// Fill the array with increasing random numbers
        for(int i = 1; i<incArray.length;i++){
            if(incArray[i - 1]>incArray[i]){
                placeHolder = incArray[i];
                incArray[i] = incArray[i - 1];
                incArray[i - 1] = incArray[i];
            }
            else{
                break;
            }
        }
        System.out.println("Array1: ");
        linearSearch(ranArray);
        System.out.println();
        System.out.println("Array2: ");
        linearSearch(incArray);
        System.out.println();
        System.out.print("Please enter an integer: ");
        if(myScanner.hasNextInt()){
            int searchKey = myScanner.nextInt();
            if (searchKey <=0){
                System.out.println("You did not enter a positive integer.");
            }
            else{
                binarySearch(incArray, searchKey);
            }
        }
        else{
            System.out.println("You did not enter an int.");
        }
    }// End of main method
}// End of class