import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the frequency of digits (0-9)
        int[] frequency = new int[10];

        // Loop to extract each digit from the number and count the frequency
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Increase the frequency of the corresponding digit
            frequency[digit]++;
            // Remove the last digit from the number
            number /= 10;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // Only print digits that appear at least once
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s).");
            }
        }

        // Close the scanner
        input.close();
    }
}
