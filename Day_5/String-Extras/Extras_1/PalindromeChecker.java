import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a string to check: ");
        String text = input.next();

        //Calling isPalindrome method to check
        boolean isPal = isPalindrome(text);

        if(isPal){
            System.out.println(text+" is Palindrome");
        }else{
            System.out.println(text+" is not Palindrome");
        }
    }
    //Method to check is string is palindrome
    public static boolean isPalindrome(String text){
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
