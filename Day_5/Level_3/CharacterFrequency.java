import java.util.Scanner;


public class CharacterFrequency {


    // Method to find the frequency of characters using charAt()
    public static char[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII)


        // Loop to count the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }


        // Count unique characters to determine size of result array
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }


        // Create a 2D array to store characters and their frequencies
        char[][] result = new char[uniqueCount][2];
        int index = 0;


        // Loop to fill the result array with characters and their frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = (char) i; // Store the character
                result[index][1] = (char) frequency[i]; // Store the frequency
                index++;
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
        char[][] frequencyResult = findCharacterFrequency(input);


        // Displaying the frequency of characters
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (char[] pair : frequencyResult) {
            System.out.printf("%c         | %d%n", pair[0], (int) pair[1]);
        }


        scanner.close();
    }
}


