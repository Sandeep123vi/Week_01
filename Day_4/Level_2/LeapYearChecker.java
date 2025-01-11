import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (greater than or equal to 1582)
        if (year >= 1582) {
            // Call the method to check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later as per the Gregorian calendar.");
        }
        
        scanner.close();
    }

     //Method to check if a given year is a leap year.
    public static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but not divisible by 100, unless it is divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
