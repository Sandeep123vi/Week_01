import java.util.Scanner;


public class IllegalArgumentExceptionDemo {


    // Method to generate IllegalArgumentException without handling it
    public static void generateException(String input) {
        // This will cause an IllegalArgumentException
        String substring = input.substring(5, 2); // Start index is greater than end index
    }


    // Method to demonstrate handling IllegalArgumentException
    public static void handleException(String input) {
        try {
            // This will cause an IllegalArgumentException
            String substring = input.substring(5, 2); // Start index is greater than end index
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }


    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Take user input
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();


        // Call the method to generate exception (this will terminate the program)
        try {
            System.out.println("Attempting to generate IllegalArgumentException...");
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception generated and handled in main: " + e.getMessage());
        }


        // Call the method to handle exception using try-catch
        System.out.println("\nDemonstrating exception handling:");
        handleException(userInput);


        scanner.close();
    }
}
