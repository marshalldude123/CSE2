// Marshall Stallings
// lab 10
// 4/8/16
// This lab will create two arrays to be filled by the user
import java.util.Scanner;// Import scanner
import java.util.Random;// Import random number generator
public class Arrays{
    public static void main(String[] args){
        Random randomNum = new Random();
        Scanner myScanner = new Scanner(System.in);
        final int numOfStudents = randomNum.nextInt(5) + 5;
        String[] studentName = new String[numOfStudents];
        int[] studentGrade = new int[numOfStudents];
        System.out.println("Please enter " + numOfStudents + " student names: ");
        for(int i = 0; i<numOfStudents;i++){
            studentName[i] = myScanner.nextLine();
        }// End of name loop
        for(int i = 0; i<numOfStudents;i++){
            studentGrade[i] = (int)(Math.random() * 100);
        }// End of grade loop
        System.out.println("The midterm grades of the previous 5 students are: ");
        for(int i = 0; i<numOfStudents; i++){
            System.out.println(studentName[i] + " : " + studentGrade[i]);
        }// End of printing loop
    }// End of main method
}// End of class
