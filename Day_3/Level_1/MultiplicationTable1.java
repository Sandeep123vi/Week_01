import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Define an array to store multiplication results for numbers 6 to 9
        int[] multiplicationResult = new int[4];  // One for each number from 6 to 9

        // Ask the user for the number to generate multiplication tables
        System.out.print("Enter a number (between 6 and 9) to generate its multiplication table: ");
        int number = input.nextInt();  // Store the user input in 'number'

        // Check if the number entered is between 6 and 9
        if (number >= 6 && number <= 9) {
            // Calculate the multiplication table for the number and store it in the array
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;  // Store the result in the array
            }

            // Display the multiplication table using the array
            System.out.println("\nMultiplication Table for " + number + ":");
            for (int i = 0; i < multiplicationResult.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        } else {
            System.out.println("Please enter a number between 6 and 9.");
        }

        // Close the scanner
        input.close();
    }
}
