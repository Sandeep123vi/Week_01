public class NumberChecker2 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        int index = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedDigits[index++] = digits[i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);

        // Check if the number is a palindrome by comparing the digits array with the reversed array
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);

        // A Duck number must contain a non-zero digit in it
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12021;  // Example number to test (You can change this number for testing)

        // Step 1: Store digits of the number
        int[] digits = storeDigits(number);

        // Step 2: Find the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Step 3: Reverse the digits and print the reversed number
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();

        // Step 4: Check if the number is a palindrome
        System.out.println("Is the number a palindrome? " + isPalindrome(number));

        // Step 5: Check if the number is a duck number
        System.out.println("Is the number a duck number? " + isDuckNumber(number));
    }
}
