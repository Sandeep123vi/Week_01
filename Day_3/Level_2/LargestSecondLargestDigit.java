import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define the maximum size of the array and initialize index variable
        int maxDigit = 10;  // assuming the number has at most 10 digits
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits from the number and store them in the array
        while (number != 0) {
            digits[index] = number % 10;  // Get the last digit
            number /= 10;  // Remove the last digit
            index++;

            // If index equals maxDigit, stop the loop to prevent overflow
            if (index == maxDigit) {
                break;
            }
        }

        // Initialize variables to store the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = digits[i];  // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  // Update second largest
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }

        // Close the scanner
        input.close();
    }
}
