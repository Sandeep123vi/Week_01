public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();  // Convert number to string and return its length
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to int
        }
        return digits;
    }

    // Method to check if a number is a Duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        // A Duck number should have at least one zero and should not start with a zero
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;  // It contains a zero (excluding leading zero)
            }
        }
        return false;  // No zero present in the number
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits) {
        int sum = 0;
        int numberOfDigits = digits.length;

        // Calculate sum of digits raised to the power of the number of digits
        for (int digit : digits) {
            sum += Math.pow(digit, numberOfDigits);
        }

        // Compare the sum with the original number
        int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }

        return sum == originalNumber;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest digits in the array
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[] {largest, secondLargest};  // Return both values
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Find the smallest and second smallest digits in the array
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[] {smallest, secondSmallest};  // Return both values
    }

    public static void main(String[] args) {
        int number = 153;  // Example number to test (You can change this number for testing)

        // Step 1: Store digits of the number
        int[] digits = storeDigits(number);

        // Step 2: Find the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Step 3: Check if the number is a Duck number
        System.out.println("Is the number a Duck number? " + isDuckNumber(digits));

        // Step 4: Check if the number is an Armstrong number
        System.out.println("Is the number an Armstrong number? " + isArmstrongNumber(digits));

        // Step 5: Find the largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        // Step 6: Find the smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
