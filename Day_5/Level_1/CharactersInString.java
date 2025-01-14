import java.util.*;

class CharactersInString {
    // Create a method returnCharacter that will return
    // the character array of string
    public static char[] returnCharacter(String string) {

        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
        }

        return ch;
    }

    // create a method that will return boolean value
    // it will compare two character array
    public static boolean toCompareTwostring(char ch[], char ch2[]) {

        if (ch.length != ch2.length) {
            return false;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ch2[i]) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        // create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        String string = input.next();

        char[] ch2 = string.toCharArray();
        char[] ch = returnCharacter(string);
        boolean isSimilar = toCompareTwostring(ch, ch2);
        // Printing results
        System.out.println("First Array: " + Arrays.toString(ch));
        System.out.println("Second Array: " + Arrays.toString(ch2));
        System.out.println("Similar " + isSimilar);

    }

}