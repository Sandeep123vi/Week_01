import java.util.Scanner;


public class AnagramChecker {


    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of both texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }


        // Create frequency arrays for both texts (assuming ASCII characters)
        int[] frequencyText1 = new int[256];
        int[] frequencyText2 = new int[256];


        // Loop through both texts to count character frequencies
        for (int i = 0; i < text1.length(); i++) {
            frequencyText1[text1.charAt(i)]++;
            frequencyText2[text2.charAt(i)]++;
        }


        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequencyText1[i] != frequencyText2[i]) {
                return false;
            }
        }


        return true;
    }


    // Main method to take user inputs and check if they are anagrams
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first text:");
        String text1 = scanner.nextLine();


        System.out.println("Enter the second text:");
        String text2 = scanner.nextLine();


        boolean result = areAnagrams(text1, text2);


        // Displaying result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }


        scanner.close();
    }
}
