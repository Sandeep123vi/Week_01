import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionExample {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Access an index beyond the length of the String
        System.out.println("Character at index 100: " + input.charAt(100)); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String input) {
        try {
            // Access an index beyond the length of the String
            System.out.println("Character at index 100: " + input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling exception...");
        // Call the method to handle the exception
        handleException(userInput);

        
    }
}
