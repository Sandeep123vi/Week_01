import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Take input for weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            // Taking weight and height input
            System.out.print("Enter weight (in kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (in meters): ");
            height[i] = input.nextDouble();

            // Calculate BMI: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\n\n--- BMI Report ---");
        System.out.println("Person | Height (m) | Weight (kg) | BMI | Weight Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-7d | %-12.2f | %-13.2f | %-5.2f | %-15s\n", (i + 1), height[i], weight[i], bmi[i], weightStatus[i]);
        }

        // Close the scanner
        input.close();
    }
}
