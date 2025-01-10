import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            // Flag to track if the number is prime or not
            boolean isPrime = true;
            
            // Loop to check divisibility from 2 to number-1
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Number is divisible, not prime
                    break; // Exit the loop as we've found a divisor
                }
            }

            // Output based on whether the number is prime or not
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
