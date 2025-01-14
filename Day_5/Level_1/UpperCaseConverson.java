import java.util.*;

public class UpperCaseConverson {
    // Method to compare two string
    public static boolean toCompare(String upper, String string3) {
        if (string3.length() != upper.length()) {
            return false;
        }
        for (int i = 0; i < upper.length(); i++) {
            if (upper.charAt(i) == string3.charAt(i)) {
                return true;
            }
        }
        return false;

    }

    // Method to convert lowwer case to uppercase
    public static String lowerToUpper(String string) {

        String string2 = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                string2 += (char) (string.charAt(i) - 32);
            } else {
                string2 += string.charAt(i);
            }
        }
        return string2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String string = input.nextLine();

        String upper = lowerToUpper(string);
        String string3 = string.toUpperCase();
        // Printing results
        System.out.println("String 1 is : " + string3);
        System.out.println("String 2 is : " + upper);
        System.out.println("Similar " + toCompare(upper, string3));

    }
}
