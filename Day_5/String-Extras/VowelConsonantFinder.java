import java.util.Scanner;

public class VowelConsonantFinder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert input to lowercase for easier comparison
        input = input.toLowerCase();

        int vowelsCount = 0, consonantsCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }
        // Display results
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
    }

}
