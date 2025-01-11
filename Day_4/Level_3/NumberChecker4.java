public class NumberChecker4 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Find how many factors the number has
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
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1]; // The greatest factor will always be the last element in the array
    }

    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using factors array
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Raise each factor to the power of 3
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sumOfProperDivisors = 0;
        int[] factors = findFactors(number);

        // Exclude the number itself and sum up the proper divisors
        for (int i = 0; i < factors.length - 1; i++) {
            sumOfProperDivisors += factors[i];
        }

        // A perfect number is equal to the sum of its proper divisors
        return sumOfProperDivisors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sumOfProperDivisors = 0;
        int[] factors = findFactors(number);

        // Exclude the number itself and sum up the proper divisors
        for (int i = 0; i < factors.length - 1; i++) {
            sumOfProperDivisors += factors[i];
        }

        // An abundant number has a sum of proper divisors greater than the number
        return sumOfProperDivisors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sumOfProperDivisors = 0;
        int[] factors = findFactors(number);

        // Exclude the number itself and sum up the proper divisors
        for (int i = 0; i < factors.length - 1; i++) {
            sumOfProperDivisors += factors[i];
        }

        // A deficient number has a sum of proper divisors less than the number
        return sumOfProperDivisors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorials = 0;
        int temp = number;

        // Loop through each digit of the number
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit); // Add the factorial of each digit
            temp /= 10;
        }

        // A strong number is a number where the sum of the factorial of its digits equals the number itself
        return sumOfFactorials == number;
    }

    // Helper method to calculate the factorial of a number
    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int number = 28; // You can change this number to test with other values

        // Finding the factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Finding the greatest factor
        System.out.println("Greatest Factor: " + greatestFactor(factors));

        // Finding the sum of the factors
        System.out.println("Sum of Factors: " + sumOfFactors(factors));

        // Finding the product of the factors
        System.out.println("Product of Factors: " + productOfFactors(factors));

        // Finding the product of the cube of the factors
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        // Checking if the number is a perfect number
        System.out.println("Is " + number + " a Perfect Number? " + isPerfectNumber(number));

        // Checking if the number is an abundant number
        System.out.println("Is " + number + " an Abundant Number? " + isAbundantNumber(number));

        // Checking if the number is a deficient number
        System.out.println("Is " + number + " a Deficient Number? " + isDeficientNumber(number));

        // Checking if the number is a strong number
        System.out.println("Is " + number + " a Strong Number? " + isStrongNumber(number));
    }
}
