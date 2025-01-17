import java.util.Scanner;


public class ArrayIndexOutOfBoundsExceptionExample {


    // Method to generate the Exception
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Attempt to access an index larger than the array length
        System.out.println("Accessing index " + names.length + ": " + names[names.length]);
    }


    // Method to handle the Exception
    public static void handleException(String[] names) {
        try {
            System.out.println("Handling ArrayIndexOutOfBoundsException...");
            // Attempt to access an index larger than the array length
            System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Take input for the size of the array and names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()


        String[] names = new String[n];


        // Take user input for the names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }


        // Call the method to generate the Exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception in generateException: " + e.getMessage());
        }


        // Call the method to handle the Exception
        handleException(names);


        scanner.close();
    }
}
