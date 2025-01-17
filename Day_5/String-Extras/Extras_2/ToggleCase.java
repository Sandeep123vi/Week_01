import java.util.*;

public class ToggleCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input the string
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        //Toggle the case of each character
        StringBuilder toggledString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c); //Keep non-alphabetic characters unchanged
            }
        }

        //Output the result
        System.out.println("Toggled String: " + toggledString);
    }
}

