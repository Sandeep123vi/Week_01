import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Define arrays for 10 employees: salary, years of service, bonus, and new salary
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to calculate total bonus, old salary, and new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to take input for 10 employees
        for (int i = 0; i < 10; i++) {
            // Take salary input
            System.out.print("Enter the salary of employee " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();

            // Validate salary input
            while (salaries[i] <= 0) {
                System.out.println("Invalid salary. Please enter a valid positive salary.");
                System.out.print("Enter the salary of employee " + (i + 1) + ": ");
                salaries[i] = input.nextDouble();
            }

            // Take years of service input
            System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextInt();

            // Validate years of service input
            while (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Please enter a valid positive number.");
                System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextInt();
            }

            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonuses[i] = 0.05 * salaries[i];  // 5% bonus for service > 5 years
            } else {
                bonuses[i] = 0.02 * salaries[i];  // 2% bonus for service <= 5 years
            }

            // Calculate new salary (old salary + bonus)
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update total bonus, old salary, and new salary
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal bonus payout for all employees: " + totalBonus);
        System.out.println("Total old salary for all employees: " + totalOldSalary);
        System.out.println("Total new salary for all employees: " + totalNewSalary);

        // Closing the scanner
        input.close();
    }
}
