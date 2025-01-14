
import java.util.*;

public class  LowerCaseConverson {
    // Method to compare two string
    public static boolean toCompare(String lower, String string3) {
        if (string3.length() != lower.length()) {
            return false;
        }
        for(int i=0;i<lower.length();i++)
        if (lower.charAt(i)==string3.charAt(i)) {
            return true;
        }
        return false;

    }

    // Method to convert lowwer case from uppercase
    public static String UpperTolower(String string) {

        String string2 = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                string2 += (char) (string.charAt(i) + 32);
            } else {
                string2 += string.charAt(i);
            }
        }
        return string2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String string = input.nextLine();

        String lower = UpperTolower(string);
        String string3 = string.toLowerCase();
        // Printing results
        System.out.println("String 1 is : " + string3);
        System.out.println("String 2 is : " + lower);
        System.out.println("Similar " + toCompare(lower, string3));

    }
}
