public class NumberChecker3 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // A prime number is greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        // Sum the digits of the square
        while (square > 0) {
            sum += square % 10; // Add last digit
            square /= 10;        // Remove last digit
        }

        // If the sum of digits of the square is equal to the number itself, it's a neon number
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;

        // Calculate sum and product of the digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        // If the sum and product of the digits are equal, it's a spy number
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;

        // Check if the square ends with the number itself
        return Integer.toString(square).endsWith(Integer.toString(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Integer.toString(number).endsWith("7");
        // A buzz number is divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        int number = 153;  // Example number (You can change this number for testing)

        // Checking if the number is prime
        System.out.println("Is the number " + number + " prime? " + isPrime(number));

        // Checking if the number is neon
        System.out.println("Is the number " + number + " neon? " + isNeon(number));

        // Checking if the number is spy
        System.out.println("Is the number " + number + " spy? " + isSpy(number));

        // Checking if the number is automorphic
        System.out.println("Is the number " + number + " automorphic? " + isAutomorphic(number));

        // Checking if the number is buzz
        System.out.println("Is the number " + number + " buzz? " + isBuzz(number));
    }
}
