import java.util.*;

public class NumberOfChocolates {
     
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to input the total number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Prompt user to input the total number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate the number of chocolates each child will get
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the remaining chocolates that cannot be distributed equally
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        // Close the scanner to avoid resource leaks
        input.close();
    }


}
