import java.util.Scanner;

public class IllegalArgumentExceptionExample {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Set start index greater than the end index in substring()
        System.out.println("Substring with start index 5 and end index 2: " + input.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String input) {
        try {
            // Set start index greater than the end index in substring()
            System.out.println("Substring with start index 5 and end index 2: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input to assign a value to the String
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\nGenerating exception...");
        try {
            // Call the method to generate the exception
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling exception...");
        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
