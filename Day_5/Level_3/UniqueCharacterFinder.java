import java.util.Scanner;


public class UniqueCharacterFinder {


    // Method to find the length of a string without using the length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Attempting to access the character at index length
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // For handling exception
        }
        return length;
    }


    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); // Find the length of the text
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0; // Counter for the number of unique characters


        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;


            // Check if the current character has appeared before
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }


            // If the character is unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }


        // Create a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }


        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Taking input from the user
        System.out.println("Enter a string to find its unique characters:");
        String input = scanner.nextLine();


        // Finding unique characters
        char[] uniqueCharacters = findUniqueCharacters(input);


        // Displaying the unique characters
        System.out.println("Unique characters in the string are:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
        System.out.println();


        scanner.close();
    }
}


