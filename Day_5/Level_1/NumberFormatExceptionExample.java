import java.util.Scanner;


public class NumberFormatExceptionExample {


    // Method to generate NumberFormatException
    public static void generateException(String input) {
        // Attempt to parse the input string as an integer
        System.out.println("Parsing input: " + input);
        int number = Integer.parseInt(input); // This may throw NumberFormatException
        System.out.println("Parsed number: " + number);
    }


    // Method to handle NumberFormatException
    public static void handleException(String input) {
        try {
            // Attempt to parse the input string as an integer
            System.out.println("Parsing input: " + input);
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Take user input to assign a value to the String
        System.out.print("Enter a string to parse as an integer: ");
        String userInput = scanner.nextLine();


        System.out.println("\nGenerating exception...");
        try {
            // Call the method to generate the exception
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }


        System.out.println("\nHandling exception...");
        // Call the method to handle the exception
        handleException(userInput);


        scanner.close();
    }
}


