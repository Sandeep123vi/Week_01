import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user to input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();  // Take input from user

        // Check if the input number is a natural number (greater than 0)
        if (number <= 0) {
            System.err.println("Error: Please enter a positive natural number.");
            System.exit(0);  // Exit the program if the number is not valid
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];  // Array to store odd numbers
        int[] evenNumbers = new int[number / 2 + 1];  // Array to store even numbers
        
        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {  // If the number is even
                evenNumbers[evenIndex] = i;  // Store the even number in the array
                evenIndex++;  // Increment the even array index
            } else {  // If the number is odd
                oddNumbers[oddIndex] = i;  // Store the odd number in the array
                oddIndex++;  // Increment the odd array index
            }
        }

        // Display the odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");  // Print odd numbers
        }

        // Display the even numbers
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");  // Print even numbers
        }

        // Close the scanner
        input.close();
    }
}
