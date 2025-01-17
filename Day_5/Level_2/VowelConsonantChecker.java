import java.util.Scanner;


public class VowelConsonantChecker {


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


    // Method to find vowels, consonants, and other character types in a string
    public static String[][] analyzeString(String input) {
        // Create a 2D array to store characters and their types
        String[][] result = new String[input.length()][2];


        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            // Store the character and its type in the 2D array
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacter(currentChar);
        }


        return result;
    }


    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("----------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }


    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);


        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        // Call the analyzeString method to process the input
        String[][] analyzedData = analyzeString(userInput);


        // Display the result in a tabular format
        displayTable(analyzedData);


        // Close the scanner
        scanner.close();
    }
}


