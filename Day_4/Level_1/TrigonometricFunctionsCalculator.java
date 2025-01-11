import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the angle in degrees from the user
        System.out.print("Enter the angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        // Create an object of the TrigonometricFunctionsCalculator class to use the method
        TrigonometricFunctionsCalculator calculator = new TrigonometricFunctionsCalculator();
        
        // Calculate the trigonometric functions
        double[] trigResults = calculator.calculateTrigonometricFunctions(angleInDegrees);

        // Display the results
        System.out.println("Sine: " + trigResults[0]);
        System.out.println("Cosine: " + trigResults[1]);
        System.out.println("Tangent: " + trigResults[2]);
    }

     //Method to calculate the trigonometric functions (sine, cosine, tangent) of an angle.
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double angleInRadians = Math.toRadians(angle);

        // Calculate the sine, cosine, and tangent of the angle
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        // Store the results in an array
        double[] results = { sine, cosine, tangent };
        return results;
    }
}
