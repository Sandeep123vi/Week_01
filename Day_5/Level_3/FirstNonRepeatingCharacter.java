import java.util.Scanner;


public class FirstNonRepeatingCharacter {


    // Method to find the first non-repeating character using charAt()
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII)


        // Loop to count the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }


        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }


        return '\0'; // Return null character if no non-repeating character is found
    }


    // Main method to take user input and display the first non-repeating character
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Taking input from the user
        System.out.println("Enter a string to find the first non-repeating character:");
        String input = scanner.nextLine();


        // Finding the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);


        // Displaying the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }


        scanner.close();
    }
}
