// Marshall stallings
// 4/22/16
// lab12
// this program will create a 2D array, fill it with values, and then sort the array
import java.util.Scanner;
import java.util.Random;
public class Sorting{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();
        System.out.print("Please enter a length for the array: ");
        int arrayLength = input.nextInt();
        int array[][] = new int[arrayLength][];
        // Create array
        for(int i = 0;i<arrayLength; i++){
            int randomLength = randomNum.nextInt(arrayLength) + 1;
            if(randomLength == arrayLength){
                randomLength = randomLength - 1;
            }
            array[i] = new int [randomLength];
            for (int j = 0; j<array[i].length; j++){
                array[i][j] = randomNum.nextInt(21);
            }
        }
        // Print array
        System.out.println("The array is: ");
        for(int i = 0; i<arrayLength; i++){
            for(int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // Sort each array
        int temp2 = 0;
        for(int i = 0;i<array.length;i++){
            for(int j = 1;j<array[i].length;j++){
                int arrow = j;
                while(array[i][arrow] < array[i][arrow - 1]){
                    temp2 = array[i][arrow - 1];
                    array[i][arrow - 1] = array[i][arrow];
                    array[i][arrow] = temp2;
                    arrow--;
                    if(arrow == 0){
                        break;
                    }
                }
            }
        }
        
        // Print array
        System.out.println("Sorted array by value: ");
        for(int i = 0; i<arrayLength; i++){
            for(int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // Sort array lengths
        int [] temp;
        for(int i = 1; i<array.length;i++){
            int point = i;
            while(array[point].length < array[point - 1].length){
                temp = array[point - 1];
                array[point - 1] = array[point];
                array[point] = temp;
                point--;
                if(point ==0){
                    break;
                }
            }
            
        }
        System.out.println("Sorted array by length: ");
        for(int i = 0; i<arrayLength; i++){
            for(int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int done = 0;
        System.out.print("Please enter a value to be searched for: ");
        int key = input.nextInt();
        for (int i = 0; i<arrayLength; i++){
            for(int j = 0; j<array[i].length; j++){
                if (array[i][j] == key){
                    System.out.println("Column " + i + " Row "+ j);
                    done = 1;
                }
            }
        }
        if(done !=1){
            System.out.println("The value wasn't found.");
        }
    }// End of main method
}// End of class