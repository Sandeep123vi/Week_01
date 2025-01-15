import java.util.Scanner;

public class CalendarDisplay {

    // Array to store names of the months
    private static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month and year
    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) { // February in a leap year
            return 29;
        }
        return DAYS_IN_MONTH[month];
    }

    // Method to get the first day of the month using Zeller's congruence
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int m = month + 1;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        return (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        System.out.printf("  %s %d\n", MONTHS[month], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDaysInMonth(month, year);

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Loop to print all days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method to take user input and display the calendar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month (1-12):");
        int month = scanner.nextInt() - 1;  // Convert to 0-based index

        System.out.println("Enter the year:");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}

