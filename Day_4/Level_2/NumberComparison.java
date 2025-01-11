import java.util.Scanner;

public class NumberComparison {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";  // For zero case
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2,
    // 0 if both are equal, or -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0; 
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the 5 numbers
        int[] numbers = new int[5];

        // Take input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check if the number is positive or negative
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.print("Number " + (i + 1) + ": " + numbers[i] + " is " + positivity);

            if (positivity.equals("Positive")) {
                // If positive, check whether it's even or odd
                String evenOdd = isEven(numbers[i]);
                System.out.println(" and it's " + evenOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        // Compare the first and last elements in the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();  // Close the scanner
    }
}
