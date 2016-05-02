// Marshall Stallings
// 4/25/16
// hw13
// This program will simulate holoporting
import java.util.Random; // Import random generator
import java.util.Scanner; // Import scanner
public class Holoporter{
    public static String[][][] soRandom(){
            Random randomNum = new Random();
            int length = randomNum.nextInt(9) + 1; //Create a random length
            String array[][][] = new String [length][][];//Assign the length to the outer most array
            // Create other lengths
            for (int i = 0; i<array.length; i++){//Go through each member of the outer array
                int randomLength = randomNum.nextInt(9) + 1;//Create a random length
                array[i] = new String [randomLength][];//Assign the length to the middle array
                for(int j = 0; j<array[i].length;j++){//Go through each member of the middle array
                    int randomLength2 = randomNum.nextInt(9) + 1;//Create a random length
                    array[i][j] = new String [randomLength2];//Assign the length to the inner most array
                }
            }
            return array;//Return the array
        }//End of array creator
        public static String coder(){
            Random randomNum = new Random();//Import random generator
            String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};//Create an array to store the alphabet
            String code = alphabet[randomNum.nextInt(26)] + alphabet[randomNum.nextInt(26)] + randomNum.nextInt(10) + randomNum.nextInt(10) + randomNum.nextInt(10) + randomNum.nextInt(10);//Generate the code
            return code;//Return the generated code
        }
        public static String [][][] holoport(String [][][] original, String [][][] holder){
            if(original.length > holder.length){//Check lengths
                for (int i = 0; i<holder.length; i++){//Go through outer part of array
                    if(original[i].length > holder[i].length){//Check length
                        for(int j = 0; j<holder[i].length;j++){//Go through middle part of array
                            if(original[i][j].length > holder[i][j].length){//Check lengths
                                for(int k = 0; k<holder[i][j].length; k++){//Go through inner part of array
                                    holder[i][j][k] = original[i][j][k];//Copy values
                                }
                            }
                            else{//if holder is bigger
                                for(int h = 0; h < original[i][j].length; h++){//copy first half of original
                                    holder[i][j][h] = original[i][j][h];
                                }
                                for(int g = original[i][j].length;g<holder[i][j].length;g++){//Add $$$$$ for rest
                                    holder[i][j][g] = "$$$$$$";
                                }
                            }
                        }
                    }
                    else{
                        for(int u = 0; u<original[i].length;u++){//Copy first half
                            holder[i][u] = original[i][u];
                        }
                        for(int f = original[i].length;f<holder[i].length;f++){//Truncate rest of arrays
                            holder[i][f] = new String [0];
                        }
                    }
                }
            }
            else{
                for(int b = 0; b<original.length;b++){//Copy first half
                    holder[b] = original[b];
                }
                for(int e = original.length;e<holder.length;e++){//Truncate rest of arrays
                    holder[e] = new String [0][];
                }
            }
            return holder;
        }//End of holopoter
        public static void printer(String[][][] array){
            for(int i= 0; i<array.length;i++){//Go through outer
                for(int j= 0; j<array[i].length;j++){//Go through middle
                    System.out.print("[");
                    for(int k = 0; k<array[i][j].length; k++){//Go through inner
                        if(k == (array[i][j].length - 1)){//Pirnt first value
                            System.out.print(array[i][j][k]);
                        }
                        else{
                            System.out.print(array[i][j][k] + ", ");//print next values
                        }
                    }
                    System.out.print("]");
                    if (j != (array[i].length - 1)){
                    System.out.print("|");
                    }
                }
                if(i != (array.length - 1)){
                    System.out.print("---");
                }
            }
        }//End of printer 
        public static void sampling(String[][][] array, String key){
            int i = 0, j = 0, k = 0;
            boolean located = false;
            for(i = 0; i<array.length;i++){//GO through outter
                for(j = 0; j<array[i].length;j++){//Go through middle
                    for(k = 0; k<array[i][j].length;k++){//Go through inner
                        if(array[i][j][k].equals(key)){// Check to see if value equals key
                            located = true;
                        }
                        if(located){
                            break;
                        }
                    }
                    if(located){
                        break;
                    }
                }
                if(located){
                    break;
                }
            }
            if (located == true){//What to do if key was found
                System.out.println("The code was found at x: " + i + " y: "+ j+ " z: " + k);
            }
            else{//What to do if key wasn't found
                System.out.println("The code was not found.");
            }
        }
        public static void percentage(String[][][] original, String[][][] holoport){
            double originalCounter = 0;
            double holoportCounter = 0;
            for(int i = 0; i<original.length;i++){//Go through outter
                for(int j = 0; j<original[i].length;j++){//Go through middle
                    for(int k = 0;k<original[i][j].length;k++){//Go through inner
                        originalCounter++;//Count each member
                    }
                }
            }
            //Do same for other array
            for(int l=0;l<holoport.length;l++){
                for(int m=0;m<holoport[l].length;m++){
                    for(int o=0;o<holoport[l][m].length;o++){
                      holoportCounter++;  
                    }
                }
            }
            //Calculate percentage
            int percentage = (int) (((holoportCounter - originalCounter) / originalCounter) * 100);
            System.out.println("The percent holoported is: " + percentage + "%");
        }
        public static String[][][] frankenstein(String[][][] original){
            String temp = "";
            for(int i = 0; i<original.length;i++){//GO through outter
                for(int j = 0; j<original[i].length;j++){//Go through middle
                    for(int k = 1; k<original[i][j].length;k++){//Go through inner
                        int arrow = k;
                        while(original[i][j][arrow].compareTo(original[i][j][arrow - 1]) < 0){//Check each member
                        //Swap members
                            temp = original[i][j][arrow- 1];
                            original[i][j][arrow - 1] = original[i][j][arrow];
                            original[i][j][arrow] = temp;
                            arrow--;
                            if(arrow ==0){
                                break;
                            }
                        }
                    }
                }
            }
            String [] temp2;
            //DO samething but with lengths
            for(int i = 0; i<original.length;i++){
                for(int j = 1;j<original[i].length;j++){
                   int point = j;
                    while(original[i][point].length < original[i][point - 1].length){
                        temp2 = original[i][point - 1];
                        original[i][point - 1] = original[i][point];
                        original[i][point] = temp2;
                        point--;
                    if(point ==0){
                        break;
                    }
            } 
                }
            
            
        }
            return original;
        }
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//Create scanner
        boolean done = false;//Create variable to leave the loop
        String array [][][] = soRandom();//Create array
        for(int i = 0; i<array.length;i++){//Goes through the outer most array
            for(int j = 0; j<array[i].length;j++){//Goes through the middle array
                for(int k = 0;k<array[i][j].length;k++){//Goes through the inner array
                    array[i][j][k] = coder();// Assign a code to each member
                }
            }
        }
        //Assign code to each member of array
        for(int i = 0; i<array.length;i++){//Goes through the outer most array
            for(int j = 0; j<array[i].length;j++){//Goes through the middle array
                for(int k = 0;k<array[i][j].length;k++){//Goes through the inner array
                    String codes = array[i][j][k];// Assign a code to each member
                    for(int m = 0; m<array.length; m++){//Goes through the outer most array
                       for(int n = 0; n<array[m].length;n++){//Goes through the middle array
                           for(int h = 0; h<array[m][n].length;h++){//Goes through the inner array
                               while(!done){//Loops till check is completed
                                  if(i == m && j==n && k==h){}//Done do anything
                                  if(codes.equals(array[m][n][h])){//See if a member is the same as another member
                                      array[i][j][k] = coder();// Reassign a different code to that member
                                  }
                                  else{
                                      done =true;
                                  }
                                
                               }
                               done = false;
                           }
                       }
                    }
                }
            }
        }
        printer(array);//Print array
        String holderArray [][][] = soRandom();//Create place holder array
        String holoportedArray [][][] = holoport(array, holderArray);//Save ported array
        System.out.println();
        System.out.println();
        System.out.println("Holoported Array: ");
        printer(holoportedArray);
        // Create another boolean so to get kicked out of the while loop
        boolean correct = false;
        boolean middle = false;
        String letters = "";
        int numbers = 0;
        System.out.println();
            while(!correct){
                // Ask for two letters
                System.out.print("Please enter two capital letters: ");
                letters = myScanner.nextLine();
                // convert the letters to an array
                char[] chars = letters.toCharArray();
                // Create another boolean so not to get kicked out of the while loop
                boolean end = false;
                // Check each letter individually
                for (char c : chars) {
                    if(!Character.isLetter(c)) {
                        end = true;
                    }// End of if statement
                }// End of for loop
                // if it is letters then it will end the while loop
                if(!end){
                    if(letters.length() == 2){
                        correct = true;
                    }
                    else{
                        System.out.println("Please enter two letters.");
                    }
                }// End of if
                end=false;
            }// End of checking while
             
        correct = false;
        while(!correct){
            System.out.print("Please enter four numbers: ");
            if(myScanner.hasNextInt()){
                numbers = myScanner.nextInt();//Save numbers
                int size = (int) (Math.log10(numbers) + 1);//Check to see if it is 4 numbers
                if(size == 4){
                    correct = true;
                }
                else{
                    System.out.println("Please enter four numbers.");
                }
            }
            else{
                String trash = myScanner.next();
                System.out.println("You did not enter integers.");
            }
        }
        String key = letters + numbers;//Save key
        sampling(holoportedArray,key);//Call sampling method
        percentage(array, holoportedArray);//Call percentage array
        String [][][] orderHoloport = frankenstein(holoportedArray);//Call frankenstein
        System.out.println("Frankenstein: ");
        printer(orderHoloport);//Print frankenstein
        System.out.println();
    }//End of main method
}//End of class