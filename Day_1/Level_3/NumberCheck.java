import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // Check if the number is negative
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        // If the number is neither positive nor negative, it must be zero
        else {
            System.out.println("The number is zero.");
        }
    }
}
