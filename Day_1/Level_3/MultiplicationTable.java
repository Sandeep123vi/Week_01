import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to display its multiplication table from 6 to 9: ");
        int number = scanner.nextInt(); // Read the input

        // Using a for loop to generate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication result in the format "number * i = result"
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
