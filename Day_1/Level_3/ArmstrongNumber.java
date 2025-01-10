import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt(); // Read the input number

        // Initialize sum variable to store the sum of cubes of digits
        int sum = 0;
        // Store the original number to compare with sum later
        int originalNumber = number;

        // Use a while loop to process each digit of the number
        while (number != 0) {
            // Find the last digit of the number
            int digit = number % 10;

            // Cube the digit and add it to the sum
            sum += digit * digit * digit;

            // Remove the last digit from the number
            number = number / 10;
        }

        // Finally, check if the sum of cubes equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
