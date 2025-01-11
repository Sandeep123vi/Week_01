import java.util.Random;

public class ZaraBonusCalculator {

    // Method to generate the salary and years of service for each employee
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        double[][] employeeData = new double[numberOfEmployees][2]; // 2D array to store salary and years of service
        Random rand = new Random();

        // Fill the array with random salary (5-digit salary) and years of service (between 1 and 20 years)
        for (int i = 0; i < numberOfEmployees; i++) {
            double salary = 10000 + rand.nextInt(90000); // Random 5-digit salary (between 10000 and 99999)
            int yearsOfService = 1 + rand.nextInt(20); // Random years of service (between 1 and 20)
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        return employeeData;
    }

    // Method to calculate the new salary, bonus, and return the new salary and bonus data
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData, int numberOfEmployees) {
        double[][] newSalaryAndBonus = new double[numberOfEmployees][3]; // 2D array to store new salary and bonus
        double totalBonus = 0;

        for (int i = 0; i < numberOfEmployees; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus if more than 5 years of service
            } else {
                bonus = salary * 0.02; // 2% bonus if less than or equal to 5 years of service
            }

            // Calculate new salary after adding bonus
            double newSalary = salary + bonus;

            // Store new salary and bonus in the new array
            newSalaryAndBonus[i][0] = salary; // Old Salary
            newSalaryAndBonus[i][1] = newSalary; // New Salary
            newSalaryAndBonus[i][2] = bonus; // Bonus

            totalBonus += bonus;
        }

        return newSalaryAndBonus;
    }

    // Method to calculate the sum of the old salary, new salary, and total bonus
    public static void calculateAndDisplayTotals(double[][] newSalaryAndBonus, int numberOfEmployees) {
        double oldSalaryTotal = 0;
        double newSalaryTotal = 0;
        double totalBonus = 0;

        // Calculate the total old salary, new salary, and total bonus
        for (int i = 0; i < numberOfEmployees; i++) {
            oldSalaryTotal += newSalaryAndBonus[i][0]; // Old Salary
            newSalaryTotal += newSalaryAndBonus[i][1]; // New Salary
            totalBonus += newSalaryAndBonus[i][2]; // Bonus
        }

        // Display results in tabular format
        System.out.println("Employee No. | Old Salary | New Salary | Bonus");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("%12d | %.2f      | %.2f      | %.2f\n", i + 1, newSalaryAndBonus[i][0], newSalaryAndBonus[i][1], newSalaryAndBonus[i][2]);
        }

        // Display total amounts
        System.out.println("\nTotal Old Salary: " + oldSalaryTotal);
        System.out.println("Total New Salary: " + newSalaryTotal);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Step 1: Generate salary and years of service for each employee
        double[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Step 2: Calculate bonus and new salary for each employee
        double[][] newSalaryAndBonus = calculateBonusAndNewSalary(employeeData, numberOfEmployees);

        // Step 3: Calculate totals and display the results
        calculateAndDisplayTotals(newSalaryAndBonus, numberOfEmployees);
    }
}
