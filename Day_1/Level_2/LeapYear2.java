import java.util.Scanner;

public class LeapYear2 {

    public static void main(String[] args) {
        // Declare the year variable
        int year;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the year input from the user
        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        // Use a single if condition with logical AND (&&) and OR (||) operators to check for leap year
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
