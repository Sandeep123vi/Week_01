import java.util.*;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a string:");
        String string = input.nextLine();

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
        System.out.println(string.charAt(maxCountIdx));
    }
}
