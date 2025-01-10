import java.util.Scanner;

public class  RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt(); // Read the input value

        // Start the countdown using a for loop
        System.out.println("Countdown begins:");
        for (int i = counter; i >= 1; i--) { // Initialize i with counter and decrement i
            System.out.println(i); // Print the current value of i
        }

        // Print a message after the countdown ends
        System.out.println("Liftoff!");
    }
}
