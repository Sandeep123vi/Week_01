import java.util.Scanner;

public class ChocolatesDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Ensure the number of children is greater than 0 to avoid division by zero
        if (numberOfChildren <= 0) {
            System.out.println("The number of children must be greater than 0.");
        } else {
            // Call the method to find chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child gets: " + result[1] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[0]);
        }

        scanner.close();
    }

     // Method to calculate how many chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;

        return new int[] {remainder, quotient};
    }
}
