import java.util.Scanner;

public class plaindrom {
    public static void main(String[] args) {
        String str ="1111", reverseStr ="";
        // Scanner sc = new Scanner(System.in);
        // System.out .println(" enter the number and characteer you want to enter");
        // String str =  sc.next();

        int strlenght =str.length();

        for (int i = (strlenght -1 ); i >= 0; --i) {
            reverseStr = reverseStr+str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str + " is a palindrome string ");
        }
        else {
            System.out.println(str + " it is not a palindrome ");
        }
    }
}
