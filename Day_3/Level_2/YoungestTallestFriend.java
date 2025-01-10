import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Take input for the ages and heights of the three friends
        System.out.println("Enter the details of 3 friends:");

        // Input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            
            System.out.print("Enter height of friend " + (i + 1) + " in meters: ");
            heights[i] = input.nextDouble();
        }

        // Initialize variables to find the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the array to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            // Find the youngest friend (minimum age)
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            
            // Find the tallest friend (maximum height)
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friend
        System.out.println("\nThe youngest friend is: ");
        switch (youngestIndex) {
            case 0:
                System.out.println("Amar, Age: " + ages[0] + ", Height: " + heights[0]);
                break;
            case 1:
                System.out.println("Akbar, Age: " + ages[1] + ", Height: " + heights[1]);
                break;
            case 2:
                System.out.println("Anthony, Age: " + ages[2] + ", Height: " + heights[2]);
                break;
        }

        System.out.println("\nThe tallest friend is: ");
        switch (tallestIndex) {
            case 0:
                System.out.println("Amar, Age: " + ages[0] + ", Height: " + heights[0]);
                break;
            case 1:
                System.out.println("Akbar, Age: " + ages[1] + ", Height: " + heights[1]);
                break;
            case 2:
                System.out.println("Anthony, Age: " + ages[2] + ", Height: " + heights[2]);
                break;
        }

        // Close the scanner
        input.close();
    }
}
