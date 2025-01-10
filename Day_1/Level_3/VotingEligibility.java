import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read the input age

        // Check if the person's age is 18 or older
        if (age >= 18) {
            // If the person is eligible to vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the person is not eligible to vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
