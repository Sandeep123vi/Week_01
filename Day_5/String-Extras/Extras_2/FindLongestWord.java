import java.util.*;

public class FindLongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of Sentence
        System.out.println("Enter a Sentence: ");
        String sentence = input.nextLine();

        //Split the sentence into words
        String wordArray[] = sentence.split(" ");

        //Find the longest word
        String longestWord = "";
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > longestWord.length()) {
                longestWord = wordArray[i];
            }
        }
        //Display Output
        System.out.println("The longest word is: " + longestWord);
    }
}
