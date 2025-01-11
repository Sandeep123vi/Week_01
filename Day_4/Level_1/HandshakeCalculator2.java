import java.util.Scanner;

public class HandshakeCalculator2 {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validate that the number of students is positive
        if (numberOfStudents <= 0) {
            System.out.println("The number of students must be a positive integer.");
        } else {
            // Calculate the maximum number of handshakes using the formula
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents +
                               " students is: " + maxHandshakes);
        }

        // Close the scanner
        scanner.close();
    }
}
