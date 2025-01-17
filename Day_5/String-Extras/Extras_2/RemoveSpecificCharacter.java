import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a String:");
        String string = input.nextLine();
        String newStr = "";

        int count[] = new int[string.length()];
        int index = 0;
        int currCount = 1;
        int maxCount = 0;
        int maxCountIdx = 0;
        for (int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            for(int j=0;j<string.length();j++){
                if(string.charAt(i) == string.charAt(j)){
                    currCount ++;
                }
            }
            if(maxCount < currCount){
                maxCount = currCount;
                maxCountIdx = i;
            }
            count[index++] = currCount;
            currCount = 0;
        }
        for (int i=0;i<string.length();i++){
            if(string.charAt(maxCountIdx) != string.charAt(i)){
                newStr += string.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
