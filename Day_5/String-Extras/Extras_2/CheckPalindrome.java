import java.util.*;
public class CheckPalindrome{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.nextLine();

		String rev = "";
		
		for (int i=str.length()-1;i>=0;i--){
            rev += (str.charAt(i));
        }
		
		boolean isPalindrome = str.equals(rev);
		System.out.println("isPalindrome : "+isPalindrome);

    }	
}	
