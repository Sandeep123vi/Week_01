
import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random 2-digit ages for 'n' students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();

        // Generate random ages between 10 and 99 for each student
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Generates a random number between 10 and 99
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        // Iterate through each age and determine voting eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            // First validate if age is negative (not possible in this case but for safety)
            if (age < 0) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else {
                // Check if age is 18 or above
                result[i][0] = String.valueOf(age);
                result[i][1] = (age >= 18) ? "Can Vote" : "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s%-20s%n", "Age", "Voting Eligibility");
        System.out.println("------------------------------");

        // Print each row of the 2D array
        for (String[] row : data) {
            System.out.printf("%-10s%-20s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 2: Generate random ages for the students
        int[] studentAges = generateAges(numStudents);

        // Step 3: Check voting eligibility for each student
        String[][] votingEligibility = checkVotingEligibility(studentAges);

        // Step 4: Display the results in a tabular format
        displayResult(votingEligibility);

        scanner.close();
    }
}

