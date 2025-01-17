// Java program to perform date arithmetic operations

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Define the date formatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Take a date input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in the format (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);
        System.out.println("Original Date: " + date.format(formatter));

        // Add 7 days, 1 month, and 2 years to the input date
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate.format(formatter));

        // Subtract 3 weeks from the result
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));

        // Close the scanner
        scanner.close();
    }
}
