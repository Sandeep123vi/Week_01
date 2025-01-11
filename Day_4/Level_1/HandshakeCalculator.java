import java.util.Scanner;

public class HandshakeCalculator {
    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        // Formula for maximum handshakes: (n * (n - 1)) / 2
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input for positive number
        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be a positive integer.");
        } else {
            // Calculate the maximum number of handshakes
            int maxHandshakes = calculateHandshakes(numberOfStudents);

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents +
                               " students is: " + maxHandshakes);
        }

        // Close the scanner
        input.close();
    }
}
