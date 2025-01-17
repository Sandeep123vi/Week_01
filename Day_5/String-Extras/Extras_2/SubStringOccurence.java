import java.util.Scanner;
public class SubStringOccurence {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //Input the main string
            System.out.println("Enter the main string: ");
            String mainString = input.nextLine();

            //Input the substring to count
            System.out.println("Enter the substring to count: ");
            String substring = input.nextLine();

            //Count occurrences of the substring
            int count = 0;
            int index = 0;

            while ((index = mainString.indexOf(substring, index)) != -1) {
                count++;
                index += substring.length(); // Move index forward to avoid overlapping counts
            }

            //Output the count
            System.out.println("The substring \"" + substring + "\" occurs " + count + " time(s) in the main string.");
        }

}
