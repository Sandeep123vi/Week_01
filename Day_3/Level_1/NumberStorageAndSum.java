import java.util.Scanner;

public class NumberStorageAndSum {
    public static void main(String[] args) {
        // Create an array to store up to 10 values of type double
        double[] numbers = new double[10];
        
        // Variable to store the total sum of the numbers
        double total = 0.0;
        
        // Index variable initialized to 0 for array positioning
        int index = 0;
        
        // Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Infinite while loop to take user input and store numbers
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble(); // Take user input

            // Check if the number is 0 or negative or if we have entered 10 numbers
            if (num <= 0 || index == 10) {
                break; // Exit the loop if the user enters 0 or a negative number or if array size is exceeded
            }

            // Store the number in the array and increment the index
            numbers[index] = num;
            index++;
        }

        // Calculate the sum of all numbers in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers entered by the user
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum of the numbers
        System.out.println("Total sum: " + total);

        // Close the scanner
        input.close();
    }
}
