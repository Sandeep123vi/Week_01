import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the user input for 'n'
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        // Calculate the sum of first n natural numbers using recursion
        int recursiveSum = calculateSumRecursively(n);

        // Calculate the sum of first n natural numbers using the formula n*(n+1)/2
        int formulaSum = calculateSumUsingFormula(n);

        // Display both results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula (n*(n+1)/2): " + formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct and same result.");
        } else {
            System.out.println("There is an issue with the calculations.");
        }

    }

     //Method to calculate the sum of first n natural numbers using recursion.
    public static int calculateSumRecursively(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
       
        return n + calculateSumRecursively(n - 1);
    }

     // Method to calculate the sum of first n natural numbers using the formula n*(n+1)/2.
    public static int calculateSumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
