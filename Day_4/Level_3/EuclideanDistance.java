import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using the Euclidean distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate the equation of the line given two points
    // It returns an array where the first element is the slope (m) and the second element is the y-intercept (b)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // Array to hold slope (m) and y-intercept (b)

        // Calculate the slope (m) using the formula: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b) using the formula: b = y1 - m * x1
        double b = y1 - (m * x1);

        // Store the slope and y-intercept in the result array
        result[0] = m; // Slope (m)
        result[1] = b; // Y-intercept (b)

        return result;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for the first point (x1, y1)
        System.out.print("Enter the x1 coordinate: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y1 coordinate: ");
        double y1 = scanner.nextDouble();

        // Taking inputs for the second point (x2, y2)
        System.out.print("Enter the x2 coordinate: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y2 coordinate: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);

        // Calculate the equation of the line passing through the two points
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        // Output the results
        System.out.println("The Euclidean distance between the points is: " + distance);
        System.out.println("The equation of the line passing through the points is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        
        // Close the scanner
        scanner.close();
    }
}
