import java.util.*;


public class CreateSubString {


    public static String toCreateSubstring(String string, int startindex, int endingindex) {
        String substring1 ="";
        for (int i = startindex; i < endingindex; i++) {
            substring1 += string.charAt(i);
        }
        return substring1;


    }


    public static boolean compareString(String substring, String substring2) {
        if (substring.length() != substring2.length()) {
            return false;
        }
        if (substring.equals(substring2)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.next();
        System.out.println("Enter the starting index: ");
        int startindex = input.nextInt();
        System.out.println("Enter the Ending index: ");
        int endingindex = input.nextInt();
        String substring2 = string.substring(startindex, endingindex);


       


        String subString=toCreateSubstring(string, startindex, endingindex);
        boolean isSubstringsame = compareString(subString, substring2);
        System.out.println(isSubstringsame);


    }


}


