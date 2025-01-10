import java.util.Scanner;

public class MultiplesBelow100 {

    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Validate if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Run the for loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is divisible by the entered number
                if (i % number == 0) {
                    System.out.println(i); // Print the multiple
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
