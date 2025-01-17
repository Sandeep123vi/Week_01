import java.util.*;
public class CountVowelsConsonants{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.nextLine();

        int countVowels = 0;
        int countConsonants = 0;
        
        //Loop to count Vowels and Consonants
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                countVowels++;
            }else if(str.charAt(i) != ' '){
                countConsonants++;
            }

        }
        //Printing Result
        System.out.println("Number of Vowels: "+countVowels);
        System.out.println("Number of Consonants: "+countConsonants);
    }
	
}	
