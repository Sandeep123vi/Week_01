import java.util.Scanner;

public class MatrixTo1DArray {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user to input the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Create a 2D array (Matrix) with given rows and columns
        int[][] matrix = new int[rows][columns];

        // Taking user input to fill the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element for position (" + i + "," + j + "): ");
                matrix[i][j] = input.nextInt();  // Fill the matrix
            }
        }

        // Create a 1D array to store all elements from the 2D array
        int[] oneDArray = new int[rows * columns];

        // Index to insert elements into the 1D array
        int index = 0;

        // Loop through the 2D array using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Copy each element from the 2D array into the 1D array
                oneDArray[index] = matrix[i][j];
                index++;  // Increment index for the 1D array
            }
        }

        // Display the 1D array elements
        System.out.println("\nElements of the 1D array are:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");  // Print the 1D array
        }

        // Close the scanner
        input.close();
    }
}
