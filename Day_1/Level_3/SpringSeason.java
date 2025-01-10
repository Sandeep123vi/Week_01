import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt(); // Read the month input

        // Prompt the user to enter the day
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt(); // Read the day input

        // Check if the date falls in the Spring Season
        boolean isSpringSeason = false;

        // Check for the months and corresponding days for Spring Season
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to 31
            (month == 4 && day >= 1 && day <= 30) || // April
            (month == 5 && day >= 1 && day <= 31) || // May
            (month == 6 && day >= 1 && day <= 20)) { // June 1 to 20
            isSpringSeason = true;
        }

        // Output the result based on the condition
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
