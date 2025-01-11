import java.util.Scanner;

public class Quadratic {

    // Method to calculate the roots of the quadratic equation
    public static double[] findRoots(int a, int b, int c) {
        // Calculate delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, calculate two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};  // Return both roots
        } 
        // If delta is zero, calculate one root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root};  // Return a single root
        } 
        // If delta is negative, return an empty array (no real roots)
        else {
            return new double[] {};  // No real roots
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the results based on the number of roots
        if (roots.length == 0) {
            System.out.println("There are no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();  // Close the scanner
    }
}
