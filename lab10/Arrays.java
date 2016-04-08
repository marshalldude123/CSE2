// Marshall Stallings
// lab 10
// 4/8/16
// This lab will create two arrays to be filled by the user
import java.util.Scanner;// Import scanner
import java.util.Random;// Import random number generator
public class Arrays{
    public static void main(String[] args){
        Random randomNum = new Random();// Create random number generator
        Scanner myScanner = new Scanner(System.in);// Create scanner
        final int numOfStudents = randomNum.nextInt(5) + 5;// Create range for array
        String[] studentName = new String[numOfStudents];// Create student name array
        int[] studentGrade = new int[numOfStudents];// Create grade array
        System.out.println("Please enter " + numOfStudents + " student names: ");// Tell user how many names to enter
        // Create loop to fill name array 
        for(int i = 0; i<numOfStudents;i++){
            studentName[i] = myScanner.nextLine();// Take user's input and store into array
        }// End of name loop
        // Create loop to fill grade array
        for(int i = 0; i<numOfStudents;i++){
            studentGrade[i] = (int)(Math.random() * 100);// Assign a random number to each grade
        }// End of grade loop
        System.out.println("The midterm grades of the previous 5 students are: ");
        // Create loop to print out arrays
        for(int i = 0; i<numOfStudents; i++){
            System.out.println(studentName[i] + " : " + studentGrade[i]);
        }// End of printing loop
    }// End of main method
}// End of class
