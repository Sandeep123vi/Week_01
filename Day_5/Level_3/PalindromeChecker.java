import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Method to check palindrome using start and end index comparison
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check if text is palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Method to check palindrome using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = reverseStringUsingCharAt(text);

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt()
    public static char[] reverseStringUsingCharAt(String text) {
        char[] reverseArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reverseArray[i] = text.charAt(text.length() - 1 - i);
        }
        return reverseArray;
    }

    // Main method to take user input and check palindrome using all three methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text to check if it is a palindrome:");
        String input = scanner.nextLine();

        boolean resultIterative = isPalindromeIterative(input);
        boolean resultRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean resultUsingArrays = isPalindromeUsingArrays(input);

        // Displaying results for all three logic
        System.out.println("Is Palindrome (Iterative method)? " + resultIterative);
        System.out.println("Is Palindrome (Recursive method)? " + resultRecursive);
        System.out.println("Is Palindrome (Using Arrays)? " + resultUsingArrays);

        scanner.close();
    }
}
