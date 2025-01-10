import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user for the number to find factors
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input to ensure the number is positive
        if (number <= 0) {
            System.err.println("Error: Please enter a positive integer.");
            System.exit(0); // Exit if the number is invalid
        }

        // Define maxFactor as 10, and create an array to store the factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;  // Variable to track the index of the factors array

        // Loop through numbers from 1 to the number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // If i is a factor of the number
                // If the index is equal to maxFactor, resize the factors array
                if (index == maxFactor) {
                    // Double the size of the array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy elements from factors array to temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;  // Assign temp array back to factors
                }
                // Add the factor to the array
                factors[index] = i;
                index++;  // Increment the index for the next factor
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");  // Print each factor
        }

        // Close the scanner
        input.close();
    }
}
