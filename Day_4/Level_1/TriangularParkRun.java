import java.util.Scanner;

public class TriangularParkRun {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Validate if the input forms a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            // Calculate the perimeter of the triangular park
            double perimeter = side1 + side2 + side3;

            // Distance to complete in meters (5 km = 5000 meters)
            double distance = 5000.0;

            // Calculate the number of rounds required
            double rounds = distance / perimeter;

            // Display the result
            System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.\n", rounds);
        } else {
            System.out.println("The provided sides do not form a valid triangle.");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to check if the given sides form a valid triangle
     * A triangle is valid if the sum of any two sides is greater than the third side
     */
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
               (side1 + side3 > side2) &&
               (side2 + side3 > side1);
    }
}
