import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user for the number to generate multiplication table
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store multiplication table results
        int[] multiplicationTable = new int[10];

        // Run a loop from 1 to 10 to calculate multiplication results
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i; // Store result in array
        }

        // Display the multiplication table using the array
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close the scanner
        input.close();
    }
}
