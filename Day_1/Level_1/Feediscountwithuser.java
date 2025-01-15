import java.util.*;

public class Feediscountwithuser {
    public static void main(String [] args){
      //prompt to create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        // prompt to take input of fee from user
         double fee = input.nextDouble();
        System.out.print("Enter the discount percent: ");
        // prompt to take input of discount percent from user
        double discountPercent = input.nextDouble();
      double   discount = (fee * discountPercent) / 100.0;
      double   finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

    }
}
