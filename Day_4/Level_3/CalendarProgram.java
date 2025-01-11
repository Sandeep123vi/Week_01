import java.util.Scanner;

public class CalendarProgram {

    // Method to get the name of the month based on the month number
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // month - 1 because array index starts from 0
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4, but not divisible by 100,
        // unless it is also divisible by 400.
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // If the month is February, check if it is a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29; // Leap year February
        }
        return daysInMonth[month - 1]; // Return days based on the month number
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month <= 2) {
            month += 12;
            year--;
        }

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; // The result is the day of the week

        return d0;
    }

    // Method to print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
        // Get the name of the month and number of days
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the header
        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day
        int dayOfWeek = firstDay;
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("    "); // 4 spaces for empty days
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            dayOfWeek++;

            // Start a new line after Saturday
            if (dayOfWeek > 6) {
                dayOfWeek = 0;
                System.out.println();
            }
        }

        // Move to the next line if the last day doesn't end on Saturday
        if (dayOfWeek != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the month and year from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Print the calendar for the given month and year
        printCalendar(month, year);
    }
}
