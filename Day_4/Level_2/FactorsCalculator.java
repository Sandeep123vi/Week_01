import java.util.Scanner;

public class FactorsCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            if (factor != 0) {  // Only print non-zero factors
                System.out.print(factor + " ");
            }
        }

        // Calculate and display the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("\nSum of factors: " + sum);

        // Calculate and display the sum of the squares of the factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        // Calculate and display the product of the factors
        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Close the scanner object
        scanner.close();
    }

     //Method to find the factors of a given number.
    public static int[] findFactors(int number) {
        // Find the count of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

     //Method to calculate the sum of the factors from the factors array.
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

     //Method to calculate the sum of the squares of the factors.
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

     // Method to calculate the product of the factors from the factors array.
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}
