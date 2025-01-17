import java.util.*;
import java.util.Arrays;

class FindingAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();

        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();

        Arrays.sort(string1Array);
        Arrays.sort(string2Array);

        if (Arrays.equals(string1Array,string2Array)) {
            System.out.println("Our String are Anagram strings");
        } else {
            System.out.println("Our String are not anagram strings");
        }

    }

}