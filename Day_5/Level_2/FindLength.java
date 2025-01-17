import java.util.*;


class FindLength {
    // Method to find the Length of the string
    public static int returnLength(String string) {
        int count = 0;
        try {
            while (true) {
                string.charAt(count);
                count++;
            }


        } catch (IndexOutOfBoundsException e) {
            // Exception will be thrown when we exceed the length of the string
            // Do nothing, as we now know the length
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string :");
        String string = input.next();
        // Length of string by using in-built method
        int stringLength = string.length();
        // Length of string by using user- define method
        int returnLength2 = returnLength(string);
        System.out.println("The length of String By using Inbuilt Method: " + stringLength);
        System.out.println("The length of String By using user define Method: " + returnLength2);
        if (stringLength == returnLength2) {
            System.out.println("Both length are same");
        } else {
            System.out.println("Both length are not same");


        }
    }


}
