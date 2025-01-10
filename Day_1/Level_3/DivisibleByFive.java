import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Output the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}
