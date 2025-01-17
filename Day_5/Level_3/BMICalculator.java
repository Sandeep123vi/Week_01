import java.util.Scanner;


public class BMICalculator {


    // Method to calculate BMI and status
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[10][4]; // 2D array to store weight, height, BMI, and status


        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula


            result[i][0] = String.format("%.2f", weight); // Store weight
            result[i][1] = String.format("%.2f", heightInCm); // Store height
            result[i][2] = String.format("%.2f", bmi); // Store BMI
            result[i][3] = getBMIStatus(bmi); // Store BMI status
        }


        return result;
    }


    // Method to determine BMI status based on BMI value
    private static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if ( 18.5>=bmi && bmi <= 24.9) {
            return "Normal";
        } else if (25.0>=bmi && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }


    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------------");


        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }


    // Main method to drive the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // 2D array to store weight and height


        // Input loop for collecting data
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();


            System.out.println("Enter height (in cm) for person " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();
        }


        // Compute BMI and status
        String[][] results = calculateBMIAndStatus(data);


        // Display results
        displayResults(results);


        scanner.close();
    }
}


