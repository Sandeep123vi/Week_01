import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // Create a multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3]; // [0]: weight, [1]: height, [2]: BMI
        String[] weightStatus = new String[number];   // Array to store weight status

        // Input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            // Input weight (positive validation)
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            // Input height (positive validation)
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store it in the array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and status of each person
        System.out.println("\n--- BMI Report ---");
        System.out.println("Person | Weight (kg) | Height (m) | BMI   | Weight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-7d | %-12.2f | %-11.2f | %-5.2f | %-15s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        // Close the scanner
        input.close();
    }
}
