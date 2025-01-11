import java.util.Scanner;

public class SmallestAndLargest {

     public static void main(String[] args) {
         // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        scanner.close();
          }

     // Method to find the smallest and largest of three numbers
     
         public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Initialize smallest and largest with the first number
        int smallest = number1;
        int largest = number1;

        // Compare with the second number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare with the third number
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return the smallest and largest numbers in an array
        return new int[] {smallest, largest};
          }
}
