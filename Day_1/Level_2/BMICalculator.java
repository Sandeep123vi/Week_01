public class BMICalculator {
    
}
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the weight and height of the person
        double weight, heightInCm, heightInM, bmi;

        // Taking input for the weight in kilograms
        System.out.print("Enter weight in kg: ");
        weight = scanner.nextDouble();

        // Taking input for the height in centimeters
        System.out.print("Enter height in cm: ");
        heightInCm = scanner.nextDouble();

        // Convert height from cm to meters
        heightInM = heightInCm / 100;

        // Calculate the BMI using the formula BMI = weight / (height * height)
        bmi = weight / (heightInM * heightInM);

        // Display the BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine and print the weight status based on the BMI value
        if (bmi < 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.4 && bmi <= 24.9) {
            System.out.println("You have a Normal weight.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("verweight");
        } 
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("Normal")
        }
        else {
            System.out.println("Obese");
        }

        // Close the scanner
        scanner.close();
    }
}
