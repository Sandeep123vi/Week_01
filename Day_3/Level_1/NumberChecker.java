import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        // Define an integer array of 5 elements to store the user input
        int[] numbers = new int[5];

        // Scanner to take input from the user
        Scanner input = new Scanner(System.in);

        // Loop to take user input for 5 numbers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt(); // Store the input in the array
        }

        // Loop through the array to check if the number is positive, negative, or zero
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            // Check if the number is positive, negative, or zero
            if (num > 0) {
                System.out.println(num + " is positive.");
                // If the number is positive, check if it's even or odd
                if (num % 2 == 0) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the scanner
        input.close();
    }
}
