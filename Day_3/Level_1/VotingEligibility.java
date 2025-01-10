import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create an array to store the ages of 10 students
        int[] ages = new int[10];
        
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);
        
        // Loop to take user input for ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            // Ask the user to input the age of the student
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt(); // Store the input in the array
            
            // Check if the age is negative
            if (ages[i] < 0) {
                System.out.println("Invalid age.");
            }
            // Check if the student can vote (age >= 18)
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            }
            // If age is less than 18, the student cannot vote
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        
        // Close the scanner
        input.close();
    }
}
