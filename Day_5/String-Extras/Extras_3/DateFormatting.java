// Java program to display the current date in different formats

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format and display the current date in each format
        System.out.println("Current date in format dd/MM/yyyy: " + currentDate.format(format1));
        System.out.println("Current date in format yyyy-MM-dd: " + currentDate.format(format2));
        System.out.println("Current date in format EEE, MMM dd, yyyy: " + currentDate.format(format3));
    }
}
