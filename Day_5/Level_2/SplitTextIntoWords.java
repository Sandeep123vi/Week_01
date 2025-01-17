import java.util.Scanner;


public class SplitTextIntoWords {


    // Method to find the length of a string without using the built-in length() method
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }


    // Method to split the text into words without using the built-in split() method
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1; // At least one word in the text


        // Count the number of words based on spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }


        // Array to store words
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;


        // Extract words based on spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int end = (i == length - 1) ? i + 1 : i;
                StringBuilder word = new StringBuilder();
                for (int j = start; j < end; j++) {
                    word.append(text.charAt(j));
                }
                words[wordIndex++] = word.toString();
                start = i + 1;
            }
        }
        return words;
    }


    // Method to display an array of words
    public static void displayWords(String[] words, String label) {
        System.out.println(label + ":");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }


    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Take user input
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();


        // Split text using custom method
        String[] customWords = customSplit(text);


        // Split text using built-in split() method
        String[] builtInWords = text.split(" ");


        // Display results
        displayWords(customWords, "Words using custom split");
        displayWords(builtInWords, "Words using built-in split()");


        // Compare results
        boolean areEqual = true;
        if (customWords.length != builtInWords.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < customWords.length; i++) {
                if (!customWords[i].equals(builtInWords[i])) {
                    areEqual = false;
                    break;
                }
            }
        }


        System.out.println("Are the results same: " + areEqual);
        scanner.close();
    }
}


