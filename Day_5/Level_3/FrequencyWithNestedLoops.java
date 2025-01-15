import java.util.Scanner;

public class FrequencyWithNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert string to char array
        int[] frequency = new int[characters.length]; // Array to store frequency

        // Initialize all characters' frequency to 1 and set duplicates to '0'
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') continue; // Skip already counted characters
            frequency[i] = 1; // Initialize frequency

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++; // Increment frequency for duplicate
                    characters[j] = '0'; // Mark duplicate as '0'
                }
            }
        }

        // Count unique characters to determine size of result array
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create an array to store the characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " - " + frequency[i];
            }
        }

        return result;
    }

    // Main method to take user input and display character frequencies
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string to find the frequency of characters:");
        String input = scanner.nextLine();

        // Finding the frequency of characters
        String[] frequencyResult = findCharacterFrequency(input);

        // Displaying the frequency of characters
        System.out.println("Character - Frequency");
        for (String pair : frequencyResult) {
            System.out.println(pair);
        }

        scanner.close();
    }
}
