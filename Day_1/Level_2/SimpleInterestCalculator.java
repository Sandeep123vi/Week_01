import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to input the Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        // Prompt user to input the Rate of Interest
        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = input.nextDouble();

        // Prompt user to input the Time period in years
        System.out.print("Enter the Time period (in years): ");
        double time = input.nextDouble();

        // Calculate the Simple Interest using the formula: SI = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           "%, and Time " + time + " years.");

        // Close the scanner to avoid resource leaks
        input.close();
    }
}
