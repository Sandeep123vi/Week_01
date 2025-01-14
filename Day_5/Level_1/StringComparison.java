import java.util.Scanner;

class StringComparison{
	public static void main(String [] args){
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		// taking first input 
		System.out.println("Enter first String");
		String firstString = input.next();
		
		// taking second input
		System.out.println("Enter second String");
		String secondString = input.next();
		
		// compare both strings length if length is not equal then both strings are different
		if(firstString.length() != secondString.length()){
			System.out.println("Both strings are different");
		}else{
			// call of compareStrings
			boolean result = compareStrings(firstString, secondString);
		
			// compare both result and display result 
			if( result == true &&(firstString.equals(secondString))==true){
				System.out.println("Both strings are same");
			}else {	
				System.out.println("Both are different");
			}
		}
		//close scanner objectl
		input.close();
	}
	
	// Method to compare strings
	public static boolean compareStrings(String firstString, String secondString){
		
		for(int i = 0; i < firstString.length(); i++){
			if(firstString.charAt(i) != secondString.charAt(i)) 
				return false;
		}
		
		return true;
	}
}