import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert the weight from pounds to kilograms
        // 1 pound = 2.2 kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKilograms);

        // Close the scanner to avoid resource leaks
        input.close();
    }
}
