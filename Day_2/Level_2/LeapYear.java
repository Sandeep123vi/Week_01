import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Declare the year variable
        int year;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the year input from the user
        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        // First part: Using multiple if-else statements
        System.out.println("\nUsing multiple if-else statements:");
        if (year >= 1582) { // Check if the year is greater than or equal to 1582
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        }

        // Second part: Using a single if statement with logical operators
        System.out.println("\nUsing a single if statement with logical operators:");
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

