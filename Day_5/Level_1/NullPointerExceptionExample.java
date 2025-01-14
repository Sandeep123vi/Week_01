public class NullPointerExceptionExample {

    // Method to generate NullPointerException
    public static void generateException() {
        // Declare a string variable and initialize it to null
        String text = null;
        
        // Attempt to call a method on the null variable, which will throw NullPointerException
        System.out.println(text.length());  // This will throw NullPointerException
    }

    public static void main(String[] args) {
        try {
            // Call the method to generate the exception
            generateException();
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        
        // Refactored code to handle RuntimeException
        try {
            // Call the method to generate the exception
            generateException();
        } catch (RuntimeException e) {
            // Handle the RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
