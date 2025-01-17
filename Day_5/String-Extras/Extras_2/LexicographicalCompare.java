import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input two strings
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();

        //Compare strings lexicographically
        int result = compareStrings(str1, str2);

        //Display result
        if (result < 0) {
            System.out.println("The first string is lexicographically smaller than the second string.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }
    }

    //Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        //Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2) {
                return c1 - c2;
            }
        }

        //If all characters match, compare lengths
        return str1.length() - str2.length();
    }
}
