import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Read the input number

        // Initialize a variable to store the count of digits
        int count = 0;

        // Use a loop to count the number of digits
        while (number != 0) {
            // Remove the last digit from the number by dividing it by 10
            number = number / 10;
            // Increment the count by 1 for each digit
            count++;
        }

        // If the number is 0, set count to 1 because 0 has one digit
        if (count == 0) {
            count = 1;
        }

        // Display the result
        System.out.println("The number of digits is: " + count);
    }
}
