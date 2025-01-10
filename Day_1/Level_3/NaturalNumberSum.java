import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Check if the number is a natural number (0 or positive)
        if (number >= 0) {
            // Calculate the sum of the first n natural numbers using the formula
            int sum = number * (number + 1) / 2;

            // Output the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Output for numbers that are not natural
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
