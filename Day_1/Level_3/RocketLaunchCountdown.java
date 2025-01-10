import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt(); // Read the input value

        // Start the countdown using a while loop
        System.out.println("Countdown begins:");
        while (counter >= 1) { // Continue the loop until counter reaches 1
            System.out.println(counter); // Print the current counter value
            counter--; // Decrement the counter by 1
        }

        // Print a message after the countdown ends
        System.out.println("Liftoff!");
    }
}
