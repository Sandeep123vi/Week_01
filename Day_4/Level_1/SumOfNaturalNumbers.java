import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
           
            int sum = calculateSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }

    
     // Method to calculate the sum of the first n natural numbers using a loop
     static int calculateSum(int n) {
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }

        return sum; 
    }
}
