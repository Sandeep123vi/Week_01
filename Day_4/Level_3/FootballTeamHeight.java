import java.util.Random;

public class FootballTeamHeight {

    // Method to generate an array of random heights for the players
    public static int[] generateRandomHeights(int size, int minHeight, int maxHeight) {
        Random rand = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt((maxHeight - minHeight) + 1) + minHeight;
        }
        return heights;
    }

    // Method to find the sum of all the elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height among the players
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height among the players
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11;  // Size of the football team
        int minHeight = 150;  // Minimum height in cm
        int maxHeight = 250;  // Maximum height in cm

        // Generate random heights for the football players
        int[] heights = generateRandomHeights(teamSize, minHeight, maxHeight);

        // Find and display the shortest, tallest, and mean height
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);
        double meanHeight = findMeanHeight(heights);

        // Display the results
        System.out.println("Football Team Heights:");
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
        System.out.println("Mean height: " + meanHeight + " cm");
    }
}
