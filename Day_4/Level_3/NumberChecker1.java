public class NumberChecker1 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();  // Convert the number to string and return the length
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];

        // Store each digit of the number in the array
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to int
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);  // Use Math.pow() to calculate square of each digit
        }
        return sumOfSquares;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);  // Find the sum of digits
        return number % sum == 0;  // Check if the number is divisible by the sum of its digits
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // Array to store digit and its frequency (0 to 9)

        // Initialize the frequency array with digits and their frequency
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // Store the digit in the first column
            frequency[i][1] = 0;  // Initialize frequency to 0
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;  // Increment the frequency of the digit
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 21;  // Example number to test (You can change this number for testing)

        // Step 1: Store digits of the number
        int[] digits = storeDigits(number);

        // Step 2: Find the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Step 3: Find the sum of the digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Step 4: Find the sum of the squares of the digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Step 5: Check if the number is a Harshad number
        System.out.println("Is the number a Harshad number? " + isHarshadNumber(number, digits));

        // Step 6: Find the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {  // Only print digits that appear at least once
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
