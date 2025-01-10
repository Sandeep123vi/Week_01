import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Define an array to store the heights of the 11 players
        double[] heights = new double[11];
        
        // Variable to store the sum of all heights
        double sum = 0.0;

        // Ask the user to input the height of each player
        System.out.println("Enter the height of 11 players (in meters):");
        
        // Loop to get the height of each player and add it to the sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();  // Take height input and store it in the array
            sum += heights[i];  // Add the height to the total sum
        }

        // Calculate the mean height by dividing the sum by the number of players (11)
        double meanHeight = sum / heights.length;

        // Display the mean height of the football team
        System.out.println("\nThe mean height of the football team is: " + meanHeight + " meters");

        // Close the scanner
        input.close();
    }
}
