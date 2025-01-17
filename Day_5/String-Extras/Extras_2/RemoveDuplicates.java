import java.util.*;
public class RemoveDuplicates{	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of String
		String str = input.nextLine();
		String newStr = "";

		//Loop to Iterate through the string
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			boolean isDuplicate = false;

			//Check if the character already exists in the result
			for (int j = 0; j < newStr.length(); j++) {
				if (currentChar == newStr.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}

			//If not a duplicate, append to the result
			if (!isDuplicate) {
				newStr += currentChar;
			}
		}
		System.out.println(newStr.toString());
	}

}	