import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String [] args){
        //prompt create SCanner object to take user input
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the unit price: ");
         //prompt taking a inpur from user of unitprice
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        //prompt taking a inpur from user of quantity
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

    }
}
