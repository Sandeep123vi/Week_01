import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the salary and year of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble(); // Read the salary

        System.out.print("Enter the employee's year of service: ");
        int yearsOfService = scanner.nextInt(); // Read the year of service

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            double bonus = salary * 0.05;
            // Print the bonus amount
            System.out.println("The employee is eligible for a bonus of INR " + bonus);
        } else {
            // If the employee's years of service is 5 or less, they are not eligible for the bonus
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
