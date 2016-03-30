// Marshall Stallings
// 3/25/16
// lab 09
// This lab will print out a random sentence
import java.util.Random;
public class Methods{
    public static String adjective(int i){
        String ranAdj = "";
        switch(i){
            case 0:
                ranAdj = "fat";
            break;
            case 1:
                ranAdj = "big";
            break;
            case 2:
                ranAdj = "small";
            break;
            case 3:
                ranAdj = "fast";
            break;
            case 4:
                ranAdj = "slow";
            break;
            case 5:
                ranAdj = "blue";
            break;
            case 6:
                ranAdj = "green";
            break;
            case 7:
                ranAdj = "smelly";
            break;
            case 8:
                ranAdj = "smart";
            break;
            case 9:
                ranAdj = "crazy";
            break;
        }
        return ranAdj;
    }// End of Adjective method
    public static String noun(int i){
        String ranNoun = "";
        switch(i){
            case 0:
                ranNoun = "lizard";
            break;
            case 1:
                ranNoun = "dog";
            break;
            case 2:
                ranNoun = "cat";
            break;
            case 3:
                ranNoun = "bear";
            break;
            case 4:
                ranNoun = "grandma";
            break;
            case 5:
                ranNoun = "turtle";
            break;
            case 6:
                ranNoun = "rat";
            break;
            case 7:
                ranNoun = "pegion";
            break;
            case 8:
                ranNoun = "otter";
            break;
            case 9:
                ranNoun = "mouse";
            break;
        }
        return ranNoun;
    }// End of Noun method
    public static String verb(int i){
        String ranVerb = "";
        switch(i){
            case 0:
                ranVerb = "hugged";
            break;
            case 1:
                ranVerb = "jumped";
            break;
            case 2:
                ranVerb = "licked";
            break;
            case 3:
                ranVerb = "kicked";
            break;
            case 4:
                ranVerb = "flicked";
            break;
            case 5:
                ranVerb = "destroyed";
            break;
            case 6:
                ranVerb = "kissed";
            break;
            case 7:
                ranVerb = "poked";
            break;
            case 8:
                ranVerb = "touched";
            break;
            case 9:
                ranVerb = "slapped";
            break;
        }
        return ranVerb;
    }// ENd of Verb method
    public static String noun2(int i){
        String ranNoun2 = "";
        switch(i){
            case 0:
                ranNoun2 = "truck";
            break;
            case 1:
                ranNoun2 = "car";
            break;
            case 2:
                ranNoun2 = "cart";
            break;
            case 3:
                ranNoun2 = "sign";
            break;
            case 4:
                ranNoun2 = "grandfather";
            break;
            case 5:
                ranNoun2 = "tree";
            break;
            case 6:
                ranNoun2 = "fence";
            break;
            case 7:
                ranNoun2 = "apple";
            break;
            case 8:
                ranNoun2 = "banana";
            break;
            case 9:
                ranNoun2 = "teacher";
            break;
        }
        return ranNoun2;
    }// End of Noun2 method
    public static void main(String [] args){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        int randomInt2 = randomGenerator.nextInt(10);
        int randomInt3 = randomGenerator.nextInt(10);
        String adj1 = adjective(randomInt);
        String adj2 = adjective(randomInt2);
        String adj3 = adjective(randomInt3);
        String noun1 = noun(randomInt);
        String noun2 = noun(randomInt2);
        String adVerb = verb(randomInt);
        System.out.println("The "+adj1+" "+adj2+" "+noun1+" "+adVerb+" the "+adj3+" "+noun2+".");
    }// End of main method
}// End of class