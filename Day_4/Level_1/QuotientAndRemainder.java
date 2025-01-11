import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the numbers
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please try again with a valid divisor.");
        } else {
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        }

        scanner.close();
    }

     //Method to calculate the remainder and quotient of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;

        // Return the remainder and quotient in an array
        return new int[] {remainder, quotient};
    }
    
}
