import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the input value for the number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Initialize the greatestFactor to 1 (the smallest possible factor other than the number itself)
        int greatestFactor = 1;

        // Loop from number - 1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor if it's divisible
                break; // Break the loop as we have found the greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

        // Close the scanner
        scanner.close();
    }
}
