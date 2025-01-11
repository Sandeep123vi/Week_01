import java.util.Scanner;

public class CollinearPoints {

    // Method to calculate the slope between two points
    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        // Points are collinear if the slopes are equal
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    // Method to check if three points are collinear using the area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Using the area formula to check for collinearity
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        // If the area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for 3 points (x1, y1), (x2, y2), (x3, y3)
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check if points are collinear using slope formula
        boolean areCollinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by slope? " + areCollinearSlope);

        // Check if points are collinear using area formula
        boolean areCollinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by area? " + areCollinearArea);
        
        // Sample check for points A(2, 4), B(4, 6), C(6, 8)
        int sampleX1 = 2, sampleY1 = 4, sampleX2 = 4, sampleY2 = 6, sampleX3 = 6, sampleY3 = 8;
        System.out.println("\nChecking for sample points A(2, 4), B(4, 6), C(6, 8):");
        boolean sampleCollinearSlope = areCollinearBySlope(sampleX1, sampleY1, sampleX2, sampleY2, sampleX3, sampleY3);
        boolean sampleCollinearArea = areCollinearByArea(sampleX1, sampleY1, sampleX2, sampleY2, sampleX3, sampleY3);

        System.out.println("Are the sample points collinear by slope? " + sampleCollinearSlope);
        System.out.println("Are the sample points collinear by area? " + sampleCollinearArea);
    }
}
