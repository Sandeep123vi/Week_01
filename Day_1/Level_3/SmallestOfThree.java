import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt(); // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt(); // Read the second number

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt(); // Read the third number

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2 && number1 < number3);

        // Output the result
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
