import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest among the 3 friends
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngestFriend = "Amar";  // Assume Amar is the youngest initially

        // Compare ages to find the youngest
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngestFriend = "Akbar";  // Update to Akbar if younger
        }
        if (ages[2] < minAge) {
            youngestFriend = "Anthony";  // Update to Anthony if younger
        }

        return youngestFriend;
    }

    // Method to find the tallest among the 3 friends
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallestFriend = "Amar";  // Assume Amar is the tallest initially

        // Compare heights to find the tallest
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallestFriend = "Akbar";  // Update to Akbar if taller
        }
        if (heights[2] > maxHeight) {
            tallestFriend = "Anthony";  // Update to Anthony if taller
        }

        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Get user input for the ages and heights of the friends
        System.out.println("Enter the age of Amar:");
        ages[0] = scanner.nextInt();
        System.out.println("Enter the height of Amar (in meters):");
        heights[0] = scanner.nextDouble();

        System.out.println("Enter the age of Akbar:");
        ages[1] = scanner.nextInt();
        System.out.println("Enter the height of Akbar (in meters):");
        heights[1] = scanner.nextDouble();

        System.out.println("Enter the age of Anthony:");
        ages[2] = scanner.nextInt();
        System.out.println("Enter the height of Anthony (in meters):");
        heights[2] = scanner.nextDouble();

        // Find and display the youngest friend
        String youngest = findYoungest(ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(heights);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();  // Close the scanner to prevent memory leaks
    }
}
