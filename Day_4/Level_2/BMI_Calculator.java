import java.util.Scanner;

public class BMI_Calculator {

    // Method to find the BMI for each person and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // weight in kg
            double heightInCm = data[i][1];  // height in cm
            double heightInMeters = heightInCm / 100;  // convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters);  // BMI formula
            data[i][2] = bmi;  // store BMI in the 3rd column
        }
    }

    // Method to determine the BMI status based on the BMI value
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to display the BMI details of all individuals
    public static void displayBMIData(double[][] data) {
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);  // get BMI status based on the BMI value
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n", weight, heightInCm, bmi, status);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];  // 10 members, 3 columns (weight, height, BMI)

        // Take input for weight and height of 10 members
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person and populate the data array
        calculateBMI(data);

        // Display the BMI data and status for all persons
        displayBMIData(data);

        scanner.close();
    }
}
