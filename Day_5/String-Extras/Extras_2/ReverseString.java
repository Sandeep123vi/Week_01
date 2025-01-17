import java.util.*;
public class ReverseString{

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.nextLine();

        //Loop to reverse a string
        System.out.print("Reverse String: ");
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }	
}	
