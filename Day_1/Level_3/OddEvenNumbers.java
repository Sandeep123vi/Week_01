import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input

        // Check if the number is a positive integer
        if (number >= 1) {
            // Use a for loop to iterate through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            // If the number is not a positive integer, print a message
            System.out.println("Please enter a positive integer.");
        }
    }
}
