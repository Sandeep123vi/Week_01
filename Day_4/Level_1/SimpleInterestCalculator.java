import java.util.Scanner;

public class SimpleInterestCalculator {
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Input for principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        // Input for rate of interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        // Input for time period
        System.out.print("Enter the Time period (in years): ");
        double time = input.nextDouble();

        // Calculate the simple interest using the method
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.println("\nThe Simple Interest is " + simpleInterest + 
                   " for Principal " + principal + 
                     ", Rate of Interest " + rate + 
                           ", and Time " + time + " years.");

        // Close the scanner
        input.close();
    }
}
