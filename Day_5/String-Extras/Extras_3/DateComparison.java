// Java program to compare two dates

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String date1Input = sc.nextLine();
        LocalDate date1 = LocalDate.parse(date1Input);

        // Prompt user to enter the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String date2Input = sc.nextLine();
        LocalDate date2 = LocalDate.parse(date2Input);

        // Compare the two dates using isBefore, isAfter, and isEqual methods
        if (date1.isBefore(date2)) {
            System.out.println("The first date (" + date1 + ") is before the second date (" + date2 + ").");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date (" + date1 + ") is after the second date (" + date2 + ").");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date (" + date1 + ") is the same as the second date (" + date2 + ").");
        }

        sc.close();
    }
}
