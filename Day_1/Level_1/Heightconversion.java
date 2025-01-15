import java.util.*;

public class Heightconversion {
    public static void main(String [] args){
        //prompt to create Scanner object to take user input
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        //prompt to take input of height in cm
        double heightCm = input.nextDouble();
        double heightInches = heightCm / 2.54;
        double heightFeet = heightInches / 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int) heightFeet + " and inches is " + (heightInches % 12));

    }
}
