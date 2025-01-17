import java.util.Scanner;


public class VowelConsonantCounter {


    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert character to lowercase for uniform comparison
        char lowerCaseChar = Character.toLowerCase(ch);


        // Check if the character is a vowel
        if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
            return "Consonant";
        }
        // If it's not a letter, return "Not a Letter"
        else {
            return "Not a Letter";
        }
    }


    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String input) {
        int vowelCount = 0;
        int consonantCount = 0;


        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            // Call the checkCharacter method to classify the character
            String result = checkCharacter(currentChar);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }


        // Return counts in an array
        return new int[] { vowelCount, consonantCount };
    }


    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);


        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        // Call the countVowelsAndConsonants method
        int[] counts = countVowelsAndConsonants(userInput);


        // Display the results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);


        // Close the scanner
        scanner.close();
    }
}




