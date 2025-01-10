import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Initialize a variable to store the sum of the digits
        int sum = 0;
        // Store the original number to check divisibility later
        int originalNumber = number;

        // Use a while loop to process each digit of the number
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit by dividing the number by 10
            number = number / 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
