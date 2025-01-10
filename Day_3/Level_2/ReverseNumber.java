import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the number of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;  // Remove the last digit
            count++;  // Increment the digit count
        }

        // Create an array to store the digits
        int[] digits = new int[count];
        
        // Fill the digits array with the digits of the number
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;  // Extract the last digit
            temp /= 10;  // Remove the last digit from the number
        }

        // Display the digits in reverse order (since they are already in reverse order in the array)
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        // Close the scanner
        input.close();
    }
}
