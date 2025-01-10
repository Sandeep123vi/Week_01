import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Take user input for the number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define the initial size for the digits array
        int maxDigit = 10;
        int[] digits = new int[maxDigit]; // Array to store digits of the number
        int index = 0;

        // Loop to break down the number into digits and store them in the digits array
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            digits[index] = digit;    // Store the digit in the array
            number /= 10;             // Remove the last digit from the number
            index++;                  // Increment the index

            // If index exceeds maxDigit, increase the size of the digits array
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                // Create a new array of increased size
                int[] temp = new int[maxDigit];
                // Copy the old digits array into the new temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Assign the temp array back to digits array
                digits = temp;
            }
        }

        // Find the largest and second largest digit
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner
        input.close();
    }
}
