public class NullPointerExceptionDemo {


    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initializing the String variable to null
        // Trying to access a method on the null reference
        System.out.println("Length of the text: " + text.length());
    }


    // Method to demonstrate handling of NullPointerException
    public static void handleException() {
        String text = null; // Initializing the String variable to null
        try {
            // Attempting to access a method on the null reference
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            // Handling the exception and printing an error message
            System.out.println("NullPointerException caught! The variable 'text' is null.");
        }
    }


    // Main method
    public static void main(String[] args) {
        // Calling the method to generate NullPointerException
        System.out.println("Calling generateException() to demonstrate NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            // Handling the exception for demonstration
            System.out.println("Exception caught in main: " + e.getMessage());
        }


        System.out.println("\nCalling handleException() to demonstrate handling of NullPointerException:");
        // Refactoring to handle the NullPointerException properly
        handleException();
    }
}





