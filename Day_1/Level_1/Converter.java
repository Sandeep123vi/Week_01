import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Distance Conversion
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble(); // User input for distance in feet

        // Converting feet to yards and miles
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // Displaying results for distance
        System.out.printf("The distance is %.2f yards and %.4f miles.\n", distanceInYards, distanceInMiles);

        // Part 2: Height Conversion
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble(); // User input for height in centimeters

        // Converting cm to feet and inches
        double heightInInches = heightInCm / 2.54; // 1 inch = 2.54 cm
        int heightInFeet = (int) (heightInInches / 12); // 1 foot = 12 inches
        double remainingInches = heightInInches % 12; // Remaining inches after converting to feet

        // Displaying results for height
        System.out.printf("Your height in cm is %.2f, in feet is %d, and in inches is %.2f.\n", heightInCm, heightInFeet, remainingInches);
    }
}

