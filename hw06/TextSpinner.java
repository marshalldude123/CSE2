// Marshall Stallings
// 3/6/16
// hw06
// This program will create an infinite loop 
public class TextSpinner{
    public static void main(String[] args){
        String a ="/";
        String b = "-";
        String c = "\\";
        String d = "|";
        int count = 0;
        while (count>=0){
            System.out.print("\b"+ a);
            System.out.print("\b" + b);
            System.out.print("\b" + c);
            System.out.print("\b" + d);
            count++;
        }
    }
}