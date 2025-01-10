import java.util.Scanner;

public class AthleteTriangularParkRounds {
    public static void main(String [] args ){
        //prompt to create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1 of the triangle: ");
        //prompt for taking value of side1
        int side1 = input.nextInt();
        System.out.print("Enter side2 of the triangle: ");
        //prompt for taking value of side2
        int side2 = input.nextInt();
        System.out.print("Enter side3 of the triangle: ");
         //prompt for taking value of side3
        int side3 = input.nextInt();
        int perimeter = side1 + side2 + side3;
        int totalRounds = (5000 / perimeter);
        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km");

    }
}
