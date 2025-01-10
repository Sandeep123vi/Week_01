import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Take the input values for month, day, and year from the command-line arguments
        int m = Integer.parseInt(args[0]); // Month input (1 for Jan, 2 for Feb, etc.)
        int d = Integer.parseInt(args[1]); // Day input
        int y = Integer.parseInt(args[2]); // Year input

        // Compute y0 using the formula y0 = y − (14 − m) / 12
        int y0 = y - (14 - m) / 12;

        // Compute x using the formula x = y0 + y0/4 − y0/100 + y0/400
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Compute m0 using the formula m0 = m + 12 × ((14 − m) / 12) − 2
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Compute d0 using the formula d0 = (d + x + 31m0 / 12) % 7
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the result
        System.out.println("The day of the week is: " + d0);
    }
}
