// Marshall Stallings
// 4/18/16
// hw12
// This program will manipulate an array based off created methods
import java.util.Scanner;
import java.util.Random; // Import random
public class RemoveElements{
    public static int[] randomInput(){
        // Create array
        int [] array = new int[10];
        // Create random number generator
        Random randomGenerator = new Random();
        // Assign each member of array a random number
        for ( int i =0; i< array.length;i++){
            array[i] = randomGenerator.nextInt(10);
        }
        return array;
    }
    public static int[] delete(int[] list, int pos){
        // Create a second array that is 1 less than 10
        int[] array2 = new int[9];
        // Make sure the input value is within bounds
        if(pos<0||pos>9){
            System.out.println("Out of bounds.");
            return list;
        }
        // Assign values from old list to new list up to the position value
        for (int i = 0; i<pos;i++){
            array2[i] = list[i];
        }
        // Assign value from old list after the position value to the new array
        for (int i = pos; i<array2.length; i++){
            array2[i] = list [i+ 1];
        }
        return array2;
    }
    public static int[] remove(int[] list, int target){
        // Initialize variables
        int counter = 0;
        int h = 0;
        boolean done = false;
        // See how many times the arget value appears
        for (int i = 0; i<list.length; i++){
            if (target == list[i]){
                counter++;
            }
        }
        // Make a new array the is the length minus the target values
        int[] array2 = new int[10-counter];
        // Assign each value
        for (int i =0; i<array2.length;i++){
            while(!done){
                // Go through each value of the old array
                while(h <10){
                    // Assign value from old array to new array minus the target values
                    if (list[h] != target){
                        array2[i] = list[h];
                        done = true;
                        h++;
                        break;
                    }
                    // move to next value if the if statement was not reached
                    h++;
                }
            }
            // Reset done for next value
            done = false;
        }
        return array2;
    }
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
      	System.out.print("Random input 10 ints [0-9]");
      	num = randomInput();
      	String out = "The original array is:";
      	out += listArray(num);
      	System.out.println(out);
     
      	System.out.print("Enter the index ");
      	index = scan.nextInt();
      	newArray1 = delete(num,index);
      	String out1="The output array is ";
      	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out1);
     
          System.out.print("Enter the target value ");
      	target = scan.nextInt();
      	newArray2 = remove(num,target);
      	String out2="The output array is ";
      	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out2);
      	 
      	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
      	if(j>0){
        	out+=", ";
      	}
      	out+=num[j];
	}
	out+="} ";
	return out;
  }
}
