public class TrimStringUsingCharAt {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0; // Starting index
        int end = str.length() - 1; // Ending index

        // Loop to find the first non-space character
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Loop to find the last non-space character
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        // If the string contains only spaces, reset indices
        if (start > end) {
            start = 0;
            end = -1;
        }

        // Return the start and end indices in an array
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters at each position
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Input string with leading and trailing spaces
        String input = "   Hello World!   ";

        // Step 1: Trim spaces using custom logic
        int[] trimIndices = trimSpaces(input);
        String trimmedString = "";
        if (trimIndices[1] >= trimIndices[0]) {
            trimmedString = createSubstring(input, trimIndices[0], trimIndices[1]);
        }

        // Step 2: Use built-in trim() method for comparison
        String builtInTrimmed = input.trim();

        // Step 3: Compare the two results
        boolean areEqual = compareStrings(trimmedString, builtInTrimmed);

        // Display the results
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Trimmed String (Custom Logic): \"" + trimmedString + "\"");
        System.out.println("Trimmed String (Built-In Method): \"" + builtInTrimmed + "\"");
        System.out.println("Are both methods producing the same result? " + areEqual);
    }
}