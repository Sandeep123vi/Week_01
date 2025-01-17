import java.util.Scanner;


public class FrequencyWithUniqueCharacters {


    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;


        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;


            // Check if currentChar is already seen
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }


        // Return only unique characters in a trimmed array
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }


    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueCharacters = findUniqueCharacters(text); // Find unique characters
        String[][] frequencyArray = new String[uniqueCharacters.length][2]; // 2D array for character-frequency pairs


        for (int i = 0; i < uniqueCharacters.length; i++) {
            char currentChar = uniqueCharacters[i];
            int count = 0;


            // Count occurrences of currentChar in text
            for (int j = 0; j < text.length(); j++) {
                if (currentChar == text.charAt(j)) {
                    count++;
                }
            }


            frequencyArray[i][0] = String.valueOf(currentChar); // Store character
            frequencyArray[i][1] = String.valueOf(count);      // Store frequency
        }


        return frequencyArray;
    }


    // Main method to take user input and display character frequencies
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Taking input from the user
        System.out.println("Enter a string to find the frequency of characters:");
        String input = scanner.nextLine();


        // Finding the frequency of characters
        String[][] frequencyResult = findCharacterFrequency(input);


        // Displaying the frequency of unique characters
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] pair : frequencyResult) {
            System.out.printf("%s         | %s%n", pair[0], pair[1]);
        }


        scanner.close();
    }
}


