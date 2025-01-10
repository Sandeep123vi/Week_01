import java.util.*;

class Doubleopt{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter value for x: ");
        // prompt for taking input by the user 
        double x = input.nextDouble(); 
        System.out.print("Enter value for y: ");
        // prompt for taking input by the user 
        double y = input.nextDouble();
        System.out.print("Enter value for z: ");
        double z = input.nextDouble();
        double doubleResult1 = x + y * z;
        double doubleResult2 = x * y + z;
        double doubleResult3 = z + x / y;
        System.out.println("The results of Double Operations are " + doubleResult1 + ", " + doubleResult2 + ", and " + doubleResult3);

    }

}
