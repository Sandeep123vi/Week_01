import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate age for negative values
        if (age < 0) {
            return false;  // Age can't be negative, return false
        }
        // Check if age is 18 or above for voting eligibility
        if (age >= 18) {
            return true;  // Student can vote
        }
        return false;  // Student cannot vote
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store ages of 10 students
        int[] studentAges = new int[10];

        // Create an instance of StudentVoteChecker to call the canStudentVote method
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Loop through the array to take input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            int age = scanner.nextInt();  // Take user input for student's age
            studentAges[i] = age;  // Store the age in the array

            // Call canStudentVote() method and print the result
            if (voteChecker.canStudentVote(age)) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();  // Close the scanner to prevent memory leak
    }
}

