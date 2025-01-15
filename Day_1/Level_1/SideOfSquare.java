import java.util.*;

public class SideOfSquare {
    public static void main(String [] args){
    // prompt create Scanner object to take user niput
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the perimeter of the square: ");
    //prompt to take a input from user for perimeter
    int perimeter = input.nextInt();
    int side = perimeter / 4;
    System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

}}
