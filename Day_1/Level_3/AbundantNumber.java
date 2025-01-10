import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Initialize a variable to store the sum of divisors
        int sum = 0;

        // Use a for loop to find the divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                // Add the divisor to the sum
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
