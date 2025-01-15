import java.util.*;

public class DistanceConversion {
public static void main(String [] args){

    Scanner input= new Scanner(System.in);
    System.out.print("Enter distance in feet: ");
    int distanceFeet = input.nextInt();
    double distanceYards = distanceFeet / 3.0;
    double distanceMiles = distanceYards / 1760;
    System.out.println("The distance in yards is " + distanceYards + " and in miles is " + distanceMiles);

}

}
